package com.bobby.dojosurvey;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object>map) {
		return "index.jsp";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
		public String login(@RequestParam(value = "username") String username,
			@RequestParam("location") String location,
			@RequestParam("language") String language,
			Map<String, Object> map) {
			
			map.put("username", username);
			map.put("location", location);
			map.put("language", language);
			
			return "result.jsp";
	}
}
