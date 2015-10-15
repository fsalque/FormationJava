package com.m2i.formation.media.repositories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.m2i.formation.media.entities.Book;

public class BookRepository implements IRepository<Book> {

	private String uri;
	
	private List<Book> cache = null;
	
	private List<Book> getCache() throws IOException{
		if (cache == null){
			cache = this.cacheFactory();
		}
		return cache;
	}
	
	private Book createBookFromCSVLine(String line){
		Book b = new Book();
		StringTokenizer st = new StringTokenizer(line,";");
		if (st.hasMoreTokens()){
			b.setTitle(st.nextToken());
		}
		if (st.hasMoreTokens()){
			b.setNbPages(Integer.parseInt(st.nextToken()));
		}
		if (st.hasMoreTokens()){
			b.setPrice(Double.parseDouble(st.nextToken()));
		}
		if (st.hasMoreTokens()){
			b.setEvaluation(Double.parseDouble(st.nextToken()));
		}
		if (st.hasMoreTokens()){
			b.setId(Integer.parseInt(st.nextToken()));
		}

		return b;
	}
	
	@Override
	public String getUri() {
		return uri;
	}

	@Override
	public void setUri(String uri) {
		this.uri = uri;
	}

	private List<Book> cacheFactory () throws IOException {
		List<Book> result = new ArrayList<Book>();
		BufferedReader br = new BufferedReader(new FileReader(uri));
		String line= br.readLine();
		if ((line == null) || (line == "")){
			br.close();
			return result;
		}
		line= br.readLine();
		while ((line != null)  && (line != "")){
			Book b = createBookFromCSVLine(line);
			line= br.readLine();
			result.add(b);
		}	
		br.close();
		return result;
	}

	
	@Override
	public List<Book> getAll() throws IOException {
		return cacheFactory();
	}

	@Override
	public Book getByID(int id) throws IOException {
		Book result = null;
		BufferedReader br = new BufferedReader(new FileReader(uri));
		String line= br.readLine();
		if ((line == null) || (line == "")){
			br.close();
			return result;
		}
		line= br.readLine();
		while ((line != null)  && (line != "") && (result == null)){
			Book b = createBookFromCSVLine(line);
			if (b.getId() == id){
				result = b;
			}
			line= br.readLine();
		}	
		br.close();
		return result;
	}

	@Override
	public List<Book> getByPrice(double price) throws IOException {
		List<Book> result = new ArrayList<Book>();
		BufferedReader br = new BufferedReader(new FileReader(uri));
		String line= br.readLine();
		if ((line == null) || (line == "")){
			br.close();
			return result;
		}
		line= br.readLine();
		while ((line != null)  && (line != "")){
			Book b = createBookFromCSVLine(line);
			if (b.getPrice() <= price){
				result.add(b);
			}
			line= br.readLine();
		}	
		br.close();
		return result;
	}

	@Override
	public List<Book> getByTitle(String word) throws IOException {
		List<Book> result = new ArrayList<Book>();
		BufferedReader br = new BufferedReader(new FileReader(uri));
		String line= br.readLine();
		if ((line == null) || (line == "")){
			br.close();
			return result;
		}
		line= br.readLine();
		while ((line != null)  && (line != "")){
			Book b = createBookFromCSVLine(line);
			if (b.getTitle().matches("(?iu).*"+word+".*")){
				result.add(b);
			}
			line= br.readLine();
		}	
		br.close();
		return result;
	}

}
