package com.example.springmvc.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.User;

public interface UserController {
	 public String insertUser(User user) throws SQLException;
	    public User updateUser(User user);
		public List<User> getUserList() throws Exception;
		ModelAndView registerCompany(User user, BindingResult result, HttpServletRequest request, HttpSession session,
				ModelMap map) throws SQLException;

}
