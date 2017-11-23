package com.yanan.po;
/**
 * 事件处理--类
 * @author ZFB
 *
 */

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Event {

	private Integer eventId;
	private Integer areaId;
	private Integer gridId;
	private Integer gridStaffId;
	private Integer eventLevelId;
	private Integer sourceTypeId;//事件来源-群众反映，自己发现
	private String eventTitle;
	private String eventContent;
	@DateTimeFormat(pattern="yyyy年MM月dd日 HH:mm:ss")
	private Date editEventDate;
	private Integer isImportant;//是否紧急
	private Integer eventTypeId;
	private String eventPic;
	private Integer isFinished;//是否办结
	
	private Area area;
	private Event_level eventLevel;
	private Event_type eventType;
	private Event_source_type eventSourceType;
	private Grid grid;
	private Grid_staff gridStaff;
	
	public Event() {
		super();
		this.area = new Area();
		this.eventLevel = new Event_level();
		this.eventType = new Event_type();
		this.eventSourceType = new Event_source_type();
		this.grid = new Grid();
		this.gridStaff = new Grid_staff();
	}

	public Event(Integer eventId, Integer areaId, Integer gridId, Integer gridStaffId, Integer eventLevelId,
			Integer sourceTypeId, String eventTitle, String eventContent, Date editEventDate, Integer isImportant,
			Integer eventTypeId, String eventPic, Integer isFinished, Area area, Event_level eventLevel,
			Event_type eventType, Event_source_type eventSourceType, Grid grid, Grid_staff gridStaff) {
		super();
		this.eventId = eventId;
		this.areaId = areaId;
		this.gridId = gridId;
		this.gridStaffId = gridStaffId;
		this.eventLevelId = eventLevelId;
		this.sourceTypeId = sourceTypeId;
		this.eventTitle = eventTitle;
		this.eventContent = eventContent;
		this.editEventDate = editEventDate;
		this.isImportant = isImportant;
		this.eventTypeId = eventTypeId;
		this.eventPic = eventPic;
		this.isFinished = isFinished;
		this.area = area;
		this.eventLevel = eventLevel;
		this.eventType = eventType;
		this.eventSourceType = eventSourceType;
		this.grid = grid;
		this.gridStaff = gridStaff;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", areaId=" + areaId + ", gridId=" + gridId + ", gridStaffId="
				+ gridStaffId + ", eventLevelId=" + eventLevelId + ", sourceTypeId=" + sourceTypeId + ", eventTitle="
				+ eventTitle + ", eventContent=" + eventContent + ", editEventDate=" + editEventDate + ", isImportant="
				+ isImportant + ", eventTypeId=" + eventTypeId + ", eventPic=" + eventPic + ", isFinished=" + isFinished
				+ ", area=" + area + ", eventLevel=" + eventLevel + ", eventType=" + eventType + ", eventSourceType="
				+ eventSourceType + ", grid=" + grid + ", gridStaff=" + gridStaff + "]";
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
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

	public Integer getEventLevelId() {
		return eventLevelId;
	}

	public void setEventLevelId(Integer eventLevelId) {
		this.eventLevelId = eventLevelId;
	}

	public Integer getSourceTypeId() {
		return sourceTypeId;
	}

	public void setSourceTypeId(Integer sourceTypeId) {
		this.sourceTypeId = sourceTypeId;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getEventContent() {
		return eventContent;
	}

	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}

	public Date getEditEventDate() {
		return editEventDate;
	}

	public void setEditEventDate(Date editEventDate) {
		this.editEventDate = editEventDate;
	}

	public Integer getIsImportant() {
		return isImportant;
	}

	public void setIsImportant(Integer isImportant) {
		this.isImportant = isImportant;
	}

	public Integer getEventTypeId() {
		return eventTypeId;
	}

	public void setEventTypeId(Integer eventTypeId) {
		this.eventTypeId = eventTypeId;
	}

	public String getEventPic() {
		return eventPic;
	}

	public void setEventPic(String eventPic) {
		this.eventPic = eventPic;
	}

	public Integer getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(Integer isFinished) {
		this.isFinished = isFinished;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Event_level getEventLevel() {
		return eventLevel;
	}

	public void setEventLevel(Event_level eventLevel) {
		this.eventLevel = eventLevel;
	}

	public Event_type getEventType() {
		return eventType;
	}

	public void setEventType(Event_type eventType) {
		this.eventType = eventType;
	}

	public Event_source_type getEventSourceType() {
		return eventSourceType;
	}

	public void setEventSourceType(Event_source_type eventSourceType) {
		this.eventSourceType = eventSourceType;
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
