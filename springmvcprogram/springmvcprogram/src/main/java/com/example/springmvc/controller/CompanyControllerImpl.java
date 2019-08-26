package com.example.springmvc.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
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
import com.example.springmvc.service.CompanyService;
import com.example.springmvc.service.SectorService;
@Controller
public class CompanyControllerImpl implements CompanyController {
@Autowired
private CompanyService companyService;

@Autowired
private SectorService sectorService;

//private static final Logger log=Logger.getLogger(CompanyControllerImpl.class);
@RequestMapping(value="/indexPage")
	public String indexPage() {
	return "index";
}
@RequestMapping(value="/editButton")
public String editPage() {
return "editCompany";
}
@RequestMapping(value="/logout")
public String logOut() {
	return "index";
}
@RequestMapping(value="/import")
public String importData() {
return "importData";
}
@RequestMapping(value="/manageCompany")
public String manageCompany() {
return "manageCompany";
}
@RequestMapping(value="/manageExchange")
public String manageExchange() {
return "manageExchange";
}
/*@RequestMapping(value="/addIPO")
public String addIpo() {
return "addIPO";
}*/
@RequestMapping(value="/createCompany")
public String companyForm() {
return "companyForm";
}
@RequestMapping(value="/update")
public String update() {
return "updateCompany";
}
@RequestMapping(value="/adminLogin",method=RequestMethod.GET)
public String adminLogin()
{
	return "adminLogin";
}

@RequestMapping(value="/adminLanding",method=RequestMethod.GET)
public String adminLanding()
{
	return "adminLandingPage";
}

@Override
@RequestMapping(value="/addCompany",method=RequestMethod.GET)
public String form(Company company,ModelMap model) throws SQLException {
	// TODO Auto-generated method stub
	//ModelAndView mav = null;
	//ModelMap map=new ModelMap();
   // company = companyService.fetchStockUpdate(companyId);
	System.out.println("company form");
   ArrayList sectorDetails =(ArrayList) sectorService.getSectorList();
    model.addAttribute("sectorList",sectorDetails);
//map.addAttribute("update", company);
//mav = new ModelAndView("CompanyUpdate");
//return mav;
    System.out.println("company form");
	model.addAttribute("e1",company);
	System.out.println("company form");
	return "companyForm";
}


	@Override
	@RequestMapping(value="/addCompany",method=RequestMethod.POST)
	public String insertCompany(@ModelAttribute("e1") @Validated Company company) throws SQLException {
		// TODO Auto-generated method stub
		companyService.insertCompany(company);
		 return "manageCompany";
			
	}
	/*@Override
@RequestMapping(value="/editCompany",method=RequestMethod.GET)
public String form1(ModelMap model){
	Company company=new Company();
	model.addAttribute("editDetails", company);
	return "editCompany";
}
  @Override
	@RequestMapping(value="/editCompany",method=RequestMethod.POST)
	public ModelAndView editCompany(@ModelAttribute("editDetails") @Validated Company company,BindingResult result,ModelMap model,HttpServletRequest request)throws SQLException {
		// TODO Auto-generated method stub
    	System.out.println(request.getParameter("companyName"));
		System.out.println("inside update controller");
		System.out.println(company.getCompanyName());
model.addAttribute("companyName", company.getCompanyName());
model.addAttribute("turnover", company.getTurnOver());
model.addAttribute("ceo", company.getCEO());
model.addAttribute("boardOfDirectors", company.getBoardOfDirectors());
model.addAttribute("secorId", company.getSectorId());
model.addAttribute("briefWriteup", company.getBriefWriteup());
//companyService.insertCompany(company);
		 companyService.editCompany(company);
		return new ModelAndView ("redirect:/editCompany");
		
	}
*/

@RequestMapping("/companyUpdate")
       public ModelAndView companyUpdation(@RequestParam("id") int companyId, ModelMap map, HttpServletRequest request,
                     @ModelAttribute("e1") Company company,HttpSession session) throws ClassNotFoundException, SQLException {
              ModelAndView mav = null;
                           company = companyService.fetchStockUpdate(companyId);
                           ArrayList sectorDetails =(ArrayList) sectorService.getSectorList();
                           map.addAttribute("sectorList",sectorDetails);
                     map.addAttribute("update", company);
                     mav = new ModelAndView("CompanyUpdate");
                     return mav;
              
       }
@RequestMapping("/companyDelete")
public String deleteCompany(@RequestParam("id") int companyId, ModelMap map, HttpServletRequest request,
        @ModelAttribute("e1") Company company,HttpSession session) throws ClassNotFoundException, SQLException {
 ModelAndView mav = null;
 company = companyService.fetchStockUpdate(companyId);
 companyService.deleteCompany(company);
 //mav = new ModelAndView("updateCompany");
return "manageCompany";
}
@RequestMapping(value = "/editCompany", method = RequestMethod.POST)
public ModelAndView editCompany(HttpServletRequest request, ModelMap map, HttpSession session,
       @ModelAttribute("e1") Company company, BindingResult result) throws ClassNotFoundException, SQLException
              {

       ModelAndView mav = null;
              ArrayList companyDetails = null;
              int companyId = company.getCompany_code();
              if (result.hasErrors()) {
                    Company company1 = new Company();
                    company1= companyService.fetchStockUpdate(companyId);
                    map.addAttribute("update", company1);
                    mav = new ModelAndView("CompanyUpdate");
                    return mav;
              }
                companyService.editCompany(company);
                System.out.println(company.getCompanyName());
                companyDetails = (ArrayList) companyService.getCompanyList();
              map.addAttribute("updateCompany", companyDetails);
              mav = new ModelAndView("updateCompany");
              return mav;
       
}


	@Override
	@RequestMapping(value="/updateCompany")
	public ModelAndView getCompanyList() throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv  = new ModelAndView();
		mv.setViewName("updateCompany");
		
		mv.addObject("updateCompany", companyService.getCompanyList());
		return mv;
			}
	@Override
	@RequestMapping(value="/compareCompany")
	public String compareCompany() {
		return "compareCompany";
	}
	
	


	
	
		/*CompanyController companyController=new CompanyControllerImpl();
		
		try {
			System.out.println(companyController.getCompanyList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	
	/*public static void main(String[] args) throws Exception {
			//SpringApplication.run(StockExchangeApplication.class, args);
			System.out.println("before the container");
			Company company=new Company();
			//company.setBoardOfDirectors("df");
			//company.setCompany_code(1001);
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
			System.out.println("after the container");
			CompanyController companyController=(CompanyController)applicationContext.getBean("companyControllerImpl");
		//	companyController.insertCompany(company);		
		 System.out.println(companyController.getCompanyList());
	}
*/
}
