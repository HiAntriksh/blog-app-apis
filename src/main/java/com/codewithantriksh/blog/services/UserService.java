package com.codewithantriksh.blog.services;


import java.util.List;

import com.codewithantriksh.blog.entities.User;
import com.codewithantriksh.blog.payloads.UserDto;

public interface UserService {
	
	
	 UserDto createUer(UserDto user);
	 UserDto updateUser(UserDto user, Integer userId); 
     UserDto getUserById(Integer userId);
     List<UserDto> getAllUser();
     
     void deleteUser (Integer userId);
}
