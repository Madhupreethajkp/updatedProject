package com.example.springmvc.service;

import java.sql.SQLException;
import java.util.List;

import com.example.springmvc.model.User;

public interface UserService {
	public void insertUser(User user);

	public List<User> getUserList() throws SQLException;

	public int validateUser(User u) throws Exception;

	public List<User> findByUsername(String username);

}
