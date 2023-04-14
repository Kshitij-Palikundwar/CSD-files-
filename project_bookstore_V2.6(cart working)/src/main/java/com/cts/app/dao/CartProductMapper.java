package com.cts.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import com.cts.app.model.Cart;
import com.cts.app.model.Product;

//To get Book name by Genre name input
public class CartProductMapper implements RowMapper<Cart> {
    public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
        int userId = rs.getInt("userId");
        int prodId = rs.getInt("prodId");
        int quantity = rs.getInt("quantity");
        double price = rs.getDouble("price * quantity");

        Cart cart = new Cart(userId, prodId, quantity, price);
        return cart;
    }
}


