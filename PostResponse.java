package dev.haroon.blog.payload;

import java.util.Set;

import lombok.Data;

@Data
public class PostResponse {

	private Set<PostDTO> content;
	private Integer pageNumber;
	private Integer pageSize;
	private Integer totalElements;
	private Integer totalPages;
	private boolean isLastPage;
}
