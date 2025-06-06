package com.codewithantriksh.blog.services;

import java.util.List;

import com.codewithantriksh.blog.entities.Post;
import com.codewithantriksh.blog.payloads.PostDto;
import com.codewithantriksh.blog.payloads.PostResponse;

public interface PostService {

	// create

	PostDto createPost(PostDto postDto,Integer userId,Integer categotyId);

	// update

	PostDto updatePost(PostDto postDto, Integer postId);

	// delete

	void deletePost(Integer postId);

	// get all posts

	PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy,String sortDir );

	// get single post

	PostDto getPostById(Integer postId);

	// get all post by category

	List<PostDto> getPostByCategory(Integer categoryId);

	// get all posts by user

	List<PostDto> getPostByUser(Integer userId);

	// search posts
	List<PostDto> searchPosts(String keyword);

}
