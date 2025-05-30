package com.codewithantriksh.blog.services;

import java.util.List;

import com.codewithantriksh.blog.entities.Post;
import com.codewithantriksh.blog.payloads.PostDto;

public interface PostService {

	// create

	PostDto createPost(PostDto postDto,Integer userId,Integer categotyId);

	// update

	Post updatePostn(PostDto postDto, Integer postId);

	// delete

	void deletePost(Integer postId);

	// get all posts

	List<Post> getAllPost();

	// get single post

	Post getPostById(Integer postId);

	// get all post by category

	List<PostDto> getPostByCategory(Integer categoryId);

	// get all posts by user

	List<PostDto> getPostByUser(Integer userId);

	// search posts
	List<Post> searchPosts(String keyword);

}
