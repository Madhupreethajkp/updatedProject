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
import com.example.springmvc.model.StockExchange;
import com.example.springmvc.service.StockExchangeService;
@Controller
public class StockExchangeControllerImpl implements StockExchangeController{
@Autowired
private StockExchangeService stockExchangeService;

@Override
@RequestMapping(value="/addStock",method=RequestMethod.GET)

public String stockForm(StockExchange stockExchange,ModelMap model) {
	model.addAttribute("s1", stockExchange);
	return "manageExhange";
}
@Override

@RequestMapping(value="/addStock")

	public String insertStockExchange(@ModelAttribute("s1")@Validated StockExchange stockExchange)throws SQLException {
		// TODO Auto-generated method stub
	stockExchangeService.insertStockExchange(stockExchange);
	System.out.println("inside controller");
	System.out.println(stockExchange.getStockexchange_name());
	return "manageExchange";
	}

	
	

@Override
@RequestMapping(value="/listStock")
public ModelAndView getStockExchange() throws SQLException{
	ModelAndView mv=new ModelAndView();
	mv.setViewName("listStock");
	mv.addObject("listStock", stockExchangeService.getStockExchange());
	return mv;
}

@RequestMapping("/stockUpdate")
       public ModelAndView companyUpdation(@RequestParam("id") int id, ModelMap map, HttpServletRequest request,
                     @ModelAttribute("s1") StockExchange stockExchange,HttpSession session) throws ClassNotFoundException, SQLException {
              ModelAndView mav = null;
                           stockExchange = stockExchangeService.fetchStockUpdate(id);
                           
                           
                     map.addAttribute("update", stockExchange);
                     mav = new ModelAndView("stockUpdate");
                     return mav;
              
       }

@RequestMapping(value = "/editStock", method = RequestMethod.POST)
public ModelAndView editCompany(HttpServletRequest request, ModelMap map, HttpSession session,
       @ModelAttribute("s1") StockExchange stockExchange, BindingResult result) throws ClassNotFoundException, SQLException
              {

       ModelAndView mav = null;
              ArrayList stockDetails = null;
              int id = stockExchange.getId();
              if (result.hasErrors()) {
                   StockExchange st=new StockExchange();
                    st= stockExchangeService.fetchStockUpdate(id);
                    map.addAttribute("update", st);
                    mav = new ModelAndView("stockUpdate");
                    return mav;
              }
                stockExchangeService.editStock(stockExchange);
                //System.out.println(stockExchange.getCompanyName());
                stockDetails = (ArrayList) stockExchangeService.getStockExchange();
              map.addAttribute("listStock", stockDetails);
              mav = new ModelAndView("listStock");
              return mav;
       
}
@RequestMapping("/stockDelete")
public String deleteCompany(@RequestParam("id") int id, ModelMap map, HttpServletRequest request,
        @ModelAttribute("s1") StockExchange stockExchange,HttpSession session) throws ClassNotFoundException, SQLException {
 ModelAndView mav = null;
stockExchange = stockExchangeService.fetchStockUpdate(id);
 stockExchangeService.deleteStock(stockExchange);
 //mav = new ModelAndView("updateCompany");
return "manageExchange";
}
}
