package com.example.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import com.example.springmvc.model.StockExchange;

public interface StockExchangeService {
	public StockExchange insertStockExchange(StockExchange stockExchange);
	public List<StockExchange> getStockExchange() throws SQLException;
	public StockExchange fetchStockUpdate(int stockexchange_id);
	void editStock(StockExchange stockExchange) throws SQLException;
	public void deleteStock(StockExchange stockExchange);

}
