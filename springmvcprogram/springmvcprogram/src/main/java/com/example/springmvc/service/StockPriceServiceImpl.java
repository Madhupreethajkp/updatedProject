package com.example.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springmvc.dao.StockPriceDao;
import com.example.springmvc.model.StockPrice;
@Service
public class StockPriceServiceImpl implements StockPriceService {
@Autowired
private StockPriceDao stockPriceDao;
	@Override
	public StockPrice insertStock(StockPrice stock) {
		// TODO Auto-generated method stub
		stockPriceDao.save(stock);
		return null;
	}

	@Override
	public StockPrice updateStock(StockPrice stock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockPrice> getStockPrice() throws SQLException {
		// TODO Auto-generated method stub
		return stockPriceDao.findAll();
	}

}
