package dev.haroon.blog.service;

import java.util.List;

import dev.haroon.blog.model.Category;
import dev.haroon.blog.payload.CategoryDTO;

public interface CategoryService {

	CategoryDTO createCategory(CategoryDTO category);

	CategoryDTO findById(Integer id);

	CategoryDTO update(CategoryDTO category, Integer id);

	void delete(Integer id);

	List<CategoryDTO> getCategories();
	
	Category dtoToCategory(CategoryDTO dto);
	
	CategoryDTO categoryToDTO(Category category);
}
