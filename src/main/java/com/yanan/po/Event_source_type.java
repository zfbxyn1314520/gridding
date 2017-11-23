package com.yanan.po;
/**
 * 事件来源--类：群众反应，自己发现
 * @author ZFB
 *
 */
public class Event_source_type {
	
	private Integer SourceTypeId;
	private String SourceTypeName;
	
	public Event_source_type() {
		super();
	}
	public Event_source_type(Integer sourceTypeId, String sourceTypeName) {
		super();
		SourceTypeId = sourceTypeId;
		SourceTypeName = sourceTypeName;
	}
	@Override
	public String toString() {
		return "Event_source_type [SourceTypeId=" + SourceTypeId + ", SourceTypeName=" + SourceTypeName + "]";
	}
	public Integer getSourceTypeId() {
		return SourceTypeId;
	}
	public void setSourceTypeId(Integer sourceTypeId) {
		SourceTypeId = sourceTypeId;
	}
	public String getSourceTypeName() {
		return SourceTypeName;
	}
	public void setSourceTypeName(String sourceTypeName) {
		SourceTypeName = sourceTypeName;
	}
	
}
