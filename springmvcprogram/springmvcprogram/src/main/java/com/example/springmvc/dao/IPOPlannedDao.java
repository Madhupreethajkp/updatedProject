package com.example.springmvc.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmvc.model.Company;
import com.example.springmvc.model.IPODetail;

public interface IPOPlannedDao  extends JpaRepository<IPODetail,Integer> {

	//List<IPODetail> findByCompanyCode(int companyCode);
/*	public IPODetail insertIPODetail(IPODetail ipoDetail);
	public List<IPODetail> getIPODetais() throws SQLException;*/

	List<IPODetail> findByCompanyCode(int companyCode);

}
