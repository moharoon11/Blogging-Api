package dev.haroon.blog.service;

import java.util.List;

import dev.haroon.blog.model.User;
import dev.haroon.blog.payload.UserDTO;

public interface UserService {

	UserDTO registerNewUser(UserDTO user);

	UserDTO findById(Integer id);

	UserDTO update(UserDTO user, Integer id);

	void delete(Integer id);
	
	UserDTO findByEmail(String name);

	List<UserDTO> getUsers();
	
	UserDTO userToDTO(User user);
	
	User dtoToUser(UserDTO dto);
	
	

}
