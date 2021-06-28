package com.axsos.me.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.me.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

	Product findOne(Long id);
	
}