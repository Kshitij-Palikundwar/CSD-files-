package com.cts.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.cts.app.model.Product;


public class ProductMapper implements RowMapper<Product> {
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product= new Product(rs.getInt("prodId"),rs.getInt("user_id"), 
				rs.getString("prodName"), rs.getString("prodAuther"), rs.getString("prodDescription"), 
				rs.getString("prodPrice"), rs.getString("prodQuantity"), rs.getInt("genre_id"));
		
		return product;
	}


}
