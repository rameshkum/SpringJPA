package com.cyb.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cyb.bean.Person;
import com.cyb.dao.PersonImplementaion;

@Controller
public class AddPersonController {

	@RequestMapping(value="/remove",method=RequestMethod.GET)
	public ModelAndView removePerson(@RequestParam int id,ModelMap map){
		int pid=id;
		new PersonImplementaion().deleteEmployee(pid);
		List<Person> pd= new PersonImplementaion().loadTable();
		map.addAttribute("pd" ,pd);
		return new ModelAndView("addperson", "command", new Person());
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView addper(ModelMap map) {
		List<Person> pd= new PersonImplementaion().loadTable();
		map.addAttribute("pd" ,pd);
		return new ModelAndView("addperson", "command", new Person());
	}
	
	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public ModelAndView addPerson(@ModelAttribute("person") Person person, ModelMap map) {
		new PersonImplementaion().addPersonJPA(person);
		List<Person> pd= new PersonImplementaion().loadTable();
		map.addAttribute("pd" ,pd);
		return new ModelAndView("addperson", "command", new Person());

	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editPerson(@RequestParam String editid,ModelMap map)
	{
		List<Person> pd= new PersonImplementaion().loadTable();
		map.addAttribute("pd" ,pd);
		map.addAttribute("pid", editid);
		return new ModelAndView("editperson", "command", new Person());
	}
	
	@RequestMapping(value = "/updated", method = RequestMethod.POST)
	public ModelAndView editPerson(@ModelAttribute("person") Person person, ModelMap map) {
		new PersonImplementaion().updatePerson(person);
		List<Person> pd= new PersonImplementaion().loadTable();
		map.addAttribute("pd" ,pd);
		return new ModelAndView("addperson", "command", new Person());

	}
}
