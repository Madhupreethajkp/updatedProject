package com.example.springmvc.dao;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmvc.model.Company;

public interface CompanyDao  extends JpaRepository<Company,Integer>{
/*public Company insertCompany(Company company);
//public Company updateCompany(Company company);
public List<Company> getCompanyList() throws SQLException;*/
	public List<Company> findBySectorId(int sectorId);
}
