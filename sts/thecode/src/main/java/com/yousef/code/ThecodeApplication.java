package com.yousef.code;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SpringBootApplication
@Controller
public class ThecodeApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ThecodeApplication.class, args);
	}
	@RequestMapping("/index")
	public String index() {
		return "index.jsp";
	}

	
	@RequestMapping(value = "/code", method = RequestMethod.POST)
	public String check(HttpSession session, @RequestParam(value = "code") String code,RedirectAttributes redirectAttributes ) {
		String pass = "code";
		session.setAttribute("the_pass", code);
		if (code .equals(pass) ) {
			return "next.jsp";
		}
		 else {
			 redirectAttributes.addFlashAttribute("error", "TRY AGAIN");
		} 
		return "redirect:/index";

	}

}
