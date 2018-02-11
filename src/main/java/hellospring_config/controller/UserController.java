package hellospring_config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import hellospring_config.model.User;
import hellospring_config.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/list" ,method=RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView modal =new ModelAndView("user/list");
		modal.addObject("listUser",userService.listuser());
		return modal;
	}
	
	@RequestMapping(value="/add" ,method=RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView modal =new ModelAndView("user/form");
		modal.addObject("userForm",new User());
		return modal;
	}
	@RequestMapping(value="/update/{id}" ,method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") String id) {
		ModelAndView modal =new ModelAndView("user/form");
		modal.addObject("userForm",userService.findById(id));
		return modal;
	}
	
	@RequestMapping(value="/save" ,method=RequestMethod.POST)
	public String save(@ModelAttribute("userForm") User user) {
		if(user.getId()!=null && !user.getId().trim().equals(""))
		{
			userService.update(user);
		}
		else
		{
			userService.add(user);
		}
		
		
		return "redirect:/user/list";	
	}
	@RequestMapping(value="/delete/{id}" ,method=RequestMethod.GET)
	public String delete (@PathVariable("id") String id) {
		User user = userService.findById(id);
		userService.delete(user);
		
		return "redirect:/user/list";	
	}
	
	
	
}
