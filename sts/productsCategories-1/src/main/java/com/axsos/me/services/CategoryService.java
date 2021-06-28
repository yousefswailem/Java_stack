package com.axsos.me.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.me.models.Category;
import com.axsos.me.repositories.CategoryRepository;
@Service
public class CategoryService {
	private	final CategoryRepository catRepo;
	
	public CategoryService(CategoryRepository catRepo) {
		this.catRepo=catRepo;
	}
	
	public Long createCategory(Category category) {
		catRepo.save(category);
		return category.getId();
	}
	public List<Category> readAll(){
		return (List<Category>) catRepo.findAll();
	}
	public Optional<Category> readOne(Long id) {
		return catRepo.findById(id);
	}
	
}
