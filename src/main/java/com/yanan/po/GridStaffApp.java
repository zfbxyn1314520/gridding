package com.yanan.po;
/**
 * 网格人员信息--手机端
 * @author ZFB
 *
 */
public class GridStaffApp {

	private Integer gridStaffId;
	private String gridStaffName;
	private String gridStaffSex;
	private String gridStaffTel;
	private String gridStaffScope;
	
	public GridStaffApp() {
		super();
	}

	public GridStaffApp(Integer gridStaffId, String gridStaffName, String gridStaffSex, String gridStaffTel,
			String gridStaffScope) {
		super();
		this.gridStaffId = gridStaffId;
		this.gridStaffName = gridStaffName;
		this.gridStaffSex = gridStaffSex;
		this.gridStaffTel = gridStaffTel;
		this.gridStaffScope = gridStaffScope;
	}

	@Override
	public String toString() {
		return "GridStaffApp [gridStaffId=" + gridStaffId + ", gridStaffName=" + gridStaffName + ", gridStaffSex="
				+ gridStaffSex + ", gridStaffTel=" + gridStaffTel + ", gridStaffScope=" + gridStaffScope + "]";
	}

	public Integer getGridStaffId() {
		return gridStaffId;
	}

	public void setGridStaffId(Integer gridStaffId) {
		this.gridStaffId = gridStaffId;
	}

	public String getGridStaffName() {
		return gridStaffName;
	}

	public void setGridStaffName(String gridStaffName) {
		this.gridStaffName = gridStaffName;
	}

	public String getGridStaffSex() {
		return gridStaffSex;
	}

	public void setGridStaffSex(String gridStaffSex) {
		this.gridStaffSex = gridStaffSex;
	}

	public String getGridStaffTel() {
		return gridStaffTel;
	}

	public void setGridStaffTel(String gridStaffTel) {
		this.gridStaffTel = gridStaffTel;
	}

	public String getGridStaffScope() {
		return gridStaffScope;
	}

	public void setGridStaffScope(String gridStaffScope) {
		this.gridStaffScope = gridStaffScope;
	}
	
}
