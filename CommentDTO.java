package dev.haroon.blog.payload;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CommentDTO {

	
	private Integer commentId;

	@NotEmpty
	@Size(min=3, message="comment must be minimum of 3 characters!")
	private String content;
}
