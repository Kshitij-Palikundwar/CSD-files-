package com.cts.app.dao;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cts.app.exceptions.SystemException;
import com.cts.app.model.User;

public class UserDaoImplJdbc implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	private static final String FIND_ALL_USER = "select * from user_table";
	@Override
	public List<User> getAllUser() {
//		 System.out.println("| uId  | uName | uPh       | uMail           | uAddr         | uPass     |\n"
//				 		  + "|------|-------|-----------|-----------------|---------------|-----------|\n");
		return jdbcTemplate.query(FIND_ALL_USER, (rs, no) -> new User(rs.getInt("userID"), rs.getString("userName"),
				rs.getString("userPh"), rs.getString("userMail"), rs.getString("userAddr"), rs.getString("userPassw")));
	
	
	}
	
	
	private static String FIND_USER_BY_ID = "select * from user_table where userID=?";
	@Override
	public Optional<User> getUserById(int userId) {
		return Optional.of(jdbcTemplate.queryForObject(FIND_USER_BY_ID, new UserMapper(), userId));
	}
	
	
	private static final String CREATE_USER = "insert into user_table(userName, userPh, userMail, userAddr, userPassw)"
												+ "values(?,?,?,?,?)";
	@Override
	public boolean createUser(User user) {
		return jdbcTemplate.update(CREATE_USER, user.getuName(), user.getuPh(), user.getuMail(), user.getuAddr(),
				user.getuPass()) > 0;
	}
}