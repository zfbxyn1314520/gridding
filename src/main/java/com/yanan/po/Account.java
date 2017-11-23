package com.yanan.po;

import java.util.Date;

public class Account {
	private Integer accountId;
	private Integer houseId;
	private String accountHolder;
	private String accountSite;
	private Integer memberCount;
	private String editAccountName;
	private Date editAccountDate;
	private Integer accountAudit;
	private String holderTel;
	private String holderCard;
	private House house;
	
	public Account() {
		super();
		this.house = new House();
	}

	public Account(Integer accountId, Integer houseId, String accountHolder, String accountSite, Integer memberCount,
			String editAccountName, Date editAccountDate, Integer accountAudit, String holderTel, String holderCard,
			House house) {
		super();
		this.accountId = accountId;
		this.houseId = houseId;
		this.accountHolder = accountHolder;
		this.accountSite = accountSite;
		this.memberCount = memberCount;
		this.editAccountName = editAccountName;
		this.editAccountDate = editAccountDate;
		this.accountAudit = accountAudit;
		this.holderTel = holderTel;
		this.holderCard = holderCard;
		this.house = house;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", houseId=" + houseId + ", accountHolder=" + accountHolder
				+ ", accountSite=" + accountSite + ", memberCount=" + memberCount + ", editAccountName="
				+ editAccountName + ", editAccountDate=" + editAccountDate + ", accountAudit=" + accountAudit
				+ ", holderTel=" + holderTel + ", holderCard=" + holderCard + ", house=" + house + "]";
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getHouseId() {
		return houseId;
	}

	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAccountSite() {
		return accountSite;
	}

	public void setAccountSite(String accountSite) {
		this.accountSite = accountSite;
	}

	public Integer getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(Integer memberCount) {
		this.memberCount = memberCount;
	}

	public String getEditAccountName() {
		return editAccountName;
	}

	public void setEditAccountName(String editAccountName) {
		this.editAccountName = editAccountName;
	}

	public Date getEditAccountDate() {
		return editAccountDate;
	}

	public void setEditAccountDate(Date editAccountDate) {
		this.editAccountDate = editAccountDate;
	}

	public Integer getAccountAudit() {
		return accountAudit;
	}

	public void setAccountAudit(Integer accountAudit) {
		this.accountAudit = accountAudit;
	}

	public String getHolderTel() {
		return holderTel;
	}

	public void setHolderTel(String holderTel) {
		this.holderTel = holderTel;
	}

	public String getHolderCard() {
		return holderCard;
	}

	public void setHolderCard(String holderCard) {
		this.holderCard = holderCard;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
	
}
