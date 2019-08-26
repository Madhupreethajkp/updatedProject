package com.example.springmvc.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ipo_planned")
public class IPODetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="ipo_id")
	private int id;
	@Column(name="company_code")
	private int companyCode;
	@Column(name="stockexchange_id")
	private int stockExchange_id;
	public IPODetail(int id, int companyCode, int stockExchange_id, BigDecimal price, int totalShares, Date dateTime,
			String remarks) {
		super();
		this.id = id;
		this.companyCode = companyCode;
		this.stockExchange_id = stockExchange_id;
		this.price = price;
		this.totalShares = totalShares;
		this.dateTime = dateTime;
		this.remarks = remarks;
	}
	public IPODetail() {
		// TODO Auto-generated constructor stub
	}
	public int getStockExchange_id() {
		return stockExchange_id;
	}
	public void setStockExchange_id(int stockExchange_id) {
		this.stockExchange_id = stockExchange_id;
	}
	@Column(name="price_per_share")
	private BigDecimal price;
	@Column(name="total_no_of_shares")
	private int totalShares;
	@Column(name="open_date_time")
	private Date dateTime;
	private String remarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getTotalShares() {
		return totalShares;
	}
	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "IPODetail [id=" + id + ", companyName=" + companyCode + ", stockExchange_id=" + stockExchange_id
				+ ", price=" + price + ", totalShares=" + totalShares + ", dateTime=" + dateTime + ", remarks="
				+ remarks + "]";
	}

}
