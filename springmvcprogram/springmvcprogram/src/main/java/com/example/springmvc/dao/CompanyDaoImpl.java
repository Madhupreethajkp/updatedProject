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

import com.example.springmvc.model.Company;
/*
@Repository
public class CompanyDaoImpl implements CompanyDao {
	Scanner sc=new Scanner(System.in);
  
	@Override
	public Company insertCompany(Company company) {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
			 PreparedStatement ps=con.prepareStatement("insert into company(company_name,turnover,ceo,board_of_directors,sector_id,briefwriteup) values(?,?,?,?,?,?)");
			
			
			System.out.println("Enter company name");
			
			//String company_name=sc.nextLine();
			ps.setString(1, company.getCompanyName());
System.out.println("Enter turnover");
			
			//String turnover=sc.nextLine();
			ps.setDouble(2,company.getTurnOver());
System.out.println("Enter CEO name");
			
			//String ceo=sc.nextLine();
			ps.setString(3,company.getCEO());
System.out.println("Enter board of directors ");
			
			//String board_of_directors=sc.nextLine();
			ps.setString(4,company.getBoardOfDirectors());
			ps.setInt(5,company.getSector_id());
System.out.println("Enter briefwriteup");
			
			//String briefwriteup=sc.nextLine();
			ps.setString(6,company.getBriefWriteup());
		
			ps.executeUpdate();
			 
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		
		 return company;
		 }
		 
		
		// TODO Auto-generated method stub
		

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		
        int i=0;
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
           PreparedStatement ps=null;
        	String sql="update company set company_name='?' , turnover='?' , ceo='?' , board_of_directors='?' ,briefwriteup='?' where company_code='?'";
        	ps.setString(1, company.getCompanyName());
            System.out.println(company.getCompanyName());
            ps.setDouble(2,company.getTurnOver());
            ps.setString(3, company.getCEO());
            ps.setString(4, company.getBoardOfDirectors());
            ps.setString(5, company.getBriefWriteup());
        	  ps=con.prepareStatement(sql); 
        	
            
               i=ps.executeUpdate(sql);
            
            	   System.out.println("updated successfully");
               
        }
        catch(Exception e) {
        	System.out.println(e);
        }

		return company;
	}
	public List<Company> getCompanyList(){
		List <Company> companyList=null;
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
		PreparedStatement ps=con.prepareStatement("select * from company");
		companyList=new ArrayList<Company>();
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("inside");
			Company c=new Company();
			c.setCompany_code(rs.getInt(1));
			c.setCompanyName(rs.getString(2));
			c.setTurnOver(rs.getDouble(3));
			c.setCEO(rs.getString(4));
			c.setBoardOfDirectors(rs.getString(6));
		//c.setSector_id(rs.getInt(5));
		c.setBriefWriteup(rs.getString(7));
		//c.setStockCode(rs.getInt(7));
		companyList.add(c);
		}
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		return companyList;
		
	}
	public static void  main(String[] args) throws SQLException {
		
		//System.out.println(new CompanyServiceImpl().getCompanyList());
		Company company=new Company();
		//CompanyDao companyDao=new CompanyDaoImpl();
		CompanyDao companyDao=new CompanyDaoImpl();
	//	System.out.println(companyDao.getCompanyList());
		
		//
		//companyDao.insertCompany(company);
		
	}

}
*/