package com.yanan.po;
/**
 * 公司什么性质--类
 * 外资，合资，民营等
 * @author ZFB
 *
 */
public class Company_nature {

	private Integer natureId;
	private String natureName;
	
	public Company_nature() {
		super();
	}
	public Company_nature(Integer natureId, String natureName) {
		super();
		this.natureId = natureId;
		this.natureName = natureName;
	}
	@Override
	public String toString() {
		return "Company_nature [natureId=" + natureId + ", natureName=" + natureName + "]";
	}
	public Integer getNatureId() {
		return natureId;
	}
	public void setNatureId(Integer natureId) {
		this.natureId = natureId;
	}
	public String getNatureName() {
		return natureName;
	}
	public void setNatureName(String natureName) {
		this.natureName = natureName;
	}
	
}
