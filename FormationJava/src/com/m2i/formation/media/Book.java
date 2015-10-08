package com.m2i.formation.media;
import java.util.Date;

public class Book {
	private String title;
	private double price;
	private String[] text;
	private int id;
	private Date date;
	private double evaluation;
	private int nbPages;
	private Publisher publisher;
	private Author[] authors = new Author[10];
	private int nbAuthors;
	private BookCategory category;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String[] getText() {
		return text;
	}
	public void setText(String[] text) {
		this.text = text;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(double evaluation) {
		this.evaluation = evaluation;
	}
	public int getNbPages() {
		return nbPages;
	}
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	public void addAuthor(Author author){
		this.authors[nbAuthors] = author;
		this.nbAuthors++;
	}
	
	public void displayAuthors(){
		System.out.println("Authors :");
		
		for(int i = 0; i < this.nbAuthors;i++){
			Author a = this.authors[i];
			System.out.println(a.getFirstName() + " " + a.getLastName());
		}
		
		/*
		for(Author a : this.authors){
			if (a != null){
			System.out.println(a.getFirstName() + " " + a.getLastName());
			}
		}
		*/
	}
	public BookCategory getCategory() {
		return category;
	}
	public void setCategory(BookCategory category) {
		this.category = category;
	}
}
