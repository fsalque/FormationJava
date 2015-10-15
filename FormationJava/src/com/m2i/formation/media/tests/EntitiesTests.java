package com.m2i.formation.media.tests;

import org.junit.*;

import com.m2i.formation.media.entities.Book;
import com.m2i.formation.media.entities.Media;

public class EntitiesTests {

	@Test
	public void test() {
		Book b = new Book();
		b.setId(3);
		Assert.assertEquals(3,b.getId());
	}
	
	@Test
	public void vatPriceTest() {
		Media b = new Book();
		b.setPrice(10);
		Assert.assertEquals(10.5,b.getVATPrice(),0.001);
	}


}
