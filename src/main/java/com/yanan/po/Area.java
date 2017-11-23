package com.yanan.po;

import java.util.ArrayList;
import java.util.List;
/**
 * 区域类（中国的各个城市名称）
 * @author ZFB
 *
 */
public class Area {
	private Integer areaId;
	//当前城市的编码
	private Long areaCode;
	//父城市的编码
	private Long areaParentCode;
	private String areaName;
	//城市名称的缩写
	private String shortName;
	//城市的级别
	private Integer areaLevel;
	//区域的子节点
	private List<Area> nodes;
	
	public Area() {
		super();
		this.nodes = new ArrayList<Area>();
	}

	public Area(Integer areaId, Long areaCode, Long areaParentCode, String areaName, String shortName,
			Integer areaLevel, List<Area> nodes) {
		super();
		this.areaId = areaId;
		this.areaCode = areaCode;
		this.areaParentCode = areaParentCode;
		this.areaName = areaName;
		this.shortName = shortName;
		this.areaLevel = areaLevel;
		this.nodes = nodes;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Long getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Long areaCode) {
		this.areaCode = areaCode;
	}

	public Long getAreaParentCode() {
		return areaParentCode;
	}

	public void setAreaParentCode(Long areaParentCode) {
		this.areaParentCode = areaParentCode;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Integer getAreaLevel() {
		return areaLevel;
	}

	public void setAreaLevel(Integer areaLevel) {
		this.areaLevel = areaLevel;
	}

	public List<Area> getNodes() {
		return nodes;
	}

	public void setNodes(List<Area> nodes) {
		this.nodes = nodes;
	}

	@Override
	public String toString() {
		return "Area [areaId=" + areaId + ", areaCode=" + areaCode + ", areaParentCode=" + areaParentCode
				+ ", areaName=" + areaName + ", shortName=" + shortName + ", areaLevel=" + areaLevel + ", nodes="
				+ nodes + "]";
	}
	
}
