package com.yanan.po;
/**
 * 公司经营的行业--类
 * @author ZFB
 *
 */
public class Company_trade {

	private Integer tradeId;
	private Integer tradePerId;
	private String tradeName;
	
	public Company_trade() {
		super();
	}

	public Company_trade(Integer tradeId, Integer tradePerId, String tradeName) {
		super();
		this.tradeId = tradeId;
		this.tradePerId = tradePerId;
		this.tradeName = tradeName;
	}

	@Override
	public String toString() {
		return "Company_trade [tradeId=" + tradeId + ", tradePerId=" + tradePerId + ", tradeName=" + tradeName + "]";
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public Integer getTradePerId() {
		return tradePerId;
	}

	public void setTradePerId(Integer tradePerId) {
		this.tradePerId = tradePerId;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
}
