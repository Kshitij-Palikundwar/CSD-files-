package com.cts.app.dao;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cts.app.model.Product;

public class ProductDaoImplJdbc implements ProductDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	private static final String FIND_ALL_PRODUCTS = "select * from product_table";

	public List<Product> getAllProduct() {
		return jdbcTemplate.query(FIND_ALL_PRODUCTS,
				(rs, no) -> new Product(rs.getInt("prodId"), rs.getInt("user_id"), rs.getString("prodName"),
						rs.getString("prodAuther"), rs.getString("prodDescription"), rs.getString("prodPrice"),
						rs.getString("prodQuantity"), rs.getInt("genre_id")));
	}

	private static final String FIND_PRODUCT_BY_NAME = "select * from product_table where prodName=?";

	public Optional<Product> getProductByName(String prodName) {
		return Optional.of(jdbcTemplate.queryForObject(FIND_PRODUCT_BY_NAME, new ProductMapper(), prodName));
	}

//	private static final String CREATE_PRODUCT = "insert into product_table(user_id, prodName, prodDescription, prodPrice, prodQuantity, genre_id) values(?,?,?,?,?,?)";
//
//	public boolean create_Product(Product product) {
//	    return jdbcTemplate.update(CREATE_PRODUCT, product.getpUserId(), product.getpName(), product.getpAuth(), product.getpDesc(), product.getpPrice(), product.getpQuantity(), product.getpCategory()) > 0;
//	}

}