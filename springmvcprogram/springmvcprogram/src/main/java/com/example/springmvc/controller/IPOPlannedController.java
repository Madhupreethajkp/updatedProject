package com.example.springmvc.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.IPODetail;

public interface IPOPlannedController {
	public String insertIPODetail(IPODetail ipoDetail) throws SQLException;
	public ModelAndView getIPODetais() throws SQLException;
	String insertIPODetail(IPODetail ipoDetail, HttpServletRequest request, HttpServletResponse response)
			throws SQLException;
	String display();
	String form(IPODetail ipoDetail, ModelMap model) throws SQLException;
	String insertIPODetail(IPODetail ipoDetail, ModelMap model, HttpServletRequest request,
			HttpServletResponse response) throws SQLException;

}
