package com.cts.app.service;

import java.util.List;
import java.util.Optional;

import com.cts.app.dao.UserDao;
import com.cts.app.exceptions.ClassNotFoundException;
import com.cts.app.exceptions.SystemException;
import com.cts.app.model.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getAllUser() {

		return userDao.getAllUser();
	}

	@Override
	public User getUserById(int userId) throws ClassNotFoundException, SystemException {
		
		Optional<User> optionalUser =userDao.getUserById(userId);
		
		
		if (optionalUser.isEmpty()) {
			throw new ClassNotFoundException("User not Exists with id: " + userId);
			}
		return optionalUser.get();
	}

	@Override
	public boolean createUser(User user) {
		boolean newUser = userDao.createUser(user);
		if(newUser) {
			System.out.println("New User is added successfully!!! ");

		}
		else {
			System.out.println("Error : New user can not be created");
		}
		return newUser;
	}

}
