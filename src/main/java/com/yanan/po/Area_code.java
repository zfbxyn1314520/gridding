package com.yanan.po;

public class Area_code {

	private Integer areaCodeId;
	private Long areaCodeNum;
	private String areaCodeName;
	
	public Area_code() {
		super();
	}

	public Area_code(Integer areaCodeId, Long areaCodeNum, String areaCodeName) {
		super();
		this.areaCodeId = areaCodeId;
		this.areaCodeNum = areaCodeNum;
		this.areaCodeName = areaCodeName;
	}

	@Override
	public String toString() {
		return "Area_code [areaCodeId=" + areaCodeId + ", areaCodeNum=" + areaCodeNum + ", areaCodeName=" + areaCodeName
				+ "]";
	}

	public Integer getAreaCodeId() {
		return areaCodeId;
	}

	public void setAreaCodeId(Integer areaCodeId) {
		this.areaCodeId = areaCodeId;
	}

	public Long getAreaCodeNum() {
		return areaCodeNum;
	}

	public void setAreaCodeNum(Long areaCodeNum) {
		this.areaCodeNum = areaCodeNum;
	}

	public String getAreaCodeName() {
		return areaCodeName;
	}

	public void setAreaCodeName(String areaCodeName) {
		this.areaCodeName = areaCodeName;
	}
}
