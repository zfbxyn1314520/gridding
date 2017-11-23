package com.yanan.po;

import java.util.Date;
/**
 * 公司类
 * @author ZFB
 *
 */
public class Company {

	private Integer companyId;
	private Integer tradeId;//公司的行业id，机构组织，农林牧渔，医药卫生，建筑建材等等
	private Integer scaleId;//公司的规模的id，50人以下，50-100人等等
	private Integer areaId;
	private Integer natureId;//公司的性质id，国有企业，政府机关，事业单位等等
	private String companyName;
	private String companyMan;//公司法人
	private String companyIntro;//公司简介
	private String companyTel;
	private String companySite;
	private String creditCode;//社会信用代码
	private String registerOffice;//登记处
	private Integer companyAudit;
	private String eidtComName;//编辑公司者的姓名
	private Date eidtComDate;//编辑公司的时间
	private String companyPic;
	private Area area;
	private Company_trade companyTrade;
	private Company_nature companyNature;
	private Company_scale companyScale;
	
	public Company() {
		super();
		this.area = new Area();
		this.companyTrade = new Company_trade();
		this.companyNature = new Company_nature();
		this.companyScale = new Company_scale();
	}

	public Company(Integer companyId, Integer tradeId, Integer scaleId, Integer areaId, Integer natureId,
			String companyName, String companyMan, String companyIntro, String companyTel, String companySite,
			String creditCode, String registerOffice, Integer companyAudit, String eidtComName, Date eidtComDate,
			String companyPic, Area area, Company_trade companyTrade, Company_nature companyNature,
			Company_scale companyScale) {
		super();
		this.companyId = companyId;
		this.tradeId = tradeId;
		this.scaleId = scaleId;
		this.areaId = areaId;
		this.natureId = natureId;
		this.companyName = companyName;
		this.companyMan = companyMan;
		this.companyIntro = companyIntro;
		this.companyTel = companyTel;
		this.companySite = companySite;
		this.creditCode = creditCode;
		this.registerOffice = registerOffice;
		this.companyAudit = companyAudit;
		this.eidtComName = eidtComName;
		this.eidtComDate = eidtComDate;
		this.companyPic = companyPic;
		this.area = area;
		this.companyTrade = companyTrade;
		this.companyNature = companyNature;
		this.companyScale = companyScale;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", tradeId=" + tradeId + ", scaleId=" + scaleId + ", areaId="
				+ areaId + ", natureId=" + natureId + ", companyName=" + companyName + ", companyMan=" + companyMan
				+ ", companyIntro=" + companyIntro + ", companyTel=" + companyTel + ", companySite=" + companySite
				+ ", creditCode=" + creditCode + ", registerOffice=" + registerOffice + ", companyAudit=" + companyAudit
				+ ", eidtComName=" + eidtComName + ", eidtComDate=" + eidtComDate + ", companyPic=" + companyPic
				+ ", area=" + area + ", companyTrade=" + companyTrade + ", companyNature=" + companyNature
				+ ", companyScale=" + companyScale + "]";
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public Integer getScaleId() {
		return scaleId;
	}

	public void setScaleId(Integer scaleId) {
		this.scaleId = scaleId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Integer getNatureId() {
		return natureId;
	}

	public void setNatureId(Integer natureId) {
		this.natureId = natureId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyMan() {
		return companyMan;
	}

	public void setCompanyMan(String companyMan) {
		this.companyMan = companyMan;
	}

	public String getCompanyIntro() {
		return companyIntro;
	}

	public void setCompanyIntro(String companyIntro) {
		this.companyIntro = companyIntro;
	}

	public String getCompanyTel() {
		return companyTel;
	}

	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}

	public String getCompanySite() {
		return companySite;
	}

	public void setCompanySite(String companySite) {
		this.companySite = companySite;
	}

	public String getCreditCode() {
		return creditCode;
	}

	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getRegisterOffice() {
		return registerOffice;
	}

	public void setRegisterOffice(String registerOffice) {
		this.registerOffice = registerOffice;
	}

	public Integer getCompanyAudit() {
		return companyAudit;
	}

	public void setCompanyAudit(Integer companyAudit) {
		this.companyAudit = companyAudit;
	}

	public String getEidtComName() {
		return eidtComName;
	}

	public void setEidtComName(String eidtComName) {
		this.eidtComName = eidtComName;
	}

	public Date getEidtComDate() {
		return eidtComDate;
	}

	public void setEidtComDate(Date eidtComDate) {
		this.eidtComDate = eidtComDate;
	}

	public String getCompanyPic() {
		return companyPic;
	}

	public void setCompanyPic(String companyPic) {
		this.companyPic = companyPic;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Company_trade getCompanyTrade() {
		return companyTrade;
	}

	public void setCompanyTrade(Company_trade companyTrade) {
		this.companyTrade = companyTrade;
	}

	public Company_nature getCompanyNature() {
		return companyNature;
	}

	public void setCompanyNature(Company_nature companyNature) {
		this.companyNature = companyNature;
	}

	public Company_scale getCompanyScale() {
		return companyScale;
	}

	public void setCompanyScale(Company_scale companyScale) {
		this.companyScale = companyScale;
	}
	
}
