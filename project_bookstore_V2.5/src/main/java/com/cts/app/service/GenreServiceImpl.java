package com.cts.app.service;

import java.util.List;

import com.cts.app.dao.GenreDao;
import com.cts.app.exceptions.ClassNotFoundException;
import com.cts.app.exceptions.SystemException;
import com.cts.app.model.Genre;
import com.cts.app.model.Product;

public class GenreServiceImpl implements GenreService {
	private GenreDao genreDao;

	public void setGenreDao(GenreDao genreDao) {
		this.genreDao = genreDao;
	}
	@Override
	public List<Genre> getAllGenre() {

		return genreDao.getAllGenre();
	}
	@Override
	public List<Product> getBookByGenre(String genreName) throws ClassNotFoundException, SystemException {
	    // Book list from genreDao is assigned to <List> Book 
		List<Product> Books = genreDao.getBookByGenre(genreName);
	    
	    if (Books.isEmpty()) {
	        throw new ClassNotFoundException("Genre NAME does not Exists : " + genreName);
	    }
	    
	    return Books;
	}


}
