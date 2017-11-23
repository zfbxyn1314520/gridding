package com.yanan.po;
/**
 * 文化层次--类:小学，初中，高中等等
 * @author ZFB
 *
 */
public class Culture_level {

	private Integer levelId;
	private String levelName;
	
	public Culture_level() {
		super();
	}

	public Culture_level(Integer levelId, String levelName) {
		super();
		this.levelId = levelId;
		this.levelName = levelName;
	}

	@Override
	public String toString() {
		return "Culture_level [levelId=" + levelId + ", levelName=" + levelName + "]";
	}

	public Integer getLevelId() {
		return levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	
}
