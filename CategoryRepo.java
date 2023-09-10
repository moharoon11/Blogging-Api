package dev.haroon.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.haroon.blog.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
