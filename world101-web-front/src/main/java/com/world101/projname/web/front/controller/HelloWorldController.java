package com.world101.projname.web.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.world101.projname.web.front.dto.UserDto;
import com.world101.projname.web.front.repositories.spec.UserRepository;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {

	
	private final UserRepository userRepository;
	
	@Autowired
	public HelloWorldController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		ModelAndView result = new ModelAndView();
		result.setViewName("helloworld");
		userRepository.save(UserDto.valueOf(0L, "freedom", "li lintao", "qweqwe"));
		result.addObject("message", userRepository.findByLoginName("freedom").getUserName());
		return result;
	}

}
