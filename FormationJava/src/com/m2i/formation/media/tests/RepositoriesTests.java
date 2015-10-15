package com.m2i.formation.media.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import org.junit.Test;

import com.m2i.formation.media.entities.Book;
import com.m2i.formation.media.repositories.BookRepository;

public class RepositoriesTests {

	private BookRepository bookRepo;
	private List<Book> listResult;
	private Book bookResult;
	
	@Before
	public void SetUp(){
		bookRepo = new BookRepository();
		bookResult = new Book();
		listResult = new ArrayList<Book>();
		bookRepo.setUri("C:\\Users\\adminlocal\\git\\FormationJava\\ListBooks.csv");
	}
	
	@After
	public void TearDown(){
		bookRepo = null;
		bookResult = null;
		listResult = null;
	}
	
	@Test(expected=FileNotFoundException.class)
	public void testUriDoesntExist() throws IOException {
		bookRepo.setUri("wrong uri");
		bookRepo.getAll();
	}
	
	@Test
	public void testGetAll() throws IOException {
		listResult = bookRepo.getAll();
		Assert.assertTrue("List result is null",listResult != null);
		Assert.assertEquals("Wrong number of elements in list",3,listResult.size());
	}
	
	@Test
	public void testGetByIDOK() throws IOException {
		bookResult = bookRepo.getByID(1);
		Assert.assertTrue("No book result found",bookResult != null);
		Assert.assertEquals("Wrong book found",1,bookResult.getId());
	}
	
	@Test
	public void testGetByIDKO() throws IOException {
		bookResult = bookRepo.getByID(18);
		Assert.assertTrue("Book result found",bookResult == null);
	}
	
	@Test
	public void testGetByPriceOK() throws IOException {
		listResult = bookRepo.getByPrice(15);
		Assert.assertTrue("List result is null",listResult != null);
		Assert.assertEquals("Wrong number of elements in list",2,listResult.size());
	}
	
	@Test
	public void testGetByPriceKO() throws IOException {
		listResult = bookRepo.getByPrice(1);
		Assert.assertTrue("List result is null",listResult != null);
		Assert.assertEquals("Wrong number of elements in list",0,listResult.size());
	}
	
	@Test
	public void testGetByTitleCaseInsensitive() throws IOException {
		listResult = bookRepo.getByTitle("FRONT");
		Assert.assertTrue("List result is null",listResult != null);
		Assert.assertEquals("Wrong number of elements in list",1,listResult.size());
	}
	
}
