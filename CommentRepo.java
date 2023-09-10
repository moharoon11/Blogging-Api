package dev.haroon.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.haroon.blog.model.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
