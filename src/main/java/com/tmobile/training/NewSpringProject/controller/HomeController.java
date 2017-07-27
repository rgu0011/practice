package com.tmobile.training.NewSpringProject.controller;

import java.io.IOException;
import java.util.*; // for Map

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
		
		ModelAndView mav = new ModelAndView("home");
		
		Map<String, String> educationMap = new HashMap<String, String>();
		educationMap.put("high school", "High School");
		educationMap.put("bachelors", "Bachelors");
		educationMap.put("masters", "Masters");
		
//		return new ModelAndView("home");
		return mav;
	}
	
	@RequestMapping(value="/profile", method = RequestMethod.POST)
	public ModelAndView processPRofile(@ModelAttribute("profile")Profile profile, Model model) throws IOException{
		model.addAttribute("profile", profile);
		return new ModelAndView("result");
	}
}
