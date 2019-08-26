package com.example.springmvc.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.Company;
import com.example.springmvc.model.IPODetail;
import com.example.springmvc.service.CompanyService;
import com.example.springmvc.service.IPOPlannedService;
import com.example.springmvc.service.StockExchangeService;
@Controller
public class IPOPlannedControllerImpl implements IPOPlannedController {
@Autowired
private IPOPlannedService ipoPlannedService;
@Autowired
private CompanyService companyService;
@Autowired
private StockExchangeService stockExchangeService;

@Override
@RequestMapping(value="/addIPO")
public String form(IPODetail ipoDetail,ModelMap model) throws SQLException {
	// TODO Auto-generated method stub
	//ModelAndView mav = null;
	//ModelMap map=new ModelMap();
   // company = companyService.fetchStockUpdate(companyId);
	System.out.println("ipo form");
   ArrayList companyDetails =(ArrayList) companyService.getCompanyList();
    model.addAttribute("companyList",companyDetails);
    System.out.println(companyDetails);
//map.addAttribute("update", company);
//mav = new ModelAndView("CompanyUpdate");
//return mav;
    System.out.println("company form");
	model.addAttribute("a1",ipoDetail);
	ArrayList stockDetails =(ArrayList) stockExchangeService.getStockExchange();
    model.addAttribute("stockList",stockDetails);
    model.addAttribute("a1",ipoDetail);
	System.out.println("company form");
	return "addIPO";
}

	@Override
	@RequestMapping(value="/addIPODetail")
	public String insertIPODetail(@ModelAttribute("a1") @Validated IPODetail ipoDetail,ModelMap model,HttpServletRequest request,HttpServletResponse response)throws SQLException {
		System.out.println("inside controller");
		// TODO Auto-generated method stub
		
		 model.addAttribute("a1",ipoDetail);
		System.out.println(request.getParameter("companyCode"));
	    System.out.println(ipoDetail.getCompanyCode());
		ipoPlannedService.insertIPODetail(ipoDetail);
		return "adminLandingPage";
	}

	
	@Override
	@RequestMapping(value="/displayIPO")
	public ModelAndView getIPODetais() throws SQLException {
	
		// TODO Auto-generated method stub
		ModelAndView mv=new ModelAndView();
		mv.setViewName("displayIPO");
		mv.addObject("displayIPO",ipoPlannedService.getIPODetais());
		return mv;
	}

@RequestMapping("/ipoUpdate")
       public ModelAndView companyUpdation(@RequestParam("id") int id, ModelMap map, HttpServletRequest request,
                     @ModelAttribute("a1") IPODetail ipoDetail,HttpSession session) throws ClassNotFoundException, SQLException {
              ModelAndView mav = null;
                           ipoDetail = ipoPlannedService.fetchStockUpdate(id);
                           
                           ArrayList companyDetails =(ArrayList) companyService.getCompanyList();
                           map.addAttribute("companyList",companyDetails);
                   //  map.addAttribute("update", ipoDetail);
                     
                     ArrayList stockDetails =(ArrayList) stockExchangeService.getStockExchange();
                     map.addAttribute("stockList",stockDetails);
              // map.addAttribute("update", ipoDetail);
                           
                           ArrayList ipoDetails =(ArrayList) ipoPlannedService.getIPODetais();
                           map.addAttribute("ipoList",ipoDetails);
                     map.addAttribute("update", ipoDetail);
                     mav = new ModelAndView("IpoUpdate");
                     return mav;
              
       }

@RequestMapping(value = "/editIpoDetail", method = RequestMethod.POST)
public ModelAndView editCompany(HttpServletRequest request, ModelMap map, HttpSession session,
       @ModelAttribute("a1") IPODetail ipoDetail, BindingResult result) throws ClassNotFoundException, SQLException
              {
System.out.println("model and view");
       ModelAndView mav = new ModelAndView();
              ArrayList ipo = new ArrayList();
              int id= ipoDetail.getId();
             if (result.hasErrors()) {
                 IPODetail ipd=new IPODetail();
                    ipd= ipoPlannedService.fetchStockUpdate(id);
                    map.addAttribute("update", ipd);
                    System.out.println(ipd);
                    mav = new ModelAndView("IpoUpdate");
                    System.out.println("inside error");
                    return mav;
              }
              System.out.println("inside update ipo");
                ipoPlannedService.editIpo(ipoDetail);
                //System.out.println(company.getCompanyName());
                ipo = (ArrayList) ipoPlannedService.getIPODetais();
              map.addAttribute("displayIPO",ipo);
              mav = new ModelAndView("adminLandingPage");
              return mav;
       
}
@RequestMapping("/ipoDelete")
public String deleteCompany(@RequestParam("id") int id, ModelMap map, HttpServletRequest request,
        @ModelAttribute("a1") IPODetail ipoDetail,HttpSession session) throws ClassNotFoundException, SQLException {
 ModelAndView mav = null;
 ipoDetail = ipoPlannedService.fetchStockUpdate(id);
 ipoPlannedService.deleteIpo(ipoDetail);
 //mav = new ModelAndView("updateCompany");
return "userLandingPage";
}

	@Override
	public String insertIPODetail(IPODetail ipoDetail) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String display() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertIPODetail(IPODetail ipoDetail, HttpServletRequest request, HttpServletResponse response)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

/*@Override
@RequestMapping(value="/displayIPO")
public String display() {
	return "displayIPO";
}*/
	
}
