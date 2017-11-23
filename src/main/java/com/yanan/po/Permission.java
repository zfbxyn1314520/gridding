package com.yanan.po;
/**
 * 权限（添加，编辑，删除，查看等等）
 * @author ZFB
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Permission {
	private Integer perId;
	private String perName;
	//一个权限对应多个菜单，一对多关联关系
	private List<Menu_per> menuPer;
	
	public Permission() {
		super();
		this.menuPer = new ArrayList<Menu_per>();
	}

	public Permission(Integer perId, String perName, List<Menu_per> menuPer) {
		super();
		this.perId = perId;
		this.perName = perName;
		this.menuPer = menuPer;
	}

	@Override
	public String toString() {
		return "Permission [perId=" + perId + ", perName=" + perName + ", menuPer=" + menuPer + "]";
	}

	public Integer getPerId() {
		return perId;
	}

	public void setPerId(Integer perId) {
		this.perId = perId;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public List<Menu_per> getMenuPer() {
		return menuPer;
	}

	public void setMenuPer(List<Menu_per> menuPer) {
		this.menuPer = menuPer;
	}
	
}
