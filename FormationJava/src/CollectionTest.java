import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.m2i.formation.media.entities.*;

public class CollectionTest {
	static List<Book> listTest(){
		List<Book> result = new ArrayList<Book>();
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		b1.setTitle("Book 1");
		b2.setTitle("Book 2");
		b3.setTitle("Book 3");
		result.add(b1);
		result.add(b2);
		result.add(b3);
		Book bIndice1 = new Book();
		bIndice1.setTitle("Book Indice1");
		result.add(1, bIndice1);
		result.remove(2);
		return result;
	}
	
	static Set<Book> setTest(){
		Set<Book> result = new HashSet<Book>();
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		b1.setTitle("Book 1");
		b2.setTitle("Book 2");
		b3.setTitle("Book 3");
		result.add(b1);
		result.add(b2);
		result.add(b3);
		result.add(b1);
		return result;
	}
	
	static Map<String,Book> mapTest(){
		Map<String,Book> result = new HashMap<String,Book>();
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		b1.setTitle("Book 1");
		b2.setTitle("Book 2");
		b3.setTitle("Book 3");
		result.put("Book 1", b1);
		result.put("Book 2", b2);
		result.put("Book 3", b3);
		return result;
	}

}
