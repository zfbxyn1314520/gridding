package com.yanan.po;
/**
 * 所属民族:汉族，满族，彝族等等
 * @author ZFB
 *
 */
public class Pop_nation {

	private Integer nationId;
	private String nationName;
	
	public Pop_nation() {
		super();
	}
	public Pop_nation(Integer nationId, String nationName) {
		super();
		this.nationId = nationId;
		this.nationName = nationName;
	}
	@Override
	public String toString() {
		return "Pop_nation [nationId=" + nationId + ", nationName=" + nationName + "]";
	}
	public Integer getNationId() {
		return nationId;
	}
	public void setNationId(Integer nationId) {
		this.nationId = nationId;
	}
	public String getNationName() {
		return nationName;
	}
	public void setNationName(String nationName) {
		this.nationName = nationName;
	}
	
}
