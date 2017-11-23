package com.yanan.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yanan.po.User;
import com.yanan.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserAction extends CommonAction{

	@Autowired
	private UserService userService;
	
	/**
	 * 用户登录
	 * @param request
	 * @param response
	 * @param user
	 * @return  statusCode：200成功，300失败
	 */
	@SuppressWarnings("unused")
	@RequestMapping(value="/login")
	@ResponseBody
	public String userLogin(HttpServletRequest request,HttpServletResponse response,
			User user) {
		System.out.println("user"+user.getUserName());
		User u = this.userService.validateUser(user);
		System.out.println("u:"+u.getUserName());
		if(u!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", u);
			session.setMaxInactiveInterval(1800);
			/*MDC.put("userId", u.getUserId());
			MDC.put("logIP", u.getUser_login_ip());*/
			this.logger.info("用户登录成功(PC端)！~");
			return "{\"statusCode\":200,\"message\":\"用户登录成功！\"}";
		}else {
			return "{\"statusCode\":300,\"message\":\"用户名或者密码错误！登陆失败！\"}";
		}
	}
	
}
