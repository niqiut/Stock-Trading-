/**
 * ���ߣ�κʤ��
 * ѧУ������ʦ��ѧԺ
 * ѧԺ�����������ѧԺ
 * רҵ���������ѧ�뼼����������������
 * �꼶��2012��
 * ���ڣ�2014��11��28��
 * ʱ�䣺����5:32:38
 * �ļ�����StockRecord.java
 * ����������com.stock.bean
 * ������Ŀ����StockSystem
 * Designed by Shengze Wei in Chongqing Coded in Fuling
 * Copyright 2014 Shengze Wei. All rights reserved.
 */
package com.stock.bean;

public class TradeRecordBean {
	private String stockid;
	private String stockName;
	private String stockPrice;
	private String tradeNumber;
	private String buyuserid;
	private String saleuserid;
	private String tradeTime;

	public TradeRecordBean() {
		super();
	}

	/**
	 * @param stockid
	 * @param stockName
	 * @param stockPrice
	 * @param tradeNumber
	 * @param buyuserid
	 * @param saleuserid
	 * @param tradeTime
	 */
	public TradeRecordBean(String stockid, String stockName, String stockPrice,
			String tradeNumber, String buyuserid, String saleuserid,
			String tradeTime) {
		super();
		this.stockid = stockid;
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		this.tradeNumber = tradeNumber;
		this.buyuserid = buyuserid;
		this.saleuserid = saleuserid;
		this.tradeTime = tradeTime;
	}

	/**
	 * @return stockid
	 */
	public String getStockid() {
		return stockid;
	}

	/**
	 * @param stockid
	 *            Ҫ���õ� stockid
	 */
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}

	/**
	 * @return stockName
	 */
	public String getStockName() {
		return stockName;
	}

	/**
	 * @param stockName
	 *            Ҫ���õ� stockName
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	/**
	 * @return stockPrice
	 */
	public String getStockPrice() {
		return stockPrice;
	}

	/**
	 * @param stockPrice
	 *            Ҫ���õ� stockPrice
	 */
	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}

	/**
	 * @return tradeNumber
	 */
	public String getTradeNumber() {
		return tradeNumber;
	}

	/**
	 * @param tradeNumber
	 *            Ҫ���õ� tradeNumber
	 */
	public void setTradeNumber(String tradeNumber) {
		this.tradeNumber = tradeNumber;
	}

	/**
	 * @return buyuserid
	 */
	public String getBuyuserid() {
		return buyuserid;
	}

	/**
	 * @param buyuserid
	 *            Ҫ���õ� buyuserid
	 */
	public void setBuyuserid(String buyuserid) {
		this.buyuserid = buyuserid;
	}

	/**
	 * @return saleuserid
	 */
	public String getSaleuserid() {
		return saleuserid;
	}

	/**
	 * @param saleuserid
	 *            Ҫ���õ� saleuserid
	 */
	public void setSaleuserid(String saleuserid) {
		this.saleuserid = saleuserid;
	}

	/**
	 * @return tradeTime
	 */
	public String getTradeTime() {
		return tradeTime;
	}

	/**
	 * @param tradeTime
	 *            Ҫ���õ� tradeTime
	 */
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}
}