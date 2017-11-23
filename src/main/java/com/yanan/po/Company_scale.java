package com.yanan.po;
/**
 * 公司规模--类
 * 50人以下，50~100人等等
 * @author ZFB
 *
 */
public class Company_scale {

	private Integer scaleId;
	private Integer scaleName;
	
	public Company_scale() {
		super();
	}

	public Company_scale(Integer scaleId, Integer scaleName) {
		super();
		this.scaleId = scaleId;
		this.scaleName = scaleName;
	}

	@Override
	public String toString() {
		return "Company_scale [scaleId=" + scaleId + ", scaleName=" + scaleName + "]";
	}

	public Integer getScaleId() {
		return scaleId;
	}

	public void setScaleId(Integer scaleId) {
		this.scaleId = scaleId;
	}

	public Integer getScaleName() {
		return scaleName;
	}

	public void setScaleName(Integer scaleName) {
		this.scaleName = scaleName;
	}
	
}
