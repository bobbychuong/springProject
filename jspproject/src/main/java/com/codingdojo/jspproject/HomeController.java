package com.codingdojo.jspproject;

import java.util.Date;


import java.sql.Timestamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("sessionAttribute")
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("sessionAttribute", "exampleData");
		return "redirect:/";
	}
	@RequestMapping("/date")
	public String d(Model model) {
		new java.util.Date();
		Date date = new Date();
		model.addAttribute("date", date);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String t(Model model) {
		new java.util.Date();
		Timestamp time = new Timestamp(System.currentTimeMillis());
		model.addAttribute("time", time);
		return "time.jsp";
	}
}
