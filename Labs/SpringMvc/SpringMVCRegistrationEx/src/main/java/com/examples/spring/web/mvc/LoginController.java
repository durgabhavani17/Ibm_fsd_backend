package com.examples.spring.web.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value= {"SpringREG/login"})
public class LoginController {
private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showRegisterForm() {
		ModelAndView modelView = new ModelAndView("login");
		return modelView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView register(@RequestParam("username") String username,@RequestHeader("host") String host,@RequestParam("password") String password, HttpServletRequest request) {
	    logger.info("host:{}",host);
		ModelAndView modelView = new ModelAndView("loginSuccess");
		HttpSession session = request.getSession();
		String name=session.getAttribute("username").toString();
		String pass=session.getAttribute("password").toString();
		modelView.addObject("username",username);
		/*
		 * if(username.equals(name)&&password.equals(pass)) {
		 * modelView.addObject("username",username); }else {
		 * logger.error("error:{}"+"enter correct user name and password"); }
		 */
		return modelView;
		
		
	}	
}
