package com.example.springmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Repository;

import com.example.springmvc.model.StockExchange;
/*@Repository
public class StockExchangeDaoImpl implements StockExchangeDao {
	
	Scanner sc=new Scanner(System.in);
	@Override
	public StockExchange insertStockExchange(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
			PreparedStatement ps=con.prepareStatement("insert into stockexchange(stockexchange_name,brief,contact_address,remarks) values(?,?,?,?)");
			System.out.println("Enter stock exchange name");
			//String stockexchange_name=sc.nextLine();
			ps.setString(1,stockExchange.getStockexchange_name());
			
			System.out.println("Enter brief");
			//String brief=sc.nextLine();
			ps.setString(2, stockExchange.getBrief());
			System.out.println("Enter contact address");
			//String contact_address=sc.nextLine();
			ps.setString(3, stockExchange.getContactAddress());
      System.out.println("Enter remarks");
     //String remarks=sc.nextLine();
      ps.setString(4,stockExchange.getRemarks());
      ps.executeUpdate();
		
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		return stockExchange;
	}

	@Override
	public List<StockExchange> getStockExchange() throws SQLException {
		// TODO Auto-generated method stub
		List <StockExchange> stockExchangeList=new ArrayList<StockExchange>();
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
		PreparedStatement ps=con.prepareStatement("select * from stockexchange");
	
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("inside");
			StockExchange s=new StockExchange();
		s.setId(rs.getInt(1));
		s.setStockexchange_name(rs.getString(1));
		s.setBrief(rs.getString(2));
		s.setContactAddress(rs.getString(3));
		s.setRemarks(rs.getString(4));
      stockExchangeList.add(s);
			
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return stockExchangeList;
	}
	public static void main(String[] args) throws SQLException {
		StockExchangeDao stockexchangeDao=new StockExchangeDaoImpl();
		StockExchange stockExchange=new StockExchange();
		//stockexchangeDao.insertStockExchange(stockExchange);
	 System.out.println(new StockExchangeDaoImpl().getStockExchange());
	}

}
*/