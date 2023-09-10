package dev.haroon.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.haroon.blog.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	
}
