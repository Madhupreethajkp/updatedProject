package com.example.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import com.example.springmvc.model.IPODetail;

public interface IPOPlannedService {
	public IPODetail insertIPODetail(IPODetail ipoDetail);
	public List<IPODetail> getIPODetais() throws SQLException;
	public IPODetail fetchStockUpdate(int id);
	void editIpo(IPODetail ipoDetail) throws SQLException;
	public void deleteIpo(IPODetail ipoDetail);
}
