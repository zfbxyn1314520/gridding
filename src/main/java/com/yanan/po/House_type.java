package com.yanan.po;
/**
 * 房屋的类型--一室一厅，二室一厅，三室一厅等等
 * @author ZFB
 *
 */
public class House_type {

	private Integer type_id;
	private String typeName;
	
	public House_type() {
		super();
	}

	public House_type(Integer type_id, String typeName) {
		super();
		this.type_id = type_id;
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "House_type [type_id=" + type_id + ", typeName=" + typeName + "]";
	}

	public Integer getType_id() {
		return type_id;
	}

	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
}
