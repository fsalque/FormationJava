package com.m2i.formation.media;
import java.util.Date;

public abstract class Media extends Item {

	private Publisher publisher;
	private Author[] authors = new Author[10];
	private int nbAuthors;
	private Date date;
	private String title;
	
	public void addAuthor(Author author){
		this.authors[nbAuthors] = author;
		this.nbAuthors++;
	}
	
	public void displayAuthors() throws MediaException{
		System.out.println("Authors :");
		if (this.nbAuthors > 10) {
			throw new MediaException("Too many authors.");
		}
		for(int i = 0; i < this.nbAuthors;i++){
			Author a = this.authors[i];
			System.out.println(a.getFirstName() + " " + a.getLastName());
		}
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract double getVATPrice();
}
