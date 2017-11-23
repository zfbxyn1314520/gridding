package com.yanan.po;

import java.util.Date;

public class House {
	
	private Integer houseId;
	private Integer statusId;
	private Integer typeId;
	private Integer unitId;
	private String houseNum;
	private String houseSite;
	private String editHouseName;
	private Date editHouseDate;
	private Integer houseAudit;
	private String houseHolder;
	private House_status houseStatus;
	private House_type houseType;
	private Unit unit;
	
	public House() {
		super();
		this.houseStatus = new House_status();
		this.houseType = new House_type();
		this.unit = new Unit();
	}

	public House(Integer houseId, Integer statusId, Integer typeId, Integer unitId, String houseNum, String houseSite,
			String editHouseName, Date editHouseDate, Integer houseAudit, String houseHolder, House_status houseStatus,
			House_type houseType, Unit unit) {
		super();
		this.houseId = houseId;
		this.statusId = statusId;
		this.typeId = typeId;
		this.unitId = unitId;
		this.houseNum = houseNum;
		this.houseSite = houseSite;
		this.editHouseName = editHouseName;
		this.editHouseDate = editHouseDate;
		this.houseAudit = houseAudit;
		this.houseHolder = houseHolder;
		this.houseStatus = houseStatus;
		this.houseType = houseType;
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "House [houseId=" + houseId + ", statusId=" + statusId + ", typeId=" + typeId + ", unitId=" + unitId
				+ ", houseNum=" + houseNum + ", houseSite=" + houseSite + ", editHouseName=" + editHouseName
				+ ", editHouseDate=" + editHouseDate + ", houseAudit=" + houseAudit + ", houseHolder=" + houseHolder
				+ ", houseStatus=" + houseStatus + ", houseType=" + houseType + ", unit=" + unit + "]";
	}

	public Integer getHouseId() {
		return houseId;
	}

	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getUnitId() {
		return unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	public String getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	public String getHouseSite() {
		return houseSite;
	}

	public void setHouseSite(String houseSite) {
		this.houseSite = houseSite;
	}

	public String getEditHouseName() {
		return editHouseName;
	}

	public void setEditHouseName(String editHouseName) {
		this.editHouseName = editHouseName;
	}

	public Date getEditHouseDate() {
		return editHouseDate;
	}

	public void setEditHouseDate(Date editHouseDate) {
		this.editHouseDate = editHouseDate;
	}

	public Integer getHouseAudit() {
		return houseAudit;
	}

	public void setHouseAudit(Integer houseAudit) {
		this.houseAudit = houseAudit;
	}

	public String getHouseHolder() {
		return houseHolder;
	}

	public void setHouseHolder(String houseHolder) {
		this.houseHolder = houseHolder;
	}

	public House_status getHouseStatus() {
		return houseStatus;
	}

	public void setHouseStatus(House_status houseStatus) {
		this.houseStatus = houseStatus;
	}

	public House_type getHouseType() {
		return houseType;
	}

	public void setHouseType(House_type houseType) {
		this.houseType = houseType;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
}
