package com.axsos.me.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.me.models.Category;
import com.axsos.me.models.Product;
import com.axsos.me.services.CategoryService;
import com.axsos.me.services.ProductService;

@Controller
public class HomeController implements ErrorController {
	
	private final ProductService prodServ;
	private final CategoryService catServ;
	
	public HomeController(ProductService prodServ, CategoryService catServ) {
		this.prodServ = prodServ;
		this.catServ = catServ;
	}
	
	@RequestMapping("/")
	public String redirect() {
		return "redirect:/main";
	}
	
	@RequestMapping("/main")
	public String main(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("category", new Category());
		model.addAttribute("categories", catServ.readAll());
		model.addAttribute("products", prodServ.readAll());
		return "index.jsp";
	}
	
	@RequestMapping("/error")
	public String error() {
		return "redirect:/main";
	}
	
}