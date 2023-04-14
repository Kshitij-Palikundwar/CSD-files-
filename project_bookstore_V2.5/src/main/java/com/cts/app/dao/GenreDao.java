package com.cts.app.dao;

import java.util.List;
import java.util.Optional;

import com.cts.app.exceptions.SystemException;
import com.cts.app.model.Genre;
import com.cts.app.model.Product;

public interface GenreDao {
	List<Genre> getAllGenre();
	//Optional<Genre> getBookByGenre(String Name) throws SystemException;
	List<Product> getBookByGenre(String genreName);
	


}
