 package com.tka1.mvcProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tka1.mvcProject.entey.User;

@Controller
public class MVCController {
	
	
	@RequestMapping("/")
	public ModelAndView openLoginPage() {
		
		return new ModelAndView("login");
	}
	@RequestMapping("/loginpage")
	public ModelAndView loginpage(@RequestParam String username, @RequestParam String password, Model modle) {
		if(username.equals("Gopal") && password.equals("bangale@123")) {
			return new ModelAndView("home");
		}else {
			modle.addAttribute("msg", "Invalid Credintials!!");
			return new ModelAndView("login");
		}
	}

}
