package com.world101.projname.web.front.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.world101.projectname.web.front.viewmodel.LoginUser;

@Controller
@RequestMapping("/authentication")
public class AuthenticationController {
	
	Logger logger = LoggerFactory.getLogger(AuthenticationController.class);
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView authenticate(@Valid LoginUser loginUser, Errors errors) {
		if(errors.hasErrors()) {
			return getErrorView("user or password is not correct!");
		}
		logger.trace("user {} try to login.", loginUser.getUsername());
		ModelAndView result = new ModelAndView();
		result.setViewName("index");
		result.addObject("username", loginUser.getUsername());
		return result;
	}
	
	private ModelAndView getErrorView(String msg) {
		ModelAndView result = new ModelAndView();
		result.setViewName("login");
		result.addObject("error", msg);
		return result;
	}
	
}
