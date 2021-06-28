package com.axsos.me.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.axsos.me.models.Product;
import com.axsos.me.repositories.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository prodRepo;
	
	public ProductService(ProductRepository prodRepo) {
		this.prodRepo = prodRepo;
	}
	
	public Long create(Product product) {
		prodRepo.save(product);
		return product.getId();
	}
	
	public List<Product> readAll(){
		return (List<Product>) prodRepo.findAll();
	}
	
	public Product readOne(Long id) {
		return prodRepo.findOne(id);	
	}
	
	public void update(Product product) {
		product.setUpdatedAt(new Date());
		prodRepo.save(product);
	}
	
	public void delete(Long id) {
		prodRepo.deleteById(id);
	}
	
	
}