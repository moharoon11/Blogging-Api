package dev.haroon.blog.service;

import dev.haroon.blog.model.Comment;
import dev.haroon.blog.payload.CommentDTO;

public interface CommentService {

	CommentDTO createComment(CommentDTO commentDTO, Integer postId);

	void deleteComment(Integer commentId);

	Comment dtoToComment(CommentDTO dto);

	CommentDTO commentToDTO(Comment comment);
}
