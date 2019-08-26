package com.example.springmvc.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.Sector;

public interface SectorController {
	public String insertSector(Sector sector) throws SQLException;
	//public List<Sector> getSector() throws SQLException;
	String compareSector();
	String create(Sector sector, ModelMap model);
	ModelAndView getSectorList() throws Exception;

}
