/*package com.example.springmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springmvc.model.StockPrice;
@Repository
public class StockPriceDaoImpl implements StockPriceDao {

	@Override
	public StockPrice insertStock(StockPrice stock) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
			PreparedStatement ps=con.prepareStatement("insert into stockpricedetail(stock_code,current_price,date,time)values(?,?,?,?)");
			System.out.println("Enter stock exchange code");
			int stock_code=sc.nextInt();
			sc.nextLine();
			ps.setInt(1, stock_code);
			System.out.println("Enter company code");
			int company_code=sc.nextInt();
			sc.nextLine();
			ps.setInt(2,company_code);
			System.out.println("Enter current price");
			Double current_price=sc.nextDouble();
			sc.nextLine();
			ps.setDouble(2, current_price);
			System.out.println("Enter date");
			String s=sc.nextLine();
			SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
			Date date = simpleDateFormat.parse(s);
			simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
			s=simpleDateFormat.format(date);
			
			ps.setDate(3, java.sql.Date.valueOf(s));
			System.out.println("Enter time");
			String time=sc.nextLine();
			ps.setTime(4, java.sql.Time.valueOf(time));
			ps.executeUpdate();
				
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return stock;
	}

	@Override
	public StockPrice updateStock(StockPrice stock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockPrice> getStockPrice() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
		PreparedStatement ps=con.prepareStatement("select * from stockpricedetail");
		List <StockPrice> stockPriceList=new ArrayList<StockPrice>();
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("inside");
			StockPrice s=new StockPrice();
	
		s.setStockExchange(rs.getInt(1));
		//s.setCompanyCode(rs.getInt(1));
		s.setCurrentPrice(rs.getDouble(3));
		s.setStock_date(rs.getDate(4));
		s.setTime(rs.getTime(5));
		stockPriceList.add(s);
			
		}
		
		return stockPriceList;
		

		
	}
	public static void main(String[] args) throws SQLException {
		StockPriceDao stockpriceDao=new StockPriceDaoImpl();
		StockPrice stock=new StockPrice();
	//	stockpriceDao.insertStock(stock);
		System.out.println(new StockPriceDaoImpl().getStockPrice());
		
	}

}
*/