package org.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;


@Controller
public class Mycontroller {

	@RequestMapping("/Hello")
	public ModelAndView helloWorld(){
		String message="Hello Goutham Whats Going on";
		return new ModelAndView("Hello","message",message);
	}
}
