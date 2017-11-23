package com.yanan.po;

import java.util.Date;

public class Court {

	private Integer courtId;
	private Integer areaId;
	//街区名
	private String courtName;
	//物管公司名
	private String propertyName;
	private String courtSit;
	private String courtArea;
	private Integer blockCount;
	private String editCourtName;
	private Date editCourtDate;
	private Integer courtAudit;
	private String courtPic;
	private Area area;
	
	public Court() {
		super();
		this.area = new Area();
	}

	public Court(Integer courtId, Integer areaId, String courtName, String propertyName, String courtSit,
			String courtArea, Integer blockCount, String editCourtName, Date editCourtDate, Integer courtAudit,
			String courtPic, Area area) {
		super();
		this.courtId = courtId;
		this.areaId = areaId;
		this.courtName = courtName;
		this.propertyName = propertyName;
		this.courtSit = courtSit;
		this.courtArea = courtArea;
		this.blockCount = blockCount;
		this.editCourtName = editCourtName;
		this.editCourtDate = editCourtDate;
		this.courtAudit = courtAudit;
		this.courtPic = courtPic;
		this.area = area;
	}

	@Override
	public String toString() {
		return "Court [courtId=" + courtId + ", areaId=" + areaId + ", courtName=" + courtName + ", propertyName="
				+ propertyName + ", courtSit=" + courtSit + ", courtArea=" + courtArea + ", blockCount=" + blockCount
				+ ", editCourtName=" + editCourtName + ", editCourtDate=" + editCourtDate + ", courtAudit=" + courtAudit
				+ ", courtPic=" + courtPic + ", area=" + area + "]";
	}

	public Integer getCourtId() {
		return courtId;
	}

	public void setCourtId(Integer courtId) {
		this.courtId = courtId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getCourtName() {
		return courtName;
	}

	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getCourtSit() {
		return courtSit;
	}

	public void setCourtSit(String courtSit) {
		this.courtSit = courtSit;
	}

	public String getCourtArea() {
		return courtArea;
	}

	public void setCourtArea(String courtArea) {
		this.courtArea = courtArea;
	}

	public Integer getBlockCount() {
		return blockCount;
	}

	public void setBlockCount(Integer blockCount) {
		this.blockCount = blockCount;
	}

	public String getEditCourtName() {
		return editCourtName;
	}

	public void setEditCourtName(String editCourtName) {
		this.editCourtName = editCourtName;
	}

	public Date getEditCourtDate() {
		return editCourtDate;
	}

	public void setEditCourtDate(Date editCourtDate) {
		this.editCourtDate = editCourtDate;
	}

	public Integer getCourtAudit() {
		return courtAudit;
	}

	public void setCourtAudit(Integer courtAudit) {
		this.courtAudit = courtAudit;
	}

	public String getCourtPic() {
		return courtPic;
	}

	public void setCourtPic(String courtPic) {
		this.courtPic = courtPic;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
}
