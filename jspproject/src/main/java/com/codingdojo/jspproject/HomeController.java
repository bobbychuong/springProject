package com.codingdojo.jspproject;

import java.util.Date;
import java.sql.Timestamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		return "index.jsp";
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
