package com.cts.app.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.cts.app.model.User;

public class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User(rs.getInt("userID"), rs.getString("userName"), rs.getString("userPh"),
				rs.getString("userMail"), rs.getString("userAddr"), rs.getString("userPassw"));
		return user;
	}

}

