package com.codewithantriksh.blog.services;

import java.util.List;

import com.codewithantriksh.blog.payloads.CategoryDto;

public interface CategoryService {
	
	// create 
	CategoryDto createCategory(CategoryDto categoryDto);
	
	// upadate
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	// delete 
	 void deleteCategory (Integer categoryid);
	
	//get
	 CategoryDto getCategory(Integer categoryId);
	
	// get all
	
	 List<CategoryDto> getCategories();

}
