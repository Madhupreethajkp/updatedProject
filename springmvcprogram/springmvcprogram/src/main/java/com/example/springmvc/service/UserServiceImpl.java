package com.example.springmvc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springmvc.dao.UserDao;
import com.example.springmvc.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
@Override
public List<User> getUserList() throws SQLException {
	// TODO Auto-generated method stub
	return userDao.findAll();
}

@Override
public void insertUser(User user) {
	System.out.println("Inside service");
	System.out.println(user.getUserName());
	userDao.save(user);
}
@Override
public int validateUser(User u) throws Exception {
	// TODO Auto-generated method stub
	System.out.println("inside user service");
	//int i=userDao.validateUser(u);
	Class.forName("com.mysql.jdbc.Driver");
	// TODO Auto-generated method stub
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
	PreparedStatement ps=con.prepareStatement("select user_name,password from user where user_name=? and password=?");

	ps.setString(1, u.getUserName());
	ps.setString(2, u.getPassword());
System.out.println(u.getPassword());
	ResultSet rs=ps.executeQuery();
	
	if(rs.next()) {
	
	System.out.println("login success");
	return 1;
	}
	
	
	else {
	
	return 0;
}
//	return i;
	
}
@Override
public List<User> findByUsername(String username) {
	// TODO Auto-generated method stub
    return userDao.findByUserName(username);
}

}
