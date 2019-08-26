package com.example.springmvc.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmvc.model.Sector;
import com.example.springmvc.model.StockPrice;

public interface StockPriceDao extends JpaRepository<StockPrice,Integer> {
	/* public StockPrice insertStock(StockPrice stock);
     public StockPrice updateStock(StockPrice stock);
    public List<StockPrice> getStockPrice() throws SQLException;*/


}
