package com.example.springmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.example.springmvc.model.User;
/*@Repository
public class UserDaoImpl implements UserDao {
	Scanner sc=new Scanner(System.in);

	  
	@Override
	public void insertUser(User user) {
		
		

		// TODO Auto-generated method stub
		System.out.println("inside dao ");
		System.out.println(user.getUserName());
		
		user.setUserType("User");
		user.setConfirmed(true);
		System.out.println(user);
		System.out.println("aaaaaaaaaaaaaaaaa"+sessionFactory.getCurrentSession().toString());
		sessionFactory.getCurrentSession().save(user);
		
	
	try {
		
		Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
			 PreparedStatement ps=con.prepareStatement("insert into user(user_name,password,user_type,email,mobile_number,confirmed) values(?,?,?,?,?,?)");
		//	ps.setInt(1, user.getId());
			 user.setUserType("User");
				user.setConfirmed(true);
			System.out.println("Enter user name");
			String user_name=sc.nextLine();
			ps.setString(1, user_name);
			System.out.println("Enter password");
			String password=sc.nextLine();
			ps.setString(2, password);
			System.out.println("Enter user type ");
			String user_type=sc.nextLine();
			ps.setString(3, user_type);
			System.out.println("Enter  email");
			String email=sc.nextLine();
			ps.setString(4,email);
			System.out.println("Enter mobile number");
			String mobile_number=sc.nextLine();
			ps.setString(5,mobile_number);
			System.out.println("Confirmed");
			boolean confirmed=sc.nextBoolean();
			
			ps.setBoolean(6,confirmed);
			 ps.setString(1, user.getUserName());
			 ps.setString(2,user.getPassword());
			 ps.setString(3, user.getUserType());
			 ps.setString(4, user.getE_mail());
			 ps.setString(5, user.getMobileNumber());
			 ps.setBoolean(6,user.isConfirmed());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return user;
	}
	
public List<User> getUserList() throws SQLException{
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
	PreparedStatement ps=con.prepareStatement("select * from user");
	List <User> userList=new ArrayList<User>();
	ResultSet rs=ps.executeQuery();
	
	while(rs.next()) {
		
		User u=new User();
	         u.setId(rs.getInt(1));
		u.setUserName(rs.getString(2));
		u.setPassword(rs.getString(3));
		u.setUserType(rs.getString(4));
		u.setE_mail(rs.getString(5));
		u.setMobileNumber(rs.getString(6));
		u.setConfirmed(rs.getBoolean(7));
		userList.add(u);
	}
	return userList;
	}
@Override
public int validateUser(User u) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
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
}


	public static void main(String[] args) throws SQLException {
		UserDao userDao=new UserDaoImpl();
		User user=new User();
		//user.setId(1);
		userDao.insertUser(user);
		System.out.println(new UserDaoImpl().getUserList());
		
	}

	
	

}
*/