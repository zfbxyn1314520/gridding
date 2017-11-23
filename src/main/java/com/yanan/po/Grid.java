package com.yanan.po;

import java.util.Date;

public class Grid {

	private Integer gridId;
	private Integer areaId;
	private String gridName;
	private String gridScope;
	private String editGridName;
	private Date editGridDate;
	private Integer gridAudit;
	private Integer gridStaffCount;
	private String gridAdmintor;
	private Area area;
	
	public Grid() {
		super();
		this.area = new Area();
	}

	public Grid(Integer gridId, Integer areaId, String gridName, String gridScope, String editGridName,
			Date editGridDate, Integer gridAudit, Integer gridStaffCount, String gridAdmintor, Area area) {
		super();
		this.gridId = gridId;
		this.areaId = areaId;
		this.gridName = gridName;
		this.gridScope = gridScope;
		this.editGridName = editGridName;
		this.editGridDate = editGridDate;
		this.gridAudit = gridAudit;
		this.gridStaffCount = gridStaffCount;
		this.gridAdmintor = gridAdmintor;
		this.area = area;
	}

	@Override
	public String toString() {
		return "Grid [gridId=" + gridId + ", areaId=" + areaId + ", gridName=" + gridName + ", gridScope=" + gridScope
				+ ", editGridName=" + editGridName + ", editGridDate=" + editGridDate + ", gridAudit=" + gridAudit
				+ ", gridStaffCount=" + gridStaffCount + ", gridAdmintor=" + gridAdmintor + ", area=" + area + "]";
	}

	public Integer getGridId() {
		return gridId;
	}

	public void setGridId(Integer gridId) {
		this.gridId = gridId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getGridName() {
		return gridName;
	}

	public void setGridName(String gridName) {
		this.gridName = gridName;
	}

	public String getGridScope() {
		return gridScope;
	}

	public void setGridScope(String gridScope) {
		this.gridScope = gridScope;
	}

	public String getEditGridName() {
		return editGridName;
	}

	public void setEditGridName(String editGridName) {
		this.editGridName = editGridName;
	}

	public Date getEditGridDate() {
		return editGridDate;
	}

	public void setEditGridDate(Date editGridDate) {
		this.editGridDate = editGridDate;
	}

	public Integer getGridAudit() {
		return gridAudit;
	}

	public void setGridAudit(Integer gridAudit) {
		this.gridAudit = gridAudit;
	}

	public Integer getGridStaffCount() {
		return gridStaffCount;
	}

	public void setGridStaffCount(Integer gridStaffCount) {
		this.gridStaffCount = gridStaffCount;
	}

	public String getGridAdmintor() {
		return gridAdmintor;
	}

	public void setGridAdmintor(String gridAdmintor) {
		this.gridAdmintor = gridAdmintor;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
}
