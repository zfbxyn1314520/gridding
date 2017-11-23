package com.yanan.po;
/**
 * 流动人口
 * @author ZFB
 *
 */

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Flow {

	private Integer flowId;
	private Integer popId;
	private Integer flowTypeId;
	private String flowCause;//流动的原因
	@DateTimeFormat(pattern="yyyy年MM月dd日")
	private Date flowTime;
	private String inFlowSite;
	private String outFlowSite;
	
	private Flow_type flowType;
	private Population population;
	
	public Flow() {
		super();
		this.flowType = new Flow_type();
		this.population = new Population();
	}

	public Flow(Integer flowId, Integer popId, Integer flowTypeId, String flowCause, Date flowTime, String inFlowSite,
			String outFlowSite, Flow_type flowType, Population population) {
		super();
		this.flowId = flowId;
		this.popId = popId;
		this.flowTypeId = flowTypeId;
		this.flowCause = flowCause;
		this.flowTime = flowTime;
		this.inFlowSite = inFlowSite;
		this.outFlowSite = outFlowSite;
		this.flowType = flowType;
		this.population = population;
	}

	@Override
	public String toString() {
		return "Flow [flowId=" + flowId + ", popId=" + popId + ", flowTypeId=" + flowTypeId + ", flowCause=" + flowCause
				+ ", flowTime=" + flowTime + ", inFlowSite=" + inFlowSite + ", outFlowSite=" + outFlowSite
				+ ", flowType=" + flowType + ", population=" + population + "]";
	}

	public Integer getFlowId() {
		return flowId;
	}

	public void setFlowId(Integer flowId) {
		this.flowId = flowId;
	}

	public Integer getPopId() {
		return popId;
	}

	public void setPopId(Integer popId) {
		this.popId = popId;
	}

	public Integer getFlowTypeId() {
		return flowTypeId;
	}

	public void setFlowTypeId(Integer flowTypeId) {
		this.flowTypeId = flowTypeId;
	}

	public String getFlowCause() {
		return flowCause;
	}

	public void setFlowCause(String flowCause) {
		this.flowCause = flowCause;
	}

	public Date getFlowTime() {
		return flowTime;
	}

	public void setFlowTime(Date flowTime) {
		this.flowTime = flowTime;
	}

	public String getInFlowSite() {
		return inFlowSite;
	}

	public void setInFlowSite(String inFlowSite) {
		this.inFlowSite = inFlowSite;
	}

	public String getOutFlowSite() {
		return outFlowSite;
	}

	public void setOutFlowSite(String outFlowSite) {
		this.outFlowSite = outFlowSite;
	}

	public Flow_type getFlowType() {
		return flowType;
	}

	public void setFlowType(Flow_type flowType) {
		this.flowType = flowType;
	}

	public Population getPopulation() {
		return population;
	}

	public void setPopulation(Population population) {
		this.population = population;
	}
	
}
