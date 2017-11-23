package com.yanan.po;
/**
 * 婚姻状况类:未婚，已婚，离婚，丧偶
 * @author ZFB
 *
 */
public class Marriage_status {

	private Integer marriageId;
	private String marriageName;
	
	public Marriage_status() {
		super();
	}
	public Marriage_status(Integer marriageId, String marriageName) {
		super();
		this.marriageId = marriageId;
		this.marriageName = marriageName;
	}
	@Override
	public String toString() {
		return "Marriage_status [marriageId=" + marriageId + ", marriageName=" + marriageName + "]";
	}
	public Integer getMarriageId() {
		return marriageId;
	}
	public void setMarriageId(Integer marriageId) {
		this.marriageId = marriageId;
	}
	public String getMarriageName() {
		return marriageName;
	}
	public void setMarriageName(String marriageName) {
		this.marriageName = marriageName;
	}
	
}
