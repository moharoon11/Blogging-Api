package dev.haroon.blog.payload;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CategoryDTO {
	
	
	private Integer categoryId;
	
	@NotBlank(message="Title must not be empty")
	private String categoryTitle;
	

	@NotBlank
	@Size(min=10, message="Desctiption must contain minimum of 10 characters")
	private String categoryDescription;

}
