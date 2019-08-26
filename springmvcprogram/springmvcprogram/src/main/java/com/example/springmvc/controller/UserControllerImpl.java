package com.example.springmvc.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.User;
import com.example.springmvc.service.UserService;

@Controller
public class UserControllerImpl implements UserController {
	@Autowired
	private UserService userService;



	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
    @RequestMapping(path= "/Login")
    public ModelAndView registerCompany( @ModelAttribute("user") @Validated User user, BindingResult result,
                  HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {

     ModelAndView mav = null;

     String username = user.getUserName();
     

     List<User> user1 = userService.findByUsername(username);

     User user2 = user1.get(0);
     System.out.println(user.getUserName()+" "+user2.getUserName());
     
System.out.println(user.getPassword()+" "+user2.getPassword());
     if ((user.getUserName().equals(user2.getUserName())) && (user.getPassword().equals(user2.getPassword()))) {

            if (user2.getUserType().equals("Admin") || user2.getUserType().equals("admin")) {
                  mav = new ModelAndView("adminLandingPage");
            } else {
                  mav = new ModelAndView("userLandingPage");
            }
     } else {

           // mav = new ModelAndView("Login", "message", "Invalid Username or Password");
                     mav= new ModelAndView("userRegistration");
      }

     return mav;


    }



	@RequestMapping(value="/userRegister")
	public String registration(User user,ModelMap model) {
		model.addAttribute("user",user);
		return "userRegistration";
	}
	@RequestMapping(value="/userLogin")
	public String userLogin()
	{
		return "userLogin";
	}

	@Override
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String insertUser(@ModelAttribute("user") @Validated User user) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Registerd");
		/*user.setUserName(request.getParameter("name"));
		user.setPassword(request.getParameter("password"));
		user.setE_mail(request.getParameter("email"));
		user.setMobileNumber(request.getParameter("mobile"));
		System.out.println(user.getE_mail());*/
		//JOptionPane.showMessageDialog(null, "Your details are submitted successfully");

	userService.insertUser(user);
	return "userLogin";
			
	}
            
	
	@RequestMapping(value="/userValidate")
	public String validateUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html");
        
        System.out.println("welcome");
       String userName=request.getParameter("userName");
       System.out.print(userName);
        String password=request.getParameter("password");
        User u=new User(userName,password);
        System.out.println(u.getUserName()+""+u.getPassword());
       int i= userService.validateUser(u);
       if(i!=0) {
    		HttpSession session=request.getSession();
    		session.setAttribute("userName", userName);
			System.out.println(userName);
    		return "userLandingPage";
    	     	  
    		}
    	   
   		
       
       else
       {/*
    	   JFrame f;  
    	
    	       f=new JFrame();  
    	       JOptionPane.showMessageDialog(f,"Invalid UserName or Password!");  */
    	  
	return "userLogin";
	}
	
}

	public List<User> getUserList() throws Exception {
		// TODO Auto-generated method stub
		return userService.getUserList();
			}
	
	public static void main(String [] args) {
		//CompanyController companyController=new CompanyControllerImpl();
		UserController userController=new UserControllerImpl();
		
		try {
			System.out.println(userController.getUserList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}




	

}
