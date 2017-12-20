package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Controller_Dao {

	@RequestMapping("/Myjsp")
	 public ModelAndView showform(){  
       
       return new ModelAndView("empform","command",new Timer_project());  
   }  
   @RequestMapping(value="/save",method = RequestMethod.POST)  
   public ModelAndView save(@ModelAttribute("Timer_project") Timer_project timer){  
       //write code to save emp object  
       //here, we are displaying emp object to prove emp has data  
       System.out.println(timer.getFirstName()+" "+timer.getLastName()+" "+timer.getEmail()+" "+timer.getPassword()+" "+timer.getConformPassword()+" "+timer.getProject());
       return new ModelAndView("redirect:/timer_project"); 
   }  
	
	
	
   }
		
		
	


