package com.example.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmvc.dao.CompanyDao;
import com.example.springmvc.dao.IPOPlannedDao;
import com.example.springmvc.model.Company;
import com.example.springmvc.model.IPODetail;
@RestController
public class RestController1 {
	
	@Autowired
	CompanyDao companyDao;
	
	@GetMapping("/company/sectorId/{sectorId}")
	public List<Company> findBySectorId(@PathVariable int sectorId){
		List<Company> company=companyDao.findBySectorId(sectorId);
		return company;
		
	}
	
	@Autowired
	IPOPlannedDao ipoPlannedDao;
	@GetMapping("/ipo/companyCode/{companyCode}")
	public List<IPODetail> findByCompanyCode(@PathVariable int companyCode){
	List<IPODetail> ipoDetail=ipoPlannedDao.findByCompanyCode(companyCode);
	return ipoDetail;

}
}
