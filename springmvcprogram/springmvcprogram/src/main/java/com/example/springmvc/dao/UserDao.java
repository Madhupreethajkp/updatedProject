package com.example.springmvc.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmvc.model.Company;
import com.example.springmvc.model.User;

public interface UserDao  extends JpaRepository<User,Integer>{

	List<User> findByUserName(String username);
	/*public void insertUser(User user);
	public List<User> getUserList() throws SQLException;
	public int validateUser(User u) throws Exception;*/
	

}
