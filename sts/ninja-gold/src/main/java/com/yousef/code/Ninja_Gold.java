package com.yousef.code;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class Ninja_Gold{
	private static int gold =0;
	private static int min =-50;
	private static int max =50;
	 @RequestMapping("/")
	    public String index() {
	    	return "index.jsp";	        
	    }
	 @RequestMapping(value="/farm", method=RequestMethod.GET)
		public static String farm(HttpSession session) {
		 Random r = new Random();
	     gold+=r.nextInt(10+1) + 10;   
		session.setAttribute("amount", gold);
			return "index.jsp";
	 }
	 @RequestMapping(value="/cave", method=RequestMethod.GET)
		public static String cave(HttpSession session) {
		 Random r = new Random();
	     gold+=r.nextInt(5+1) + 5;   
		session.setAttribute("amount", gold);
			return "index.jsp";
}
	 @RequestMapping(value="/house", method=RequestMethod.GET)
		public static String house(HttpSession session) {
		 Random r = new Random();
	     gold+=r.nextInt(2+1) + 3;   
		session.setAttribute("amount", gold);
			return "index.jsp";
	 }
	 @RequestMapping(value="/casino", method=RequestMethod.GET)
		public static String casino(HttpSession session) {
		 Random r = new Random();
	     gold+=r.nextInt((max - min) + 1) + min;   
		session.setAttribute("amount", gold);
			return "index.jsp";
	 }
}