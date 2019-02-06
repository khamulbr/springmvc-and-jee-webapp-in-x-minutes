package com.in28minutes.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.login.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String sayHello() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String logIn(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (!loginService.validateUser(name, password)) {
			model.put("errorMessage", "Invalid credentials");
			return "login";
		}

		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}

}
