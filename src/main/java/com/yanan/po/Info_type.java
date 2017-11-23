package com.yanan.po;
/**
 * 信息类别：辖区介绍，组织框架
 * @author ZFB
 *
 */
public class Info_type {

	private Integer infoTypeId;
	private String infoTypeName;
	
	public Info_type() {
		super();
	}
	public Info_type(Integer infoTypeId, String infoTypeName) {
		super();
		this.infoTypeId = infoTypeId;
		this.infoTypeName = infoTypeName;
	}
	@Override
	public String toString() {
		return "Info_type [infoTypeId=" + infoTypeId + ", infoTypeName=" + infoTypeName + "]";
	}
	public Integer getInfoTypeId() {
		return infoTypeId;
	}
	public void setInfoTypeId(Integer infoTypeId) {
		this.infoTypeId = infoTypeId;
	}
	public String getInfoTypeName() {
		return infoTypeName;
	}
	public void setInfoTypeName(String infoTypeName) {
		this.infoTypeName = infoTypeName;
	}
	
}
