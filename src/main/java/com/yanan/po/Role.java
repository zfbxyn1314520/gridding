package com.yanan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * 角色类（社区网格员，社区网格长，社区管理员，系统管理员等等）
 * @author ZFB
 *
 */
public class Role {
	private Integer roleId;
	private String roleName;
	private String roleMemo;
	private String editRoleName;
	private Date editRoleDate;
	private Integer role_enable;
	private Integer roleLevel;
	private Integer userCount;
	private List<Menu> menus;//菜单
	private List<Permission> permissions;//权限
	
	public Role() {
		super();
		this.menus = new ArrayList<Menu>();
		this.permissions = new ArrayList<Permission>();
	}

	public Role(Integer roleId, String roleName, String roleMemo, String editRoleName, Date editRoleDate,
			Integer role_enable, Integer roleLevel, Integer userCount, List<Menu> menus, List<Permission> permissions) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleMemo = roleMemo;
		this.editRoleName = editRoleName;
		this.editRoleDate = editRoleDate;
		this.role_enable = role_enable;
		this.roleLevel = roleLevel;
		this.userCount = userCount;
		this.menus = menus;
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", roleMemo=" + roleMemo + ", editRoleName="
				+ editRoleName + ", editRoleDate=" + editRoleDate + ", role_enable=" + role_enable + ", roleLevel="
				+ roleLevel + ", userCount=" + userCount + ", menus=" + menus + ", permissions=" + permissions + "]";
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleMemo() {
		return roleMemo;
	}

	public void setRoleMemo(String roleMemo) {
		this.roleMemo = roleMemo;
	}

	public String getEditRoleName() {
		return editRoleName;
	}

	public void setEditRoleName(String editRoleName) {
		this.editRoleName = editRoleName;
	}

	public Date getEditRoleDate() {
		return editRoleDate;
	}

	public void setEditRoleDate(Date editRoleDate) {
		this.editRoleDate = editRoleDate;
	}

	public Integer getRole_enable() {
		return role_enable;
	}

	public void setRole_enable(Integer role_enable) {
		this.role_enable = role_enable;
	}

	public Integer getRoleLevel() {
		return roleLevel;
	}

	public void setRoleLevel(Integer roleLevel) {
		this.roleLevel = roleLevel;
	}

	public Integer getUserCount() {
		return userCount;
	}

	public void setUserCount(Integer userCount) {
		this.userCount = userCount;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	
}
