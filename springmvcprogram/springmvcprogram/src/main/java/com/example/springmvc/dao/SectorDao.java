package com.example.springmvc.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmvc.model.Company;
import com.example.springmvc.model.Sector;

public interface SectorDao  extends JpaRepository<Sector,Integer> {
	//public Sector insertSector(Sector sector);
//	public List<Sector> getSector() throws SQLException;
	

}
