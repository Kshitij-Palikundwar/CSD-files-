package com.kshitij.project.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.kshitij.project.model.User;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public boolean createUser(User user) {
		// Query to Insert
		String CREATE_USER = "insert into user_table(userName,userPh,userMail,userAddr,userPassw) values(?,?,?,?,?)";
		int r = this.jdbcTemplate.update(CREATE_USER, user.getuName(), user.getuPh(), user.getuMail(), user.getuAddr(), user.getuPass());
		return false;
		
	}

	

	
}
