package com.world101.projname.web.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.world101.projname.web.front.service.spec.MessageGenerater;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

	private final MessageGenerater messageGenerater;

	@Autowired
	public HelloWorldController(MessageGenerater messageGenerater) {
		this.messageGenerater = messageGenerater;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		ModelAndView result = new ModelAndView();
		result.setViewName("helloworld");
		result.addObject("message", messageGenerater.getMessage());
		return result;
	}

}
