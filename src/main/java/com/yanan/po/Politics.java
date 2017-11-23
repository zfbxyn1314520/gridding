package com.yanan.po;
/**
 * 政治面貌：党员，团员，无党派人士，其他等等
 * @author ZFB
 *
 */
public class Politics {

	private Integer politicsId;
	private String politicsName;
	
	public Politics() {
		super();
	}
	public Politics(Integer politicsId, String politicsName) {
		super();
		this.politicsId = politicsId;
		this.politicsName = politicsName;
	}
	@Override
	public String toString() {
		return "Politics [politicsId=" + politicsId + ", politicsName=" + politicsName + "]";
	}
	public Integer getPoliticsId() {
		return politicsId;
	}
	public void setPoliticsId(Integer politicsId) {
		this.politicsId = politicsId;
	}
	public String getPoliticsName() {
		return politicsName;
	}
	public void setPoliticsName(String politicsName) {
		this.politicsName = politicsName;
	}
	
}
