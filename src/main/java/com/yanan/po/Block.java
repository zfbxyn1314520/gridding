package com.yanan.po;

import java.util.Date;

public class Block {
	
	private Integer blockId;
	private Integer courtId;
	private Integer gridStaffId;
	private Integer gridId;
	private String blockName;
	private Integer unitCount;
	private String editBlockName;
	private Date editBlockDate;
	private Integer blockAudit;
	private String blockAdminitor;
	private String blockAminitorTel;
	private Integer houseCount;
	private Integer unitFloorCount;
	private Grid_staff gridStaff;
	private Grid grid;
	private Court court;
	
	public Block() {
		super();
		this.gridStaff = new Grid_staff();
		this.grid = new Grid();
		this.court = new Court();
	}

	public Block(Integer blockId, Integer courtId, Integer gridStaffId, Integer gridId, String blockName,
			Integer unitCount, String editBlockName, Date editBlockDate, Integer blockAudit, String blockAdminitor,
			String blockAminitorTel, Integer houseCount, Integer unitFloorCount, Grid_staff gridStaff, Grid grid,
			Court court) {
		super();
		this.blockId = blockId;
		this.courtId = courtId;
		this.gridStaffId = gridStaffId;
		this.gridId = gridId;
		this.blockName = blockName;
		this.unitCount = unitCount;
		this.editBlockName = editBlockName;
		this.editBlockDate = editBlockDate;
		this.blockAudit = blockAudit;
		this.blockAdminitor = blockAdminitor;
		this.blockAminitorTel = blockAminitorTel;
		this.houseCount = houseCount;
		this.unitFloorCount = unitFloorCount;
		this.gridStaff = gridStaff;
		this.grid = grid;
		this.court = court;
	}

	@Override
	public String toString() {
		return "Block [blockId=" + blockId + ", courtId=" + courtId + ", gridStaffId=" + gridStaffId + ", gridId="
				+ gridId + ", blockName=" + blockName + ", unitCount=" + unitCount + ", editBlockName=" + editBlockName
				+ ", editBlockDate=" + editBlockDate + ", blockAudit=" + blockAudit + ", blockAdminitor="
				+ blockAdminitor + ", blockAminitorTel=" + blockAminitorTel + ", houseCount=" + houseCount
				+ ", unitFloorCount=" + unitFloorCount + ", gridStaff=" + gridStaff + ", grid=" + grid + ", court="
				+ court + "]";
	}

	public Integer getBlockId() {
		return blockId;
	}

	public void setBlockId(Integer blockId) {
		this.blockId = blockId;
	}

	public Integer getCourtId() {
		return courtId;
	}

	public void setCourtId(Integer courtId) {
		this.courtId = courtId;
	}

	public Integer getGridStaffId() {
		return gridStaffId;
	}

	public void setGridStaffId(Integer gridStaffId) {
		this.gridStaffId = gridStaffId;
	}

	public Integer getGridId() {
		return gridId;
	}

	public void setGridId(Integer gridId) {
		this.gridId = gridId;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public Integer getUnitCount() {
		return unitCount;
	}

	public void setUnitCount(Integer unitCount) {
		this.unitCount = unitCount;
	}

	public String getEditBlockName() {
		return editBlockName;
	}

	public void setEditBlockName(String editBlockName) {
		this.editBlockName = editBlockName;
	}

	public Date getEditBlockDate() {
		return editBlockDate;
	}

	public void setEditBlockDate(Date editBlockDate) {
		this.editBlockDate = editBlockDate;
	}

	public Integer getBlockAudit() {
		return blockAudit;
	}

	public void setBlockAudit(Integer blockAudit) {
		this.blockAudit = blockAudit;
	}

	public String getBlockAdminitor() {
		return blockAdminitor;
	}

	public void setBlockAdminitor(String blockAdminitor) {
		this.blockAdminitor = blockAdminitor;
	}

	public String getBlockAminitorTel() {
		return blockAminitorTel;
	}

	public void setBlockAminitorTel(String blockAminitorTel) {
		this.blockAminitorTel = blockAminitorTel;
	}

	public Integer getHouseCount() {
		return houseCount;
	}

	public void setHouseCount(Integer houseCount) {
		this.houseCount = houseCount;
	}

	public Integer getUnitFloorCount() {
		return unitFloorCount;
	}

	public void setUnitFloorCount(Integer unitFloorCount) {
		this.unitFloorCount = unitFloorCount;
	}

	public Grid_staff getGridStaff() {
		return gridStaff;
	}

	public void setGridStaff(Grid_staff gridStaff) {
		this.gridStaff = gridStaff;
	}

	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	public Court getCourt() {
		return court;
	}

	public void setCourt(Court court) {
		this.court = court;
	}
	
}
