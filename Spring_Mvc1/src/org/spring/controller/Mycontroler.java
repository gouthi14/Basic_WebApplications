package org.spring.controller;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.spring.domain.Person;
import org.springframework.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;







@Controller
@RequestMapping("/main")
public class Mycontroler {

	private static Logger logger=Logger.getLogger("controller");
	
	@Resource(name="PersonService")
	
	private PersonService personService;
	
	
	
	@RequestMapping(value="/persons",method=RequestMethod.GET)
	
	public String getPersons(Model model)
	{
		logger.debug("Requesting to dislay Information");
		
		List<Person>persons=personService.getAll();
		model.addAttribute("persons",persons);
		return "personpage";
		
	}
	
	@RequestMapping(value="/persons/add",method=RequestMethod.GET)
	public String add(@RequestParam(value="firstName",required=true)String firstName,
			          @RequestParam(value="lastName",required=true)String lastName,
			          @RequestParam(value="amount",required=true)int amount)
	{
	logger.debug("add new person");
	personService.add(firstName,lastName,amount);
	return "addedpage";
}
	
	
	@RequestMapping(value="/persons/delete",method=RequestMethod.GET)	
	public String delete(@RequestParam(value="id",required=true)Integer id,Model model)
	{
		logger.debug("Del Existing Person Info");
		personService.delete(id);
		model.addAttribute("id",id);
		return "deletepage";
	}

	
	@RequestMapping(value="/persons/add",method=RequestMethod.GET)
	public String delete(@RequestParam(value="id",required=true) Integer id,
			@RequestParam(value="firstName",required=true)String firstName,
	          @RequestParam(value="lastName",required=true)String lastName,
	          @RequestParam(value="amount",required=true)int amount,Model model)
	{
		logger.debug("Edit existing Person Info");
		personService.edit(id,firstName,lastName,amount);
		model.addAttribute("id",id);
		
return "editpage";
	
	
	
	
	
	
	}
	
	
		



    }
	
	

	

