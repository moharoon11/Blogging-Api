package dev.haroon.blog.service;

import java.util.Set;

import dev.haroon.blog.model.Post;
import dev.haroon.blog.payload.CategoryDTO;
import dev.haroon.blog.payload.PostDTO;
import dev.haroon.blog.payload.PostResponse;
import dev.haroon.blog.payload.UserDTO;

public interface PostService {

	
	Set<PostDTO> findByUser(Integer userId);
	
	Set<PostDTO> findByCategory(Integer categoryId);
	
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	PostDTO createPost(PostDTO postDTO, Integer userId, Integer categoryId);

	PostDTO findById(Integer postId);

	PostDTO update(PostDTO postDTO, Integer postId);

	void delete(Integer postId);
	
	PostDTO postToDTO(Post post);
	
	Post dtoToPost(PostDTO postDTO);
	
	Set<PostDTO> searchByTitle(String title);
	
	
	
	
	
	
	
}
