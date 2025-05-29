package com.codewithantriksh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithantriksh.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	

}
