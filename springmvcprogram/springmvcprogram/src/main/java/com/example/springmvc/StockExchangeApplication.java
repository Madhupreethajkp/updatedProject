package com.example.springmvc;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springmvc.controller.CompanyController;
import com.example.springmvc.controller.IPOPlannedController;
import com.example.springmvc.controller.SectorController;
import com.example.springmvc.controller.StockExchangeController;
import com.example.springmvc.controller.StockPriceController;
import com.example.springmvc.controller.UserController;
import com.example.springmvc.model.Company;
import com.example.springmvc.model.IPODetail;
import com.example.springmvc.model.Sector;
import com.example.springmvc.model.StockExchange;
import com.example.springmvc.model.StockPrice;
import com.example.springmvc.model.User;

//@SpringBootApplication
public class StockExchangeApplication {

	public static void main(String[] args) throws Exception {
		
		System.out.println("before the container");
		Company company=new Company();
		User user=new User();
		IPODetail ipoDetail=new IPODetail();
		Sector sector=new Sector();
		StockExchange stockExchange=new StockExchange();
		StockPrice stock=new StockPrice();
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("after the container");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		
		
		
		System.out.println("1.Company\n 2. User \n 3.IPODetail \n4.StockExchange \n5.StockPrice \n 6.Sector");
		int n=sc.nextInt();
		switch(n) {
		
		case 1:
		  CompanyController companyController=(CompanyController)applicationContext.getBean("companyControllerImpl");
		 companyController.insertCompany(company);		
	      companyController.getCompanyList();
	      break;
	      
		case 2:
			UserController userController=(UserController)applicationContext.getBean("userControllerImpl");
			userController.insertUser(user);
			userController.getUserList();
			break;
		case 3:
			
	       IPOPlannedController ipoPlannedController=(IPOPlannedController)applicationContext.getBean("ipoPlannedControllerImpl");
	       ipoPlannedController.insertIPODetail(ipoDetail);
	       ipoPlannedController.getIPODetais();
	       break;
		case 4:
			StockExchangeController stockExchangeController=(StockExchangeController)applicationContext.getBean("stockExchangeControllerImpl");
			stockExchangeController.insertStockExchange(stockExchange);
			stockExchangeController.getStockExchange();
			break;
		case 5:
			StockPriceController stockPriceController=(StockPriceController)applicationContext.getBean("stockPriceControllerImpl");
			stockPriceController.insertStock(stock);
			stockPriceController.getStockPrice();
			break;
			
		case 6:
		
		SectorController sectorController=(SectorController)applicationContext.getBean("sectorControllerImpl");
		sectorController.insertSector(sector);
		sectorController.getSectorList();
		break;
		}
		
	}
}


