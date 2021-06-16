package com.yousef.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class DisplayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	
	}
	@Controller
	public class HomeController {
	    @RequestMapping("/")
	    public String index() {
	    	return "index.jsp";
	        
	    }
	    @RequestMapping("/time")
	    public String time(Model viewModel) {
	    	Date d = new Date();
			SimpleDateFormat formattedAsTime = new SimpleDateFormat("h:mm a");
			viewModel.addAttribute("theTime", formattedAsTime.format(d));
	        return "time.jsp";
	    }
	    @RequestMapping("/date")
	    public String date(Model viewModel) {
	    	Date d = new Date();
			SimpleDateFormat formattedAsDate = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY");
			viewModel.addAttribute("theDate", formattedAsDate.format(d));
	    	return "date.jsp";
	}
	}
}
