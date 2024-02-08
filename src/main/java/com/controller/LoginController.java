package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

	@RequestMapping(value = "/")

	public String openLoginPage() {
	return "Login";
	}

	@RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
	public String loginCheckDetails(HttpServletRequest req, Model mm) {	// DI HttpServletRequest 
	String emailid = req.getParameter("emailid");
	String password = req.getParameter("password");
	if(emailid.equals("aradhanakdubey@gmail.com") && password.equals("Aradhana0712")) {
	mm.addAttribute("msg", " aradhanakdubey @gmail.com");
	return "success";
	}else {
	return "failure";
	}
	}

	}

	

