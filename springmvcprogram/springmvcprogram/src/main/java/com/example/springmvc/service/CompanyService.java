package com.example.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import com.example.springmvc.model.Company;
import com.example.springmvc.model.Sector;

public interface CompanyService {
	public Company insertCompany(Company company);
	//public Company updateCompany(Company company);
	public List<Company> getCompanyList() throws SQLException;
	//public List<Sector> getSectorList() throws SQLException;
	//public String editCompany(Company company);
	public void editCompany(Company company)throws SQLException;
	public Company fetchStockUpdate(int companyId) throws SQLException, ClassNotFoundException ;
	public void deleteCompany(Company company);
	

}
