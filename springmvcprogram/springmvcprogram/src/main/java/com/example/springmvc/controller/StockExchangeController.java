package com.example.springmvc.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.StockExchange;

public interface StockExchangeController {
	public String insertStockExchange(StockExchange stockExchange) throws SQLException;
	public ModelAndView getStockExchange() throws SQLException;
	String stockForm(StockExchange stockExchange, ModelMap model);

}
