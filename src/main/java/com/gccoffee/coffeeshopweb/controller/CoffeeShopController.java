package com.gccoffee.coffeeshopweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gccoffee.coffeeshopweb.User;
import com.gccoffee.coffeeshopweb.dao.UserRepository;



@Controller
public class CoffeeShopController {

	@Autowired
	UserRepository repo;
	
	@RequestMapping("/")
	public ModelAndView index() {
		System.out.println(repo.findAll());
		return new ModelAndView("coffee-shop");
	}
	
	
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register");
	}
	
	@PostMapping("forminfo")
	public ModelAndView formDetails(User user) {
		// TODO: add user to database through method
		//User newUser = new User();
		return new ModelAndView("adduser", "nU", user);
		
	}
}