package com.yanan.po;
/**
 * 与户主的关系:户主，配偶，子女，母子/女，父子/女，祖孙，租赁，朋友，同事，其他
 * @author ZFB
 *
 */
public class Holder_relation {

	private Integer relationId;
	private String relationName;
	
	public Holder_relation() {
		super();
	}
	public Holder_relation(Integer relationId, String relationName) {
		super();
		this.relationId = relationId;
		this.relationName = relationName;
	}
	@Override
	public String toString() {
		return "Holder_relation [relationId=" + relationId + ", relationName=" + relationName + "]";
	}
	public Integer getRelationId() {
		return relationId;
	}
	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}
	public String getRelationName() {
		return relationName;
	}
	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}
	
}
