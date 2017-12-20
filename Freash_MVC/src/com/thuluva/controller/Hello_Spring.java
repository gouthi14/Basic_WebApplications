package com.thuluva.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;



public class Hello_Spring extends AbstractController {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse respone) throws Exception {
		ModelAndView modelandview=new ModelAndView("MyJsp");
		modelandview.addObject("welcomeMessage","Hi this is goutham from izeal");
		
		return modelandview;
	}

}
