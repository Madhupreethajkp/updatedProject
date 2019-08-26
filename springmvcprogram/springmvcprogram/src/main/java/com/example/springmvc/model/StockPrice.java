package com.example.springmvc.model;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stockprice")
public class StockPrice  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_code")
    private int stockId;

    /*
    * @ManyToOne(cascade=CascadeType.ALL)
    * 
     * @JoinColumn(name="company_id") private Company company;
    */

    @Column(name = "company_id")
    private int companyId;

    //@Pattern(regexp = "^[A-Za-z]+$", message = "stock Exchange name should not contain numbers")
    @Column(name = "stockExchange_name")
    private String StockExchange;

    public String getStockExchange() {
                    return StockExchange;
    }

    public void setStockExchange(String stockExchange) {
                    StockExchange = stockExchange;
    }

    
    private double currentPrice;
    private Date date;
    /* private Date time; */

    /*
    * @ManyToOne(cascade=CascadeType.ALL)
    * 
     * @JoinColumn(name="stockexchange_id") private StockExchange stockExchange;
    */
    @Column(name = "stockexchange_id")
    private int stockExchangeId;

    public int getStockId() {
                    return stockId;
    }

    /*
    * public StockExchange getStockExchange() { return stockExchange; }
    * 
     * public void setStockExchange(StockExchange stockExchange) {
    * this.stockExchange = stockExchange; }
    */

    public int getStockExchangeId() {
                    return stockExchangeId;
    }

    public void setStockExchangeId(int stockExchangeId) {
                    this.stockExchangeId = stockExchangeId;
    }

    public void setStockId(int stockId) {
                    this.stockId = stockId;
    }

    /*
    * public Company getCompany() { return company; }
    * 
     * public void setCompany(Company company) { this.company = company; }
    */

    public double getCurrentPrice() {
                    return currentPrice;
    }

    public int getCompanyId() {
                    return companyId;
    }

    public void setCompanyId(int companyId) {
                    this.companyId = companyId;
    }

    public void setCurrentPrice(double currentPrice) {
                    this.currentPrice = currentPrice;
    }

    public Date getDate() {
                    return date;
    }

    public void setDate(Date date) {
                    this.date = date;
    }
    /*
    * @Override public String toString() { return "Stock [stockId=" + stockId +
    * ", companyId=" + companyId + ", currentPrice=" + currentPrice + ", date="
    * + date + ", stockExchange=" + stockExchange + "]"; }
    */

    @Override
    public String toString() {
                    return "Stock [stockId=" + stockId + ", companyId=" + companyId + ", currentPrice=" + currentPrice + ", date="
                                                    + date + ", stockExchangeId=" + stockExchangeId + "]";
    }

    /*
    * @Override public String toString() { return "Stock [stockId=" + stockId +
    * ", company=" + company + ", currentPrice=" + currentPrice + ", date=" +
    * date + ", stockExchange=" + stockExchange + "]"; }
    */

}
