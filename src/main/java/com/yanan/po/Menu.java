package com.yanan.po;

import java.util.ArrayList;
import java.util.List;
/**
 * 菜单目录（我的主页，系统设置，辖区概况，业务工作等等）
 * @author ZFB
 *
 */
public class Menu {
	private Integer menuId;
	private Integer parentMenuId;
	private String menuName;
	private String menuUri;
	private String menuIco;
	private List<Permission> permissions;
	
	public Menu() {
		super();
		this.permissions = new ArrayList<Permission>();
	}

	public Menu(Integer menuId, Integer parentMenuId, String menuName, String menuUri, String menuIco,
			List<Permission> permissions) {
		super();
		this.menuId = menuId;
		this.parentMenuId = parentMenuId;
		this.menuName = menuName;
		this.menuUri = menuUri;
		this.menuIco = menuIco;
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", parentMenuId=" + parentMenuId + ", menuName=" + menuName + ", menuUri="
				+ menuUri + ", menuIco=" + menuIco + ", permissions=" + permissions + "]";
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public Integer getParentMenuId() {
		return parentMenuId;
	}

	public void setParentMenuId(Integer parentMenuId) {
		this.parentMenuId = parentMenuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuUri() {
		return menuUri;
	}

	public void setMenuUri(String menuUri) {
		this.menuUri = menuUri;
	}

	public String getMenuIco() {
		return menuIco;
	}

	public void setMenuIco(String menuIco) {
		this.menuIco = menuIco;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	
}
