package com.cts.app.dao;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import com.cts.app.model.Product;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cts.app.exceptions.SystemException;
import com.cts.app.model.Cart;

public class CartDaoImplJdbc implements CartDao {

	private JdbcTemplate jdbcTemplate;
	Product product;

	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}


    // To show the Items present in Cart Table
	private static final String FIND_ALL_CART = "SELECT cartId,userId, prodId, quantity, quantity * price AS price FROM cart_table;";
	public List<Cart> getCartList() {
		return jdbcTemplate.query(FIND_ALL_CART,
			(rs, no) -> new Cart(rs.getInt("cartId"), rs.getInt("userId"),rs.getInt("prodId"),rs.getInt("quantity"),rs.getDouble("price")));
		
	}
	
	// To Add item to Cart Table
	private static final String ADD_BOOK_TO_CART ="INSERT INTO cart_table (userId, prodId, quantity, price) " +
			"SELECT u.userId, p.prodId, ?, p.prodPrice " +
			"FROM user_table u, product_table p " +
			"WHERE u.userId = ? AND p.prodName = ? ;" ; 
			//"SELECT userId, prodId, quantity, quantity * price AS price FROM cart_table;";
	
	public boolean putBookToCart(Cart cart) {
		return jdbcTemplate.update(ADD_BOOK_TO_CART, cart.getCartQuantity(), cart.getCartUserId(), cart.getCartBookName()) > 0;
	}
	
	
//	public List<Product> putBookToCart(String bookName, int quantity) {
//    return jdbcTemplate.query(ADD_BOOK_TO_CART, preparedStatement -> {
//        preparedStatement.setInt(1, quantity);
//        preparedStatement.setString(2, bookName);
//    }, resultSet -> {
//        List<Product> productList = new ArrayList<>();
//        while (resultSet.next()) {
//            // Extract data from the result set and add it to the productList here
//        }
//        return productList;
//    });
//}
//
	
	
//	// Show List of Genre (All Genre)
//	// SQL query to fetch all genres
//	private static final String FIND_ALL_GENRE = "select * from book_genre_table";
//	public List<Genre> getAllGenre() {
//		return jdbcTemplate.query(FIND_ALL_GENRE,
//				(rs, no) -> new Genre(rs.getInt("genre_id"), rs.getString("bookGenre")));
//	}
//
//	
//	// Show Book details by using Genre	
//	// SQL query to fetch all products by genre name
//	private static final String FIND_BOOK_BY_GENRE = "SELECT * FROM product_table p JOIN book_genre_table bg ON p.genre_id = bg.genre_id WHERE bg.bookGenre = ?";
//	public List<Product> getBookByGenre(String genreName) {
//	    return jdbcTemplate.query(FIND_BOOK_BY_GENRE, new GenreProductMapper(), genreName);
//	}
	
	
//	public List<Cart> putBookToCart(String bookName, int quantity) {
//	    jdbcTemplate.update(ADD_BOOK_TO_CART, quantity, bookName);
//	    return putBookToCart(bookName, quantity);
//	}
	
}