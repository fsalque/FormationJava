package com.m2i.formation.media;

public class Book extends Media{
	
	private String[] text;
	private int nbPages;
	private BookCategory category;
	
	public String[] getText() {
		return text;
	}
	public void setText(String[] text) {
		this.text = text;
	}

	public int getNbPages() {
		return nbPages;
	}
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	
	public BookCategory getCategory() {
		return category;
	}
	public void setCategory(BookCategory category) {
		this.category = category;
	}
	
	@Override
	public double getVATPrice(){
		return this.getPrice() * 1.05;
	}
}
