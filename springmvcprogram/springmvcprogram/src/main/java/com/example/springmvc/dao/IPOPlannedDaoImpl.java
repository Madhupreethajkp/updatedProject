package com.example.springmvc.dao;

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

import com.example.springmvc.model.IPODetail;
/*@Repository
public class IPOPlannedDaoImpl implements IPOPlannedDao {
	
	Scanner sc=new Scanner(System.in);
	@Override
	public IPODetail insertIPODetail(IPODetail ipoDetail) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
			PreparedStatement ps=con.prepareStatement("insert into ipo_planned(company_name,stockexchange_id,price_per_share,total_no_of_shares,open_date_time,remarks) values(?,?,?,?,?,?)");
			System.out.println("Enter company Name");
			//String company_name=sc.nextLine();
			System.out.println(ipoDetail.getCompanyName());
			ps.setString(1, ipoDetail.getCompanyName());
			System.out.println("Enter stockexchange id");
			//int stockexchange_id=sc.nextInt();
			//sc.nextLine();
			ps.setInt(2,ipoDetail.getStockExchange_id());
			System.out.println("Enter price per share");
			//Double price_per_share=sc.nextDouble();
			//sc.nextLine();
			ps.setDouble(3,ipoDetail.getPrice());
			System.out.println("Enter total no of shares");
			//int toatl_no_of_shares=sc.nextInt();
			//sc.nextLine();
			ps.setInt(4,ipoDetail.getTotalShares());
			System.out.println(ipoDetail.getTotalShares());
			System.out.println("enter date");
			//Date d=ipoDetail.getDateTime();
			String s=ipoDetail.getDateTime().toString();
			SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
			simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
			//s=simpleDateFormat.format(s);
			Date date = simpleDateFormat.parse(s);
		
			
		//Date open_date_time=(Date) formatter.parse(s);
		//ps.setDate(5,(java.sql.Date)open_date_time);
			SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
			Date date = simpleDateFormat.parse(s);
			simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
			s=simpleDateFormat.format(date);
			ps.setDate(5, java.sql.Date.valueOf(s));
			System.out.println(ipoDetail.getDateTime());
			System.out.println("Enter remarks");
			//String remarks=sc.nextLine();
			ps.setString(6,ipoDetail.getRemarks());
			ps.executeUpdate();
			//System.out.println()
				
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		 
		// TODO Auto-generated method stub
		return ipoDetail;
	}

	@Override
	public List<IPODetail> getIPODetais() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
		PreparedStatement ps=con.prepareStatement("select * from ipo_planned");
		List <IPODetail> ipoPlannedList=new ArrayList<IPODetail>();
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("inside");
			IPODetail d=new IPODetail();
			d.setId(rs.getInt(1));
			d.setCompanyName(rs.getString(2));
			d.setStockExchange_id(rs.getInt(3));
			d.setPrice(rs.getDouble(4));
			d.setTotalShares(rs.getInt(5));
			d.setDateTime(rs.getDate(6));
			d.setRemarks(rs.getString(7));
ipoPlannedList.add(d);
			
		}
		
		return ipoPlannedList;
		
	}
	public static void main(String[] args) throws SQLException {
		IPODetail ipoDetail=new IPODetail();
		IPOPlannedDao ipoplannedDao=new IPOPlannedDaoImpl();
		ipoplannedDao.insertIPODetail(ipoDetail);
	//	System.out.println(new IPOPlannedDaoImpl().getIPODetais());
	}

}
*/