package com.example.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springmvc.dao.StockExchangeDao;
import com.example.springmvc.model.Company;
import com.example.springmvc.model.StockExchange;

@Service
public class StockExchangeServiceImpl implements StockExchangeService{
@Autowired
private StockExchangeDao stockExchangeDao;
	@Override
	public StockExchange insertStockExchange(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		System.out.println("inside service");
		stockExchangeDao.save(stockExchange);
		return stockExchange; 
	}

	@Override
	public List<StockExchange> getStockExchange() throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Inside service");
		return stockExchangeDao.findAll();
	}

@Override
       public void editStock(StockExchange stockExchange) throws SQLException {
              //companyDao.updateCompany(company);
             // System.out.println(company.getCompanyName());
	stockExchangeDao.save(stockExchange);
       }


	@Override
	public StockExchange fetchStockUpdate(int stockexchange_id) {
		// TODO Auto-generated method stub
		return stockExchangeDao.getOne(stockexchange_id);
	}

	@Override
	public void deleteStock(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		stockExchangeDao.delete(stockExchange);
	}

}
