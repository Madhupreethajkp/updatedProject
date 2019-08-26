package com.example.springmvc.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmvc.model.StockExchange;

public interface StockExchangeDao extends JpaRepository<StockExchange,Integer> {
	/*public StockExchange insertStockExchange(StockExchange stockExchange);
	public List<StockExchange> getStockExchange() throws SQLException;
*/
}
