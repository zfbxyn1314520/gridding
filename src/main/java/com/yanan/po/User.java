package com.yanan.po;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户类
 * @author ZFB
 *
 */
public class User implements Serializable {
	private Integer userId;
	private Integer roleId;
	private Integer areaId;
	private String userName;
	private String realName;
	private String password;
	private String headIcon;
	private String mobileTel;
	private String officeTel;
	private String editUserName;
	private Date editUserDate;
	private Integer user_enable;
	private Date user_last_login;
	private String user_login_ip;
	
	private Area area;
	private Role role;
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", roleId=" + roleId + ", areaId=" + areaId + ", userName=" + userName
				+ ", realName=" + realName + ", password=" + password + ", headIcon=" + headIcon + ", mobileTel="
				+ mobileTel + ", officeTel=" + officeTel + ", editUserName=" + editUserName + ", editUserDate="
				+ editUserDate + ", user_enable=" + user_enable + ", user_last_login=" + user_last_login
				+ ", user_login_ip=" + user_login_ip + ", area=" + area + ", role=" + role + "]";
	}
	public User(Integer userId, Integer roleId, Integer areaId, String userName, String realName, String password,
			String headIcon, String mobileTel, String officeTel, String editUserName, Date editUserDate,
			Integer user_enable, Date user_last_login, String user_login_ip, Area area, Role role) {
		super();
		this.userId = userId;
		this.roleId = roleId;
		this.areaId = areaId;
		this.userName = userName;
		this.realName = realName;
		this.password = password;
		this.headIcon = headIcon;
		this.mobileTel = mobileTel;
		this.officeTel = officeTel;
		this.editUserName = editUserName;
		this.editUserDate = editUserDate;
		this.user_enable = user_enable;
		this.user_last_login = user_last_login;
		this.user_login_ip = user_login_ip;
		this.area = area;
		this.role = role;
	}
	public User() {
		super();
		this.area = area;
		this.role = role;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHeadIcon() {
		return headIcon;
	}
	public void setHeadIcon(String headIcon) {
		this.headIcon = headIcon;
	}
	public String getMobileTel() {
		return mobileTel;
	}
	public void setMobileTel(String mobileTel) {
		this.mobileTel = mobileTel;
	}
	public String getOfficeTel() {
		return officeTel;
	}
	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}
	public String getEditUserName() {
		return editUserName;
	}
	public void setEditUserName(String editUserName) {
		this.editUserName = editUserName;
	}
	public Date getEditUserDate() {
		return editUserDate;
	}
	public void setEditUserDate(Date editUserDate) {
		this.editUserDate = editUserDate;
	}
	public Integer getUser_enable() {
		return user_enable;
	}
	public void setUser_enable(Integer user_enable) {
		this.user_enable = user_enable;
	}
	public Date getUser_last_login() {
		return user_last_login;
	}
	public void setUser_last_login(Date user_last_login) {
		this.user_last_login = user_last_login;
	}
	public String getUser_login_ip() {
		return user_login_ip;
	}
	public void setUser_login_ip(String user_login_ip) {
		this.user_login_ip = user_login_ip;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
	
}
