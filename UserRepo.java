package dev.haroon.blog.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.haroon.blog.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String name);
}
