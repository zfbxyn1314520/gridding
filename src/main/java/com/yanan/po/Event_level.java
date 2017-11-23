package com.yanan.po;
/**
 * 事件等级--类:紧急，一般
 * @author ZFB
 *
 */
public class Event_level {

	private Integer eventLevelId;
	private String eventLevelName;
	
	public Event_level() {
		super();
	}

	public Event_level(Integer eventLevelId, String eventLevelName) {
		super();
		this.eventLevelId = eventLevelId;
		this.eventLevelName = eventLevelName;
	}

	@Override
	public String toString() {
		return "Event_level [eventLevelId=" + eventLevelId + ", eventLevelName=" + eventLevelName + "]";
	}

	public Integer getEventLevelId() {
		return eventLevelId;
	}

	public void setEventLevelId(Integer eventLevelId) {
		this.eventLevelId = eventLevelId;
	}

	public String getEventLevelName() {
		return eventLevelName;
	}

	public void setEventLevelName(String eventLevelName) {
		this.eventLevelName = eventLevelName;
	}
	
}
