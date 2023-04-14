package com.cts.app.dao;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cts.app.exceptions.SystemException;
import com.cts.app.model.Genre;
import com.cts.app.model.Product;

public class GenreDaoImplJdbc implements GenreDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// Show List of Genre (All Genre)
	// SQL query to fetch all genres
	private static final String FIND_ALL_GENRE = "select * from book_genre_table";
	public List<Genre> getAllGenre() {
		return jdbcTemplate.query(FIND_ALL_GENRE,
				(rs, no) -> new Genre(rs.getInt("genre_id"), rs.getString("bookGenre")));
	}

	
	// Show Book details by using Genre	
	// SQL query to fetch all products by genre name
	private static final String FIND_BOOK_BY_GENRE = "SELECT * FROM product_table p JOIN book_genre_table bg ON p.genre_id = bg.genre_id WHERE bg.bookGenre = ?";
	public List<Product> getBookByGenre(String genreName) {
	    return jdbcTemplate.query(FIND_BOOK_BY_GENRE, new GenreProductMapper(), genreName);
	}


}