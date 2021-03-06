package com.yanan.po;
/**
 * 房屋的状态类--出租，空置，自住，其他
 * @author ZFB
 *
 */
public class House_status {
	
	private Integer statusId;
	private String statusName;
	
	public House_status() {
		super();
	}

	public House_status(Integer statusId, String statusName) {
		super();
		this.statusId = statusId;
		this.statusName = statusName;
	}

	@Override
	public String toString() {
		return "House_status [statusId=" + statusId + ", statusName=" + statusName + "]";
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	
}
