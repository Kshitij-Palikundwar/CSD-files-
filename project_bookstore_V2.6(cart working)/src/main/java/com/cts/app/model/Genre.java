package com.cts.app.model;

public class Genre {
	private int genreId;
    //private String bookCategory;
    private String bookGenre;
	public int getGenreId() {
		return genreId;
	}
	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}
//	public String getBookCategory() {
//		return bookCategory;
//	}
//	public void setBookCategory(String bookCategory) {
//		this.bookCategory = bookCategory;
//	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	
	
	public Genre( String bookGenre) {
		super();
		//this.bookCategory = bookCategory;
		this.bookGenre = bookGenre;
	}
	public Genre(int genreId,  String bookGenre) {
		super();
		this.genreId = genreId;
		//this.bookCategory = bookCategory;
		this.bookGenre = bookGenre;
	}
	
	@Override
	public String toString() {
		return "Genre [genreId=" + genreId +  ", Genre=" + bookGenre + "]";
	}
	
	
	
}
