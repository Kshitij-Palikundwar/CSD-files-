package com.cts.app.service;

import java.util.List;
import com.cts.app.exceptions.ClassNotFoundException;
import com.cts.app.exceptions.SystemException;
import com.cts.app.model.Genre;
import com.cts.app.model.Product;

public interface GenreService {
	
	List<Genre> getAllGenre();
	List<Product> getBookByGenre(String genreName) throws SystemException, ClassNotFoundException;
	//Genre getGenreByName(String genreName) throws SystemException, ClassNotFoundException;
}
	
