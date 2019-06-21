/**
 * ���ߣ�κʤ��
 * ѧУ������ʦ��ѧԺ
 * ѧԺ�����������ѧԺ
 * רҵ���������ѧ�뼼����������������
 * �꼶��2012��
 * ���ڣ�2014��11��28��
 * ʱ�䣺����5:28:17
 * �ļ�����StockInfo.java
 * ����������com.stock.bean
 * ������Ŀ����StockSystem
 * Designed by Shengze Wei in Chongqing Coded in Fuling
 * Copyright 2014 Shengze Wei. All rights reserved.
 */
package com.stock.bean;

public class StockInfoBean {
	private String stockid;
	private String stockName;
	private String stockPy;
	private String stockPrice;
	private String stockNum;

	public StockInfoBean() {
		super();
	}

	/**
	 * @param stockid
	 * @param stockName
	 * @param stockPy
	 * @param stockPrice
	 * @param stockNum
	 */
	public StockInfoBean(String stockid, String stockName, String stockPy,
			String stockPrice, String stockNum) {
		super();
		this.stockid = stockid;
		this.stockName = stockName;
		this.stockPy = stockPy;
		this.stockPrice = stockPrice;
		this.stockNum=stockNum;
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
	 * @return stockPy
	 */
	public String getStockPy() {
		return stockPy;
	}

	/**
	 * @param stockPy
	 *            Ҫ���õ� stockPy
	 */
	public void setStockPy(String stockPy) {
		this.stockPy = stockPy;
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
	 * @return stockNum
	 */
	public String getStockNum() {
		return stockNum;
	}

	/**
	 * @param stockNum
	 *            Ҫ���õ� stockNum
	 */
	public void setStockNum(String stockNum) {
		this.stockNum = stockNum;
	}
}