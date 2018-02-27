package com.springtx.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class DefaultController {

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String defaultLocation()
	{
		
		System.out.println("hello I am here...");
		
		
		//return new ModelAndView();
		return "defaulthome";
	}
	

}
