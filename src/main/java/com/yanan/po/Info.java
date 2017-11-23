package com.yanan.po;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Info {

	private Integer infoId;
	private Integer infoTypeId;
	private Integer areaId;
	private String infoTitle;
	private String infoEditor;
	@DateTimeFormat(pattern="yyyy年MM月dd日 HH:mm:ss")
	private Date infoEditDate;
	private String infoContent;
	
	private Info_type infoType;
	private Area area;
	
	public Info() {
		super();
		this.area = new Area();
		this.infoType = new Info_type();
	}
	public Info(Integer infoId, Integer infoTypeId, Integer areaId, String infoTitle, String infoEditor,
			Date infoEditDate, String infoContent, Info_type infoType, Area area) {
		super();
		this.infoId = infoId;
		this.infoTypeId = infoTypeId;
		this.areaId = areaId;
		this.infoTitle = infoTitle;
		this.infoEditor = infoEditor;
		this.infoEditDate = infoEditDate;
		this.infoContent = infoContent;
		this.infoType = infoType;
		this.area = area;
	}
	@Override
	public String toString() {
		return "Info [infoId=" + infoId + ", infoTypeId=" + infoTypeId + ", areaId=" + areaId + ", infoTitle="
				+ infoTitle + ", infoEditor=" + infoEditor + ", infoEditDate=" + infoEditDate + ", infoContent="
				+ infoContent + ", infoType=" + infoType + ", area=" + area + "]";
	}
	public Integer getInfoId() {
		return infoId;
	}
	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}
	public Integer getInfoTypeId() {
		return infoTypeId;
	}
	public void setInfoTypeId(Integer infoTypeId) {
		this.infoTypeId = infoTypeId;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getInfoTitle() {
		return infoTitle;
	}
	public void setInfoTitle(String infoTitle) {
		this.infoTitle = infoTitle;
	}
	public String getInfoEditor() {
		return infoEditor;
	}
	public void setInfoEditor(String infoEditor) {
		this.infoEditor = infoEditor;
	}
	public Date getInfoEditDate() {
		return infoEditDate;
	}
	public void setInfoEditDate(Date infoEditDate) {
		this.infoEditDate = infoEditDate;
	}
	public String getInfoContent() {
		return infoContent;
	}
	public void setInfoContent(String infoContent) {
		this.infoContent = infoContent;
	}
	public Info_type getInfoType() {
		return infoType;
	}
	public void setInfoType(Info_type infoType) {
		this.infoType = infoType;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	
}
