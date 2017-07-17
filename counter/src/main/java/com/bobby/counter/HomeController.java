package com.bobby.counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("counter")
public class HomeController {
	public static int counter;

	@RequestMapping("/")
	public String index() {
		counter++;
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(ModelMap model) {
		model.put("counter", counter);
		return "counter.jsp";
	}
}

