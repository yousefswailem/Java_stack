package com.yousef.code;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class survey {
	
	
	    @RequestMapping("/")
	    public String index() {
	    	return "index.jsp";	        
	    }
	    
	    @RequestMapping(value="/form" , method=RequestMethod.POST)
	    public String show(HttpSession session,@RequestParam(value = "loc") String loc,@RequestParam(value = "lang") String lang, @RequestParam(value = "name") String name) {
	    	session.setAttribute("city_name",loc);
	    	session.setAttribute("game",lang);
	    	session.setAttribute("name",name);
	    	return "result.jsp";	        
	    }
	}

