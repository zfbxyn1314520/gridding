package com.yanan.po;
/**
 * 公共设施类型
 * @author ZFB
 *
 */
public class Facilities_type {

	private Integer facilitiesTypeId;
	private Integer facilitiesTypePerId;
	private String facilitiesName;
	
	public Facilities_type() {
		super();
	}

	public Facilities_type(Integer facilitiesTypeId, Integer facilitiesTypePerId, String facilitiesName) {
		super();
		this.facilitiesTypeId = facilitiesTypeId;
		this.facilitiesTypePerId = facilitiesTypePerId;
		this.facilitiesName = facilitiesName;
	}

	@Override
	public String toString() {
		return "Facilities_type [facilitiesTypeId=" + facilitiesTypeId + ", facilitiesTypePerId=" + facilitiesTypePerId
				+ ", facilitiesName=" + facilitiesName + "]";
	}

	public Integer getFacilitiesTypeId() {
		return facilitiesTypeId;
	}

	public void setFacilitiesTypeId(Integer facilitiesTypeId) {
		this.facilitiesTypeId = facilitiesTypeId;
	}

	public Integer getFacilitiesTypePerId() {
		return facilitiesTypePerId;
	}

	public void setFacilitiesTypePerId(Integer facilitiesTypePerId) {
		this.facilitiesTypePerId = facilitiesTypePerId;
	}

	public String getFacilitiesName() {
		return facilitiesName;
	}

	public void setFacilitiesName(String facilitiesName) {
		this.facilitiesName = facilitiesName;
	}
	
}
