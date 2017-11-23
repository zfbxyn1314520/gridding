package com.yanan.po;
/**
 * Menu和Per的关联类
 * 一个perId关联多个MenuId
 * @author ZFB
 *
 */
public class Menu_per {
	private Integer perId;
	private Integer menuId;
	
	public Menu_per() {
		super();
	}

	public Menu_per(Integer perId, Integer menuId) {
		super();
		this.perId = perId;
		this.menuId = menuId;
	}

	@Override
	public String toString() {
		return "Menu_per [perId=" + perId + ", menuId=" + menuId + "]";
	}

	public Integer getPerId() {
		return perId;
	}

	public void setPerId(Integer perId) {
		this.perId = perId;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	
}
