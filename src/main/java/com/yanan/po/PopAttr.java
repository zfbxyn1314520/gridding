package com.yanan.po;
/**
 * 人口属性--团员，工会会员，社区矫正人员，文联会员，归国华侨，留学人员，低保人员，五保人员，
 * 下岗职工，单亲家庭，退伍军人等等。
 * @author ZFB
 *
 */
public class PopAttr {

	private Integer popAttrId;
	private String popAttrName;
	
	public PopAttr() {
		super();
	}
	public PopAttr(Integer popAttrId, String popAttrName) {
		super();
		this.popAttrId = popAttrId;
		this.popAttrName = popAttrName;
	}
	@Override
	public String toString() {
		return "PopAttr [popAttrId=" + popAttrId + ", popAttrName=" + popAttrName + "]";
	}
	public Integer getPopAttrId() {
		return popAttrId;
	}
	public void setPopAttrId(Integer popAttrId) {
		this.popAttrId = popAttrId;
	}
	public String getPopAttrName() {
		return popAttrName;
	}
	public void setPopAttrName(String popAttrName) {
		this.popAttrName = popAttrName;
	}
	
}
