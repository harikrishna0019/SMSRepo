package org.sms.controller;

import java.util.logging.Logger;

import org.sms.models.User;
import org.sms.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@SuppressWarnings("unused")
@Controller
public class UserLoginController {
	@Autowired
	UserLoginService userLoginService;
	static Logger log = Logger.getLogger(UserLoginController.class.getName());
	
	
	
	@RequestMapping("/login")
	
	public ModelAndView userLogin(){
		ModelAndView modelAndView= new ModelAndView("login");
		
		return modelAndView;
	}
	
	@RequestMapping("/LoginSubmit")
	public ModelAndView userLoginSubmit(@ModelAttribute("user1")User user1,@RequestParam("login") String s){
		
		log.info(s);
		
		
		log.info("entered into userloginsubmit method");
		
		System.out.println("this is "+userLoginService);
		
		boolean userLogin=this.userLoginService.userLoginVerification(user1,s);
		log.info("after service method");
		System.out.println(userLogin);
		System.out.println(userLogin);
		/*if(userLogin)
		{
			ModelAndView modelAndView=new ModelAndView("success");
			return modelAndView;
		}else
		{
			ModelAndView modelAndView=new ModelAndView("failure");
			return modelAndView;
		}*/
	if(userLogin)
	{	
		if(s.equals("admin")){
			ModelAndView modelAndView=new ModelAndView("adminlogin");
			return modelAndView;
		}else
		{
			ModelAndView modelAndView=new ModelAndView("success");
			return modelAndView;
		}
		
	}else
	{
		ModelAndView modelAndView=new ModelAndView("failure");
		return modelAndView;	
	}
	}
}
