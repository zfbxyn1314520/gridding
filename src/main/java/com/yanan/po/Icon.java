package com.yanan.po;
/**
 * 图标
 * @author ZFB
 *
 */
public class Icon {

	private Integer iconId;
	private String iconName;
	//图标类别：网页，辅助功能，手势，运输，性别，文件，表单，支付，图标，货币，文本编辑，指示方向等等
	private String iconType;
	
	public Icon() {
		super();
	}

	public Icon(Integer iconId, String iconName, String iconType) {
		super();
		this.iconId = iconId;
		this.iconName = iconName;
		this.iconType = iconType;
	}

	@Override
	public String toString() {
		return "Icon [iconId=" + iconId + ", iconName=" + iconName + ", iconType=" + iconType + "]";
	}

	public Integer getIconId() {
		return iconId;
	}

	public void setIconId(Integer iconId) {
		this.iconId = iconId;
	}

	public String getIconName() {
		return iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

	public String getIconType() {
		return iconType;
	}

	public void setIconType(String iconType) {
		this.iconType = iconType;
	}
	
}
