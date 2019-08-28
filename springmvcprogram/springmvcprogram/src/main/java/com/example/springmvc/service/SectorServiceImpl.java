package com.example.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springmvc.dao.SectorDao;
import com.example.springmvc.model.Sector;
@Service
public class SectorServiceImpl implements SectorService{
@Autowired
private SectorDao sectorDao;
//	@Override
//	public Sector insertSector(Sector sector) {
//		// TODO Auto-generated method stub
//		sectorDao.insertSector(sector);
//		return null;
//	}

	@Override
	public List<Sector> getSectorList() throws SQLException {
		// TODO Auto-generated method stub
		return sectorDao.findAll();
	}

	@Override
	public Sector insertSector(Sector sector) {
		// TODO Auto-generated method stub
		return sectorDao.save(sector);
	}

	@Override
	public Sector fetchStockUpdate(int id) {
		// TODO Auto-generated method stub
		return sectorDao.getOne(id);
	}

	@Override
	public void editStock(Sector sector) {
		// TODO Auto-generated method stub
		sectorDao.save(sector);
		
	}

	@Override
	public void deleteSector(Sector sector) {
		// TODO Auto-generated method stub
		sectorDao.delete(sector);
		
	}

}