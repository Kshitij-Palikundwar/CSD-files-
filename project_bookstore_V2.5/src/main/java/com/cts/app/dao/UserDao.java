package com.cts.app.dao;

import java.util.List;
import java.util.Optional;

import com.cts.app.exceptions.SystemException;
import com.cts.app.model.User;

public interface UserDao {
	
	List<User> getAllUser();
	Optional<User> getUserById(int userId) throws SystemException;
	boolean createUser(User user);
	

}
