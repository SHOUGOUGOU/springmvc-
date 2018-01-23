package com.sunda.logindemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("username")
public class HomeController {
	
	
	@RequestMapping(value = "/")
	public String home() {
		return "login";
	}
	@RequestMapping(value = "/test")
	public String home1() {
		return "test";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("username") String username,@RequestParam("password") String password,Model model ) throws Exception {
				if(username.equals("admin")&&password.equals("123456")){
					User user = new User();
					user.setUsername(username);
					user.setPassword(password);
				    model.addAttribute("username",user );

					return "success";
					
				}
				return "login";
	}
	
}
