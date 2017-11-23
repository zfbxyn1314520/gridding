package com.yanan.po;
/**
 * 事件的类型--类：城市管理，家庭暴力
 * @author ZFB
 *
 */
public class Event_type {

	private Integer eventTypeId;
	private String eventTypeName;
	
	public Event_type() {
		super();
	}
	public Event_type(Integer eventTypeId, String eventTypeName) {
		super();
		this.eventTypeId = eventTypeId;
		this.eventTypeName = eventTypeName;
	}
	@Override
	public String toString() {
		return "Event_type [eventTypeId=" + eventTypeId + ", eventTypeName=" + eventTypeName + "]";
	}
	public Integer getEventTypeId() {
		return eventTypeId;
	}
	public void setEventTypeId(Integer eventTypeId) {
		this.eventTypeId = eventTypeId;
	}
	public String getEventTypeName() {
		return eventTypeName;
	}
	public void setEventTypeName(String eventTypeName) {
		this.eventTypeName = eventTypeName;
	}
	
}
