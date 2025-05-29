package com.codewithantriksh.blog.repositories;

import com.codewithantriksh.blog.entities.Category; 

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
