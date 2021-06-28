package com.axsos.me.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.me.models.Product;
import com.axsos.me.repositories.ProductRepository;
@Service
public class ProductService {

	private final ProductRepository prodRepo;
	
	public ProductService(ProductRepository prodRepo) {
		this.prodRepo=prodRepo;
	}
	
	public Long create(Product product) {
		prodRepo.save(product);
		return product.getId();
	}
	public List<Product> readAll(){
		return (List<Product>) prodRepo.findAll();
	}
	public Optional<Product> readOne(Long id) {
		return prodRepo.findById(id);	
	}
}
