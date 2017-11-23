package com.yanan.po;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 公共设施--类
 * @author ZFB
 *
 */
public class Facilities {

	private Integer facilitiesId;
	private Integer areaId;
	private Integer facilitiesTypeId;
	private String facilitiesName;
	private String facilitiesSite;
	private String facilitiesPic;
	private Integer facilitiesAudit;
	@DateTimeFormat(pattern="yyyy年MM月dd日 HH:mm:ss")
	private Date editFacilitiesDate;
	private String editFacilitiesName;
	
	private Area area;
	private Facilities_type facilitiesType;
	
	public Facilities() {
		super();
		this.area = new Area();
		this.facilitiesType = new Facilities_type();
	}

	public Facilities(Integer facilitiesId, Integer areaId, Integer facilitiesTypeId, String facilitiesName,
			String facilitiesSite, String facilitiesPic, Integer facilitiesAudit, Date editFacilitiesDate,
			String editFacilitiesName, Area area, Facilities_type facilitiesType) {
		super();
		this.facilitiesId = facilitiesId;
		this.areaId = areaId;
		this.facilitiesTypeId = facilitiesTypeId;
		this.facilitiesName = facilitiesName;
		this.facilitiesSite = facilitiesSite;
		this.facilitiesPic = facilitiesPic;
		this.facilitiesAudit = facilitiesAudit;
		this.editFacilitiesDate = editFacilitiesDate;
		this.editFacilitiesName = editFacilitiesName;
		this.area = area;
		this.facilitiesType = facilitiesType;
	}

	@Override
	public String toString() {
		return "Facilities [facilitiesId=" + facilitiesId + ", areaId=" + areaId + ", facilitiesTypeId="
				+ facilitiesTypeId + ", facilitiesName=" + facilitiesName + ", facilitiesSite=" + facilitiesSite
				+ ", facilitiesPic=" + facilitiesPic + ", facilitiesAudit=" + facilitiesAudit + ", editFacilitiesDate="
				+ editFacilitiesDate + ", editFacilitiesName=" + editFacilitiesName + ", area=" + area
				+ ", facilitiesType=" + facilitiesType + "]";
	}

	public Integer getFacilitiesId() {
		return facilitiesId;
	}

	public void setFacilitiesId(Integer facilitiesId) {
		this.facilitiesId = facilitiesId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Integer getFacilitiesTypeId() {
		return facilitiesTypeId;
	}

	public void setFacilitiesTypeId(Integer facilitiesTypeId) {
		this.facilitiesTypeId = facilitiesTypeId;
	}

	public String getFacilitiesName() {
		return facilitiesName;
	}

	public void setFacilitiesName(String facilitiesName) {
		this.facilitiesName = facilitiesName;
	}

	public String getFacilitiesSite() {
		return facilitiesSite;
	}

	public void setFacilitiesSite(String facilitiesSite) {
		this.facilitiesSite = facilitiesSite;
	}

	public String getFacilitiesPic() {
		return facilitiesPic;
	}

	public void setFacilitiesPic(String facilitiesPic) {
		this.facilitiesPic = facilitiesPic;
	}

	public Integer getFacilitiesAudit() {
		return facilitiesAudit;
	}

	public void setFacilitiesAudit(Integer facilitiesAudit) {
		this.facilitiesAudit = facilitiesAudit;
	}

	public Date getEditFacilitiesDate() {
		return editFacilitiesDate;
	}

	public void setEditFacilitiesDate(Date editFacilitiesDate) {
		this.editFacilitiesDate = editFacilitiesDate;
	}

	public String getEditFacilitiesName() {
		return editFacilitiesName;
	}

	public void setEditFacilitiesName(String editFacilitiesName) {
		this.editFacilitiesName = editFacilitiesName;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Facilities_type getFacilitiesType() {
		return facilitiesType;
	}

	public void setFacilitiesType(Facilities_type facilitiesType) {
		this.facilitiesType = facilitiesType;
	}
	
}
