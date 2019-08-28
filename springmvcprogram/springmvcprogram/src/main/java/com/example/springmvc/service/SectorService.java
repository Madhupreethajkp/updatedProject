package com.example.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import com.example.springmvc.model.Sector;

public interface SectorService {
public Sector insertSector(Sector sector);
//public List<Sector> getSector() throws SQLException;
public List<Sector> getSectorList() throws SQLException;
public Sector fetchStockUpdate(int id);
public void editStock(Sector sector);
public void deleteSector(Sector sector);
}
