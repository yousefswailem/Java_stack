package com.axsos.me.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.me.models.User;
import com.axsos.me.services.UserService;

//imports removed for brevity
@Controller
public class Users {
	private final UserService userService;
 
 public Users(UserService userService) {
     this.userService = userService;
 }
 
 @RequestMapping("/registration")
 public String registerForm(@ModelAttribute("user") User user) {
     return "registrationPage.jsp";
 }
 @RequestMapping("/login")
 public String login() {
     return "loginPage.jsp";
 }
 
 @RequestMapping(value="/registration", method=RequestMethod.POST)
 public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session,Model model) {
	
	 if(result.hasErrors()) {
		 model.addAttribute("error1","Invalid credantials,please try agine");
 		return"registrationPage.jsp";
 	}
 	else if(!user.getPasswordConfirmation().equals(user.getPassword())) {
 		return"redirect:/registration";
 	}
 	else {
 		userService.registerUser(user);
 		session.setAttribute("userId", user.getId());
 		return"redirect:/login";
 	}
 }
 
 @RequestMapping(value="/login", method=RequestMethod.POST)
 public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
     // if the user is authenticated, save their user id in session
     // else, add error messages and return the login page
	 if(userService.authenticateUser(email, password) == true) {
 		
 		User u = userService.findByEmail(email);
 		
 		session.setAttribute("userId", u.getId());
 		
 		return"redirect:/home";
 	}
	 model.addAttribute("error","Invalid credantials,please try agine");
	 return"loginPage.jsp";
 }
 
 @RequestMapping("/home")
 public String home(HttpSession session, Model model) {
     // get user from session, save them in the model and return the home page
	 model.addAttribute("user",userService.findUserById((Long)session.getAttribute("userId")));
 	return"homePage.jsp";
 }
 @RequestMapping("/logout")
 public String logout(HttpSession session) {
     // invalidate session
     // redirect to login page
	 session.invalidate();
 	return"redirect:/login";
 }
}