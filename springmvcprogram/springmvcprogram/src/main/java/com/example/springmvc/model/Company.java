package com.example.springmvc.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="company")
public class Company {
	public Company() {
		super();
	}
	@Id
	
		@GeneratedValue(strategy=GenerationType.AUTO) 
		 

	private int company_code;
	
	public int getCompany_code() {
		return company_code;
	}
	public void setCompany_code(int company_code) {
		this.company_code = company_code;
	}
	@Column(name="company_name")
	private String companyName;
	@Column(name="turnover")
	private BigDecimal turnOver;
	@Column(name="ceo")
	private String CEO;
	@Column(name="board_of_directors")
	private String boardOfDirectors;
	//private List<StockExchange> stockExchange;
	
	@Column(name="sector_id")
	private int sectorId;

	public Company(int company_code, String companyName, BigDecimal turnOver, String cEO, String boardOfDirectors,
			int sectorId, String briefWriteup) {
		super();
		this.company_code = company_code;
		this.companyName = companyName;
		this.turnOver = turnOver;
		CEO = cEO;
		this.boardOfDirectors = boardOfDirectors;
		this.sectorId = sectorId;
		this.briefWriteup = briefWriteup;
	}
	public Company(String companyName, BigDecimal turnOver, String cEO, String boardOfDirectors, int sectorId,
			String briefWriteup) {
		super();
		this.companyName = companyName;
		this.turnOver = turnOver;
		CEO = cEO;
		this.boardOfDirectors = boardOfDirectors;
		this.sectorId = sectorId;
		this.briefWriteup = briefWriteup;
	}
	@Column(name="briefwriteup")
	private String briefWriteup;
/*	@Column(name="stock_code")
	private int stockCode;*/
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public BigDecimal getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(BigDecimal turnOver) {
		this.turnOver = turnOver;
	}
	public String getCEO() {
		return CEO;
	}
	public void setCEO(String cEO) {
		CEO = cEO;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	/*public List<StockExchange> getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(List<StockExchange> stockExchange) {
		this.stockExchange = stockExchange;
	}
	*/
	
	public String getBriefWriteup() {
		return briefWriteup;
	}
	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}
	/*public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}*/
	@Override
	public String toString() {
		return "Company [company_code=" + company_code + ", companyName=" + companyName + ", turnOver=" + turnOver
				+ ", CEO=" + CEO + ", boardOfDirectors=" + boardOfDirectors + ", sectorId=" + sectorId
				+ ", briefWriteup=" + briefWriteup + "]";
	}
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	
	
	

}
