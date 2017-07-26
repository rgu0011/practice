package com.tmobile.training.NewSpringProject.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tmobile.training.model.Profile;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(@ModelAttribute("profile")Profile profile, Model model) throws IOException{
		
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/profile", method = RequestMethod.POST)
	public ModelAndView processPRofile(@ModelAttribute("profile")Profile profile, Model model) throws IOException{
		model.addAttribute("profile", profile);
		return new ModelAndView("result");
	}
}
