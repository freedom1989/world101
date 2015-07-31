package com.world101.projname.web.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView result = new ModelAndView();
		result.setViewName("login");
		return result;
	}
}
