package com.codewithantriksh.blog.payloads;

import java.util.Date;

import com.codewithantriksh.blog.entities.Category;
import com.codewithantriksh.blog.entities.User;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

	private String title;
	
	private String content;
	
	private String imageName;
	
	private Date adddedDate;
	
	private CategoryDto category;
	
	private UserDto user;
}

	
	
	

