package com.kshitij.project.dao;

import java.util.List;
import java.util.Optional;

import com.kshitij.project.model.User;

public interface UserDao {
	//public int Insert(User user);
	
	List<User> getAllProduct();

	Optional<User> getUserById(int userId);
	
	boolean createUser(User  user);

}
