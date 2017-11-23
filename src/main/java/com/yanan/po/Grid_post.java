package com.yanan.po;
/**
 * 网格人员的岗位--网格员，网格长
 * @author ZFB
 *
 */
public class Grid_post {
	
	private Integer gridPostId;
	private String gridPostName;
	
	public Grid_post(Integer gridPostId, String gridPostName) {
		super();
		this.gridPostId = gridPostId;
		this.gridPostName = gridPostName;
	}

	public Grid_post() {
		super();
	}

	@Override
	public String toString() {
		return "Grid_post [gridPostId=" + gridPostId + ", gridPostName=" + gridPostName + "]";
	}

	public Integer getGridPostId() {
		return gridPostId;
	}

	public void setGridPostId(Integer gridPostId) {
		this.gridPostId = gridPostId;
	}

	public String getGridPostName() {
		return gridPostName;
	}

	public void setGridPostName(String gridPostName) {
		this.gridPostName = gridPostName;
	}
	
}
