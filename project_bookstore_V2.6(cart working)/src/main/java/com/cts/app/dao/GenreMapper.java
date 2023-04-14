package com.cts.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.cts.app.model.Genre;

// To get genre row of all column
public class GenreMapper implements RowMapper<Genre> {
	public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
		Genre genre= new Genre( rs.getInt("genre_id"), rs.getString("bookGenre"));
		
		return genre;
	}


}
