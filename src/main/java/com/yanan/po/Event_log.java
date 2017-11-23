package com.yanan.po;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 事件日志
 * @author ZFB
 *
 */
public class Event_log {

	private Integer eventLogId;
	private Integer eventId;
	private String eventLogContent;
	@DateTimeFormat(pattern="yyyy年MM月dd日 HH:mm:ss")
	private Date editEventLogDate;
	private String editEventLogName;
	private Integer solveStatusId;//解决状态
	
	private Event event;
	private Event_solve_status solveStatus;
	
	public Event_log() {
		super();
	}
	public Event_log(Integer eventLogId, Integer eventId, String eventLogContent, Date editEventLogDate,
			String editEventLogName, Integer solveStatusId, Event event, Event_solve_status solveStatus) {
		super();
		this.eventLogId = eventLogId;
		this.eventId = eventId;
		this.eventLogContent = eventLogContent;
		this.editEventLogDate = editEventLogDate;
		this.editEventLogName = editEventLogName;
		this.solveStatusId = solveStatusId;
		this.event = event;
		this.solveStatus = solveStatus;
	}
	@Override
	public String toString() {
		return "Event_log [eventLogId=" + eventLogId + ", eventId=" + eventId + ", eventLogContent=" + eventLogContent
				+ ", editEventLogDate=" + editEventLogDate + ", editEventLogName=" + editEventLogName
				+ ", solveStatusId=" + solveStatusId + ", event=" + event + ", solveStatus=" + solveStatus + "]";
	}
	public Integer getEventLogId() {
		return eventLogId;
	}
	public void setEventLogId(Integer eventLogId) {
		this.eventLogId = eventLogId;
	}
	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public String getEventLogContent() {
		return eventLogContent;
	}
	public void setEventLogContent(String eventLogContent) {
		this.eventLogContent = eventLogContent;
	}
	public Date getEditEventLogDate() {
		return editEventLogDate;
	}
	public void setEditEventLogDate(Date editEventLogDate) {
		this.editEventLogDate = editEventLogDate;
	}
	public String getEditEventLogName() {
		return editEventLogName;
	}
	public void setEditEventLogName(String editEventLogName) {
		this.editEventLogName = editEventLogName;
	}
	public Integer getSolveStatusId() {
		return solveStatusId;
	}
	public void setSolveStatusId(Integer solveStatusId) {
		this.solveStatusId = solveStatusId;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public Event_solve_status getSolveStatus() {
		return solveStatus;
	}
	public void setSolveStatus(Event_solve_status solveStatus) {
		this.solveStatus = solveStatus;
	}
	
}
