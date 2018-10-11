package com.cg.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ControllerClass {
	
	@RequestMapping("/index")
	public String getIndexPage(){

		return "index";
	}
	
	@RequestMapping("viewall")
	public String getViewPage(Model m){
		ArrayList<User> userlist=new ArrayList<User>();
		
		User u1=new User();
		User u2=new User();
		User u3=new User();
		u1.setName("Sanjay");
		u2.setName("Niraj");
		u3.setName("Rohan");
		
		u1.setAge("21");
		u2.setAge("22");
		u3.setAge("23");
		
		userlist.add(u1);
		userlist.add(u2);
		userlist.add(u3);
		
		m.addAttribute("listObj",userlist);
		
		return "viewall";
		
	}
	
	
	
	
	@RequestMapping("register")
	public String getRegisterPage(Model m){
		User user=new User();
		m.addAttribute("userObj",user);
		return "register";
		
	}
	
	@RequestMapping("registeruser")
	public String registerUser(Model m,@ModelAttribute("userObj") User user){
		m.addAttribute("uObj",user);
		
		return "registersuccess";
	}
	
	@RequestMapping("/login")
	public String getLoginPage()
	{
		return "login";
	}
	
	@RequestMapping(value="loginuser")
	public String loginUser(Model m,@RequestParam("usName") String usName,@RequestParam("psw") String psw){
		//data carried in request scope
		
		m.addAttribute("userName",usName);
		m.addAttribute("password",psw);
		
		if(usName.equals(psw))
		{
		return "loginsuccess";
		}
		else
		{
			m.addAttribute("msg", "Wrong Password");
		return "login";
		
		}
	}

}
