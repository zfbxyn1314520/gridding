package com.yanan.po;

public class Unit {
	
	private Integer unitId;
	private Integer bolckId;
	private String unitName;
	private Integer floorCount;
	private Block block;
	
	public Unit() {
		super();
		this.block = new Block();
	}

	public Unit(Integer unitId, Integer bolckId, String unitName, Integer floorCount, Block block) {
		super();
		this.unitId = unitId;
		this.bolckId = bolckId;
		this.unitName = unitName;
		this.floorCount = floorCount;
		this.block = block;
	}

	@Override
	public String toString() {
		return "Unit [unitId=" + unitId + ", bolckId=" + bolckId + ", unitName=" + unitName + ", floorCount="
				+ floorCount + ", block=" + block + "]";
	}

	public Integer getUnitId() {
		return unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	public Integer getBolckId() {
		return bolckId;
	}

	public void setBolckId(Integer bolckId) {
		this.bolckId = bolckId;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public Integer getFloorCount() {
		return floorCount;
	}

	public void setFloorCount(Integer floorCount) {
		this.floorCount = floorCount;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}
}
