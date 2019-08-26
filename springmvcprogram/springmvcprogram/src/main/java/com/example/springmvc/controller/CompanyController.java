package com.example.springmvc.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.Company;

public interface CompanyController {
	public String form(Company company,ModelMap model) throws SQLException;
	 public String insertCompany(Company company) throws SQLException;
	 //   public Company updateCompany(Company company);
		public ModelAndView getCompanyList() throws Exception;
		//Company editCompany(Company company, HttpServletRequest request);
		String compareCompany();
		//String form1(Company company, ModelMap model);
		//ModelAndView editCompany(Company company,BindingResult result,ModelMap model, HttpServletRequest request) throws SQLException;
		//String form1(ModelMap model);

}
