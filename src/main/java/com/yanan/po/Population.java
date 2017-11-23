package com.yanan.po;
/**
 * 人口
 * @author ZFB
 *
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Population {

	private Integer popId;
	private Integer marrigeId;
	private Integer relationId;
	private Integer areaId;
	private Integer levelId;
	private Integer nationId;
	private Integer accountId;
	private Integer politicsId;
	private Integer gridId;
	private Integer gridStaffId;
	private String popName;
	private Character popSex;
	@DateTimeFormat(pattern="yyyy年MM月dd日")
	private Date popBirthday;
	private Integer popAge;
	private String popNative;
	private String popCode;
	private String popJob;
	private String popTel;
	private String popIcon;
	private String popNativeSite;
	private String popNowSite;
	private String popCompantSite;
	private String popJobSite;
	private String popCar;
	private String popHobby;//爱好
	private Integer popinsured;//保险
	private Integer houseHolder;
	private Integer isFlow;
	private String editPopName;
	private Date editPopDate;
	private Integer popAudit;
	
	private Area area;
	private Grid grid;
	private Grid_staff gridStaff;
	private Account account;
	private Culture_level cultureLevel;//文化层次
	private Marriage_status marriageStatus;//婚姻状况
	private Pop_nation popNation;
	private Holder_relation holderRelation;
	private Politics politics;
	//popAttr--人口属性：团员，工会会员，社区矫正人员，文联会员，归国华侨，留学人员，低保人员，五保人员，下岗职工，
	//单亲家庭，退伍军人，空巢老人等等
	private List<PopAttr> popAttrs;
	
	public Population() {
		super();
		this.area = new Area();
		this.grid = new Grid();
		this.gridStaff = new Grid_staff();
		this.account = new Account();
		this.cultureLevel = new Culture_level();
		this.marriageStatus = new Marriage_status();
		this.popNation = new Pop_nation();
		this.holderRelation = new Holder_relation();
		this.politics = new Politics();
		this.popAttrs = new ArrayList<PopAttr>();
	}

	public Population(Integer popId, Integer marrigeId, Integer relationId, Integer areaId, Integer levelId,
			Integer nationId, Integer accountId, Integer politicsId, Integer gridId, Integer gridStaffId,
			String popName, Character popSex, Date popBirthday, Integer popAge, String popNative, String popCode,
			String popJob, String popTel, String popIcon, String popNativeSite, String popNowSite,
			String popCompantSite, String popJobSite, String popCar, String popHobby, Integer popinsured,
			Integer houseHolder, Integer isFlow, String editPopName, Date editPopDate, Integer popAudit, Area area,
			Grid grid, Grid_staff gridStaff, Account account, Culture_level cultureLevel,
			Marriage_status marriageStatus, Pop_nation popNation, Holder_relation holderRelation, Politics politics,
			List<PopAttr> popAttrs) {
		super();
		this.popId = popId;
		this.marrigeId = marrigeId;
		this.relationId = relationId;
		this.areaId = areaId;
		this.levelId = levelId;
		this.nationId = nationId;
		this.accountId = accountId;
		this.politicsId = politicsId;
		this.gridId = gridId;
		this.gridStaffId = gridStaffId;
		this.popName = popName;
		this.popSex = popSex;
		this.popBirthday = popBirthday;
		this.popAge = popAge;
		this.popNative = popNative;
		this.popCode = popCode;
		this.popJob = popJob;
		this.popTel = popTel;
		this.popIcon = popIcon;
		this.popNativeSite = popNativeSite;
		this.popNowSite = popNowSite;
		this.popCompantSite = popCompantSite;
		this.popJobSite = popJobSite;
		this.popCar = popCar;
		this.popHobby = popHobby;
		this.popinsured = popinsured;
		this.houseHolder = houseHolder;
		this.isFlow = isFlow;
		this.editPopName = editPopName;
		this.editPopDate = editPopDate;
		this.popAudit = popAudit;
		this.area = area;
		this.grid = grid;
		this.gridStaff = gridStaff;
		this.account = account;
		this.cultureLevel = cultureLevel;
		this.marriageStatus = marriageStatus;
		this.popNation = popNation;
		this.holderRelation = holderRelation;
		this.politics = politics;
		this.popAttrs = popAttrs;
	}

	@Override
	public String toString() {
		return "Population [popId=" + popId + ", marrigeId=" + marrigeId + ", relationId=" + relationId + ", areaId="
				+ areaId + ", levelId=" + levelId + ", nationId=" + nationId + ", accountId=" + accountId
				+ ", politicsId=" + politicsId + ", gridId=" + gridId + ", gridStaffId=" + gridStaffId + ", popName="
				+ popName + ", popSex=" + popSex + ", popBirthday=" + popBirthday + ", popAge=" + popAge
				+ ", popNative=" + popNative + ", popCode=" + popCode + ", popJob=" + popJob + ", popTel=" + popTel
				+ ", popIcon=" + popIcon + ", popNativeSite=" + popNativeSite + ", popNowSite=" + popNowSite
				+ ", popCompantSite=" + popCompantSite + ", popJobSite=" + popJobSite + ", popCar=" + popCar
				+ ", popHobby=" + popHobby + ", popinsured=" + popinsured + ", houseHolder=" + houseHolder + ", isFlow="
				+ isFlow + ", editPopName=" + editPopName + ", editPopDate=" + editPopDate + ", popAudit=" + popAudit
				+ ", area=" + area + ", grid=" + grid + ", gridStaff=" + gridStaff + ", account=" + account
				+ ", cultureLevel=" + cultureLevel + ", marriageStatus=" + marriageStatus + ", popNation=" + popNation
				+ ", holderRelation=" + holderRelation + ", politics=" + politics + ", popAttrs=" + popAttrs + "]";
	}

	public Integer getPopId() {
		return popId;
	}

	public void setPopId(Integer popId) {
		this.popId = popId;
	}

	public Integer getMarrigeId() {
		return marrigeId;
	}

	public void setMarrigeId(Integer marrigeId) {
		this.marrigeId = marrigeId;
	}

	public Integer getRelationId() {
		return relationId;
	}

	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Integer getLevelId() {
		return levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	public Integer getNationId() {
		return nationId;
	}

	public void setNationId(Integer nationId) {
		this.nationId = nationId;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getPoliticsId() {
		return politicsId;
	}

	public void setPoliticsId(Integer politicsId) {
		this.politicsId = politicsId;
	}

	public Integer getGridId() {
		return gridId;
	}

	public void setGridId(Integer gridId) {
		this.gridId = gridId;
	}

	public Integer getGridStaffId() {
		return gridStaffId;
	}

	public void setGridStaffId(Integer gridStaffId) {
		this.gridStaffId = gridStaffId;
	}

	public String getPopName() {
		return popName;
	}

	public void setPopName(String popName) {
		this.popName = popName;
	}

	public Character getPopSex() {
		return popSex;
	}

	public void setPopSex(Character popSex) {
		this.popSex = popSex;
	}

	public Date getPopBirthday() {
		return popBirthday;
	}

	public void setPopBirthday(Date popBirthday) {
		this.popBirthday = popBirthday;
	}

	public Integer getPopAge() {
		return popAge;
	}

	public void setPopAge(Integer popAge) {
		this.popAge = popAge;
	}

	public String getPopNative() {
		return popNative;
	}

	public void setPopNative(String popNative) {
		this.popNative = popNative;
	}

	public String getPopCode() {
		return popCode;
	}

	public void setPopCode(String popCode) {
		this.popCode = popCode;
	}

	public String getPopJob() {
		return popJob;
	}

	public void setPopJob(String popJob) {
		this.popJob = popJob;
	}

	public String getPopTel() {
		return popTel;
	}

	public void setPopTel(String popTel) {
		this.popTel = popTel;
	}

	public String getPopIcon() {
		return popIcon;
	}

	public void setPopIcon(String popIcon) {
		this.popIcon = popIcon;
	}

	public String getPopNativeSite() {
		return popNativeSite;
	}

	public void setPopNativeSite(String popNativeSite) {
		this.popNativeSite = popNativeSite;
	}

	public String getPopNowSite() {
		return popNowSite;
	}

	public void setPopNowSite(String popNowSite) {
		this.popNowSite = popNowSite;
	}

	public String getPopCompantSite() {
		return popCompantSite;
	}

	public void setPopCompantSite(String popCompantSite) {
		this.popCompantSite = popCompantSite;
	}

	public String getPopJobSite() {
		return popJobSite;
	}

	public void setPopJobSite(String popJobSite) {
		this.popJobSite = popJobSite;
	}

	public String getPopCar() {
		return popCar;
	}

	public void setPopCar(String popCar) {
		this.popCar = popCar;
	}

	public String getPopHobby() {
		return popHobby;
	}

	public void setPopHobby(String popHobby) {
		this.popHobby = popHobby;
	}

	public Integer getPopinsured() {
		return popinsured;
	}

	public void setPopinsured(Integer popinsured) {
		this.popinsured = popinsured;
	}

	public Integer getHouseHolder() {
		return houseHolder;
	}

	public void setHouseHolder(Integer houseHolder) {
		this.houseHolder = houseHolder;
	}

	public Integer getIsFlow() {
		return isFlow;
	}

	public void setIsFlow(Integer isFlow) {
		this.isFlow = isFlow;
	}

	public String getEditPopName() {
		return editPopName;
	}

	public void setEditPopName(String editPopName) {
		this.editPopName = editPopName;
	}

	public Date getEditPopDate() {
		return editPopDate;
	}

	public void setEditPopDate(Date editPopDate) {
		this.editPopDate = editPopDate;
	}

	public Integer getPopAudit() {
		return popAudit;
	}

	public void setPopAudit(Integer popAudit) {
		this.popAudit = popAudit;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	public Grid_staff getGridStaff() {
		return gridStaff;
	}

	public void setGridStaff(Grid_staff gridStaff) {
		this.gridStaff = gridStaff;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Culture_level getCultureLevel() {
		return cultureLevel;
	}

	public void setCultureLevel(Culture_level cultureLevel) {
		this.cultureLevel = cultureLevel;
	}

	public Marriage_status getMarriageStatus() {
		return marriageStatus;
	}

	public void setMarriageStatus(Marriage_status marriageStatus) {
		this.marriageStatus = marriageStatus;
	}

	public Pop_nation getPopNation() {
		return popNation;
	}

	public void setPopNation(Pop_nation popNation) {
		this.popNation = popNation;
	}

	public Holder_relation getHolderRelation() {
		return holderRelation;
	}

	public void setHolderRelation(Holder_relation holderRelation) {
		this.holderRelation = holderRelation;
	}

	public Politics getPolitics() {
		return politics;
	}

	public void setPolitics(Politics politics) {
		this.politics = politics;
	}

	public List<PopAttr> getPopAttrs() {
		return popAttrs;
	}

	public void setPopAttrs(List<PopAttr> popAttrs) {
		this.popAttrs = popAttrs;
	}
	
}
