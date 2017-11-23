package com.yanan.po;
/**
 * 流动人口类型
 * @author ZFB
 *
 */
public class Flow_type {

	private Integer flowTypeId;
	private String flowTypeName;
	
	public Flow_type() {
		super();
	}

	public Flow_type(Integer flowTypeId, String flowTypeName) {
		super();
		this.flowTypeId = flowTypeId;
		this.flowTypeName = flowTypeName;
	}

	@Override
	public String toString() {
		return "Flow_type [flowTypeId=" + flowTypeId + ", flowTypeName=" + flowTypeName + "]";
	}

	public Integer getFlowTypeId() {
		return flowTypeId;
	}

	public void setFlowTypeId(Integer flowTypeId) {
		this.flowTypeId = flowTypeId;
	}

	public String getFlowTypeName() {
		return flowTypeName;
	}

	public void setFlowTypeName(String flowTypeName) {
		this.flowTypeName = flowTypeName;
	}
	
}
