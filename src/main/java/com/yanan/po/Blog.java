package com.yanan.po;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Blog {

	private Integer blogId;
	private Integer areaId;
	private Integer gridId;
	private Integer gridStaffId;
	private String blogName;
	private String blogType;
	private String blogContent;
	@DateTimeFormat(pattern="yyyy年MM月dd日 HH:mm:ss")
	private Date editBlogDate;
	private String blogPic;
	private Area area;
	private Grid grid;
	private Grid_staff gridStaff;
	
	public Blog() {
		super();
		this.area = new Area();
		this.grid = new Grid();
		this.gridStaff = new Grid_staff();
	}

	public Blog(Integer blogId, Integer areaId, Integer gridId, Integer gridStaffId, String blogName, String blogType,
			String blogContent, Date editBlogDate, String blogPic, Area area, Grid grid, Grid_staff gridStaff) {
		super();
		this.blogId = blogId;
		this.areaId = areaId;
		this.gridId = gridId;
		this.gridStaffId = gridStaffId;
		this.blogName = blogName;
		this.blogType = blogType;
		this.blogContent = blogContent;
		this.editBlogDate = editBlogDate;
		this.blogPic = blogPic;
		this.area = area;
		this.grid = grid;
		this.gridStaff = gridStaff;
	}

	@Override
	public String toString() {
		return "Blog [blogId=" + blogId + ", areaId=" + areaId + ", gridId=" + gridId + ", gridStaffId=" + gridStaffId
				+ ", blogName=" + blogName + ", blogType=" + blogType + ", blogContent=" + blogContent
				+ ", editBlogDate=" + editBlogDate + ", blogPic=" + blogPic + ", area=" + area + ", grid=" + grid
				+ ", gridStaff=" + gridStaff + "]";
	}

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Integer getGridId() {
		return gridId;
	}

	public void setGridId(Integer gridId) {
		this.gridId = gridId;
	}

	public Integer getGridStaffId() {
		return gridStaffId;
	}

	public void setGridStaffId(Integer gridStaffId) {
		this.gridStaffId = gridStaffId;
	}

	public String getBlogName() {
		return blogName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	public String getBlogType() {
		return blogType;
	}

	public void setBlogType(String blogType) {
		this.blogType = blogType;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	public Date getEditBlogDate() {
		return editBlogDate;
	}

	public void setEditBlogDate(Date editBlogDate) {
		this.editBlogDate = editBlogDate;
	}

	public String getBlogPic() {
		return blogPic;
	}

	public void setBlogPic(String blogPic) {
		this.blogPic = blogPic;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	public Grid_staff getGridStaff() {
		return gridStaff;
	}

	public void setGridStaff(Grid_staff gridStaff) {
		this.gridStaff = gridStaff;
	}
}
