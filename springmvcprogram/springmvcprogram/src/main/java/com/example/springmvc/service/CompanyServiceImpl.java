package com.example.springmvc.service;



import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springmvc.dao.CompanyDao;
import com.example.springmvc.dao.SectorDao;
import com.example.springmvc.model.Company;
import com.example.springmvc.model.Sector;


@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
CompanyDao companyDao;
	@Autowired 
	SectorDao sectorDao;
	@Override
	public Company insertCompany(Company company) {
		// TODO Auto-generated method stub
		companyDao.save(company);
	 return company;
	
		
	}
	/*@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		
	companyDao.updateCompany(company);
	return null;
	}*/

	@Override
	public List<Company> getCompanyList() throws SQLException {
		// TODO Auto-generated method stub
		return companyDao.findAll();
		
	}
	

	/*@Override
	public String editCompany(Company company) {
		// TODO Auto-generated method stub
	
	        int i=0;
	        try
	        {
	        	Class.forName("com.mysql.jdbc.Driver");
	        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
	           PreparedStatement ps=null;
	        	String sql="update company set company_name=?, turnover=?,  ceo=?,  board_of_directors=?, sector_id=?, briefwriteup=? where company_code=?";
	        
	        	
	        	
	      //  int status=JdbcTemplate.editCompany(sql,company.getCompany_code(),company.getCompanyName(),company.getTurnOver(),company.getCEO(),company.getBoardOfDirectors(),company.getSectorId(),company.getBriefWriteup());
	        	
	        	//int status=JdbcTemplate.editCompany(sql);
	        	
	        	
	        	
	        	ps.setString(1, company.getCompanyName());
	            System.out.println(company.getCompanyName());
	            ps.setBigDecimal(2,company.getTurnOver());
	            ps.setString(3, company.getCEO());
	            ps.setString(4, company.getBoardOfDirectors());
	            ps.setInt(5, company.getSectorId());
	            ps.setString(6, company.getBriefWriteup());
	        	  ps=con.prepareStatement(sql); 
	        	
	            
	               i=ps.executeUpdate(sql);
	            
	            	   System.out.println("updated successfully");
	               
	        }
	        catch(Exception e) {
	        	System.out.println(e);
	        }

			return company.toString();
		}
*/

@Override
       public void editCompany(Company company) throws SQLException {
              //companyDao.updateCompany(company);
              System.out.println(company.getCompanyName());
              companyDao.save(company);
       }

@Override
           public Company fetchStockUpdate(int companyId)
           {
               return companyDao.getOne(companyId);
           }

@Override
public void deleteCompany(Company company) {
	// TODO Auto-generated method stub
	companyDao.delete(company);
	
}

/*@Override
public List<Sector> getSectorList() throws SQLException {
	// TODO Auto-generated method stub
	return sectorDao.findAll();
}

*/
              
}


