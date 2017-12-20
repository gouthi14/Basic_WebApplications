package org.spring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import org.spring.domain.Springemp1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.service.Emp1services;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

@Controller

public class Mycontroller {
	 
 
	
	    @Autowired  
	   Emp1services dao; 
	      
	     
	    @RequestMapping("/Addemp")  
	    public ModelAndView showform(){  
	        return new ModelAndView("Addemp","command",new Springemp1());  
	    }  
	    
	    @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public ModelAndView save(@ModelAttribute("Springemp1") Springemp1 emp){  
	        dao.save(emp);  
	        return new ModelAndView("redirect:/viewemp");
	    }  
	   
	    @RequestMapping("/Viewdetails")  
	    public ModelAndView viewemp(){  
	        List<Springemp1> list=dao.getEmployees();  
	        return new ModelAndView("Viewdetails","list",list);  
	    }  
	    
	    @RequestMapping(value="/edit/{id}")  
	    public ModelAndView edit(@PathVariable int id){  
	        Springemp1 emp=dao.getEmpById(id);  
	        return new ModelAndView("Editemp","command",emp);  
	    }  
	   
	    @RequestMapping(value="/edit",method = RequestMethod.POST)  
	    public ModelAndView editsave(@ModelAttribute("Springemp1") Springemp1 emp){  
	        dao.update(emp);  
	        return new ModelAndView("redirect:/Viewdetails");  
	    }  
	   
	    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)  
	    public ModelAndView delete(@PathVariable int id){  
	        dao.delete(id);  
	        return new ModelAndView("redirect:/Viewdetails");  
	    }  
	  
	}  

