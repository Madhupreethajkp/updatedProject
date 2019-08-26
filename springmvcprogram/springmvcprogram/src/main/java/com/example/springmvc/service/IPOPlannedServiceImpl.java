package com.example.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springmvc.dao.CompanyDao;
import com.example.springmvc.dao.IPOPlannedDao;
import com.example.springmvc.dao.StockExchangeDao;
import com.example.springmvc.model.IPODetail;
@Service
public class IPOPlannedServiceImpl implements IPOPlannedService{
@Autowired
private IPOPlannedDao ipoPlannedDao;
@Autowired
private CompanyDao companyDao;

@Autowired
private StockExchangeDao stockExchangeDao;
	public IPODetail insertIPODetail(IPODetail ipoDetail) {
		// TODO Auto-generated method stub
		System.out.println("Inside service");
		ipoPlannedDao.save(ipoDetail);
		return ipoDetail;
		
	}

	public List<IPODetail> getIPODetais() throws SQLException {
		// TODO Auto-generated method stub
		return ipoPlannedDao.findAll();
	}

@Override
       public void editIpo(IPODetail ipoDetail) throws SQLException {
              //companyDao.updateCompany(company);
              //System.out.println(ipoDetail.getCompanyName());
	System.out.println("inside edit");
	ipoPlannedDao.save(ipoDetail);
       }

@Override
           public IPODetail fetchStockUpdate(int id)
           {
               return ipoPlannedDao.getOne(id);
           }

@Override
public void deleteIpo(IPODetail ipoDetail) {
	// TODO Auto-generated method stub
	ipoPlannedDao.delete(ipoDetail);
}

}
