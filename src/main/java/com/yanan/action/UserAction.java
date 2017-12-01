package com.yanan.action;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yanan.po.Menu;
import com.yanan.po.Role;
import com.yanan.po.Role_per;
import com.yanan.po.User;
import com.yanan.service.MenuService;
import com.yanan.service.RoleService;
import com.yanan.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserAction extends CommonAction{

	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private MenuService menuService;
	
	
	/**
	 * 用户登录
	 * @param request
	 * @param response
	 * @param user
	 * @return  statusCode：200成功，300失败
	 */
	@RequestMapping(value="/login")
	@ResponseBody
	public String userLogin(HttpServletRequest request,HttpServletResponse response,
			User u) {
		
		User user = this.userService.validateUser(u);
		HttpSession session = request.getSession();
		if(user!=null) {
			String loginIP = getIpAddr(request);
			user.setUser_last_login(new Date());
			user.setUser_login_ip(loginIP);
			Integer roleId = user.getRoleId();
			this.userService.updateUserLoginInfo(getIpAddr(request), new Date(), user.getUserId());
			Role role = this.roleService.getRoleById(roleId);
			if(role!=null) {
				user.setRole(role);	
			}
			session.setAttribute("user", user);
			session.setMaxInactiveInterval(1800);
			MDC.put("userId", user.getUserId());
			MDC.put("logIP", user.getUser_login_ip());
			this.logger.info("用户登录成功(PC端)！~");
			return "{\"statusCode\":200,\"message\":\"用户登录成功！\"}";
		}else {
			return "{\"statusCode\":300,\"message\":\"用户名或者密码错误！登陆失败！\"}";
		}
	}
	
	/**
	 * 获取当前用户下的菜单选项
	 * @param request
	 * @return
	 */
	@RequestMapping("/getUserPerMenu")
	@ResponseBody
	public List<Menu> getUserPerMenu(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if(user!=null) {
			List<Menu> menus = this.menuService.getAllMenu();
			Integer menuId = 0;
			Iterator<Menu> lists = menus.iterator();
			while(lists.hasNext()) {
				Menu menu = lists.next();
				if(menu.getParentMenuId()!=null) {
					menuId = menu.getMenuId();
					List<Role_per> rolePer = this.userService.getUserPerMenu(user, menuId);
					if(rolePer.size()==0) {
						lists.remove();
					}
					menuId = 0;
				}
			}
			
			Iterator<Menu> list = menus.iterator();
			while(list.hasNext()) {
				Menu menu = list.next();
				if(menu.getParentMenuId()==null) {
					Integer row = 0;
					if(menu.getMenuName().equals("我的主页")) {
						continue;
					}
					for(int i=0;i<menus.size();i++) {
						if(menus.get(i).getParentMenuId()==menu.getMenuId()) {
							row++;
						}
					}
					if(row==0) {
						list.remove();
					}else {
						row = 0;
					}
				}
			}			
			return menus;
		}else {
			return null;
		}
	}
	
	
	
	
}
