package com.axsos.me.controllers;

import org.springframework.stereotype.Controller;

import com.axsos.me.services.CategoryService;
import com.axsos.me.services.ProductService;

@Controller
public class CategoryController {
	
	private final CategoryService catServ;
	private final ProductService prodServ;
	
	public CategoryController(CategoryService catServ, ProductService prodServ) {
		this.catServ = catServ;
		this.prodServ = prodServ;
	}

}
