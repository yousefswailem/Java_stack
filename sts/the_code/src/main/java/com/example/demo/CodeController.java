package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {

	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}

	
	@RequestMapping(value = "/check", method = RequestMethod.POST)
	public String check(HttpSession session, @RequestParam(value = "code") String code,RedirectAttributes redirectAttributes ) {
		String code1 = "code";
		session.setAttribute("th_code", code);
		if (code .equals(code1) ) {
			return "welcom.jsp";
		}
		 else {
			 redirectAttributes.addFlashAttribute("error", "TRY AGAIN");
		} 
		return "redirect:/home";

	}

}
