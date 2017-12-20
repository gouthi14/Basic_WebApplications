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
	
	
	
	/**@RequestMapping(value="/person",method=RequestMethod.POST)
	
	public String getPerson(Model model)
	{
		logger.debug("Requesting to dislay Information");
		
		List<Person>persons=PersonService.getAll();
		model.addAttribute("person",persons);
		return "personpage";
		
	}**/
	
	@RequestMapping(value="/persons/add",method=RequestMethod.GET)
	public String add(@RequestParam(value="firstName",required=true)String firstName,
			          @RequestParam(value="lastName",required=true)String lastName,
			          @RequestParam(value="email",required=true)String email,
			          @RequestParam(value="password",required=true)String password,
			          @RequestParam(value="confirmpassword",required=true)String confirmpassword,
			          @RequestParam(value="project",required=true)String project)
	{
	logger.debug("add new person");
	personService.add(firstName,lastName,email,password,confirmpassword,project);
	return "Login";
}
	
	
	/**@RequestMapping(value="/persons/delete",method=RequestMethod.GET)	
	public String delete(@RequestParam(value="id",required=true)Integer id,Model model)
	{
		logger.debug("Del Existing Person Info");
		personService.delete(id);
		model.addAttribute("id",id);
		return "DeletePerson";
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
		
return "EdditPerson";
	
	
	
	
	
	**/
	
	
	
		



    }
	
	

	

