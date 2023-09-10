package dev.haroon.blog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.haroon.blog.exception.NoResourceFoundException;
import dev.haroon.blog.exception.ResourceNotFoundException;
import dev.haroon.blog.model.Category;
import dev.haroon.blog.payload.CategoryDTO;
import dev.haroon.blog.repositories.CategoryRepo;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;

	@Override
	public CategoryDTO createCategory(CategoryDTO dto) {
		Category category = dtoToCategory(dto);
		category = categoryRepo.save(category);
		return categoryToDTO(category);
	}

	@Override
	public CategoryDTO findById(Integer id) {
		Category category = categoryRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("CATEGORY", "ID", id));

		return categoryToDTO(category);
	}

	@Override
	public CategoryDTO update(CategoryDTO dto, Integer id) {
		Category category = categoryRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("CATEGORY", "ID", id));

		Category updatedCategory = dtoToCategory(dto);
		updatedCategory.setCategoryId(category.getCategoryId());
		
		return categoryToDTO(categoryRepo.save(updatedCategory));
	}

	@Override
	public void delete(Integer id) {
		Category category = categoryRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("CATEGORY", "ID", id));

		categoryRepo.delete(category);
	}

	@Override
	public List<CategoryDTO> getCategories() {

		List<Category> categories = categoryRepo.findAll();

		List<CategoryDTO> categoriesDTO = categories.stream().map(category -> categoryToDTO(category))
				.collect(Collectors.toList());

		if (categoriesDTO.size() == 0)
			throw new NoResourceFoundException("USER", "Ooops!!! No Records found for ");

		return categoriesDTO;
	}

	public CategoryDTO categoryToDTO(Category category) {
		CategoryDTO dto = new CategoryDTO();

		dto.setCategoryId(category.getCategoryId());
		dto.setCategoryTitle(category.getCategoryTitle());
		dto.setCategoryDescription(category.getCategoryDescription());

		return dto;
	}

	public Category dtoToCategory(CategoryDTO dto) {
		Category category = new Category();

		category.setCategoryId(dto.getCategoryId());
		category.setCategoryTitle(dto.getCategoryTitle());
		category.setCategoryDescription(dto.getCategoryDescription());

		return category;
	}

}
