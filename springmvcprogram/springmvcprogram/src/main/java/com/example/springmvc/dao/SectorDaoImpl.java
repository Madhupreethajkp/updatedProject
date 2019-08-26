/*package com.example.springmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Repository;

import com.example.springmvc.model.Sector;
@Repository
public class SectorDaoImpl implements SectorDao {

	@Override
	public Sector insertSector(Sector sector) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
	Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
	
		PreparedStatement ps=con.prepareStatement("insert into sector(sector_name,brief) values(?,?) ");
		
		System.out.println("Enter sector name");
		String sector_name=sc.nextLine();
		ps.setString(1,sector_name);
		System.out.println("enter brief");
		String brief=sc.nextLine();
	ps.setString(2, brief);
	ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return null;
	}

	@Override
	public List<Sector> getSector() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
		PreparedStatement ps=con.prepareStatement("select * from sector");
		List <Sector> sectorList=new ArrayList<Sector>();
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("inside");
			Sector s=new Sector();
			s.setSector_id(rs.getInt(1));
			s.setSector_name(rs.getString(2));
			s.setBrief(rs.getString(3));
      sectorList.add(s);
			
		}
		
		return sectorList;
	}
	public static void main(String[] args) throws SQLException {
		SectorDao sectorDao=new SectorDaoImpl();
		Sector sector=new Sector();
		
		sectorDao.insertSector(sector);
		//System.out.println(new SectorDaoImpl().getSector());
	}

}
*/