package com.axsos.me.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.me.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

	Category findOne(Long id);
	


}
