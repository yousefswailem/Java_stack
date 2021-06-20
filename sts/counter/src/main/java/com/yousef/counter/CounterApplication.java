package com.yousef.counter;

import javax.servlet.http.HttpSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class CounterApplication {
	private static int count;
	
	public CounterApplication() {
		count = 0;
	}
	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}
	
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(HttpSession session) {
		count++;
		session.setAttribute("visits", count);
		return "index.jsp";
	}
	
	@RequestMapping(value="/count", method=RequestMethod.GET)
	public String counter(Model model, HttpSession session) {
		model.addAttribute("visits", session.getAttribute("visits"));
		return "count.jsp";
	}
	

}