package com.example.springmvc.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
import com.example.springmvc.model.Sector;
import com.example.springmvc.model.StockExchange;
import com.example.springmvc.service.SectorService;
@Controller
public class SectorControllerImpl implements SectorController {
@Autowired
private SectorService sectorService;

@Override
@RequestMapping(value="/compareSector")
public String compareSector() {
	return "compareSector";
}


@Override
@RequestMapping(value="/listSector")
public ModelAndView getSectorList() throws Exception {
	// TODO Auto-generated method stub
	ModelAndView mv  = new ModelAndView();
	mv.setViewName("listSector");
	
	mv.addObject("listSector", sectorService.getSectorList());
	return mv;
		}

	
	

@Override
@RequestMapping(value="/addSector",method=RequestMethod.GET)
public String create(Sector sector,ModelMap model) {
	// TODO Auto-generated method stub
	model.addAttribute("sec",sector);
	return "sectorForm";
}


	@Override
	@RequestMapping(value="/addSector",method=RequestMethod.POST)
	public String insertSector(@ModelAttribute("sec") @Validated Sector sector) throws SQLException {
		// TODO Auto-generated method stub
		sectorService.insertSector(sector);
		 return "manageCompany";
			

}
	

@RequestMapping("/sectorUpdate")
       public ModelAndView companyUpdation(@RequestParam("sector_id") int sector_id, ModelMap map, HttpServletRequest request,
                     @ModelAttribute("sec") Sector sector,HttpSession session) throws ClassNotFoundException, SQLException {
              ModelAndView mav = null;
                           sector = sectorService.fetchStockUpdate(sector_id);
                           
                           
                     map.addAttribute("update", sector);
                     mav = new ModelAndView("sectorUpdate");
                     return mav;
              
       }

@RequestMapping(value = "/editSector", method = RequestMethod.POST)
public ModelAndView editCompany(HttpServletRequest request, ModelMap map, HttpSession session,
       @ModelAttribute("sec") Sector sector, BindingResult result) throws ClassNotFoundException, SQLException
              {

       ModelAndView mav = null;
              ArrayList sectorDetails = null;
              int id = sector.getSector_id();
              if (result.hasErrors()) {
                 Sector st=new Sector();
                    st= sectorService.fetchStockUpdate(id);
                    map.addAttribute("update", st);
                    mav = new ModelAndView("sectorUpdate");
                    return mav;
              }
                sectorService.editStock(sector);
                //System.out.println(stockExchange.getCompanyName());
                sectorDetails = (ArrayList) sectorService.getSectorList();
              map.addAttribute("listSector", sectorDetails);
              mav = new ModelAndView("listSector");
              return mav;
       
}
@RequestMapping("/sectorDelete")
public String deleteSector(@RequestParam("sector_id") int sector_id, ModelMap map, HttpServletRequest request,
        @ModelAttribute("sec") Sector sector,HttpSession session) throws ClassNotFoundException, SQLException {
 ModelAndView mav = null;
 sector = sectorService.fetchStockUpdate(sector_id);
 sectorService.deleteSector(sector);
 //mav = new ModelAndView("updateCompany");
return "userLandingPage";
}
}