package com.cts.app.service;

import java.util.List;

import com.cts.app.exceptions.ClassNotFoundException;
import com.cts.app.exceptions.SystemException;
import com.cts.app.model.User;

public interface UserService {

	List<User> getAllUser();

	User getUserById(int userId) throws ClassNotFoundException, SystemException;
	
	boolean createUser(User user);

	
}