import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.m2i.formation.geometry.Counter;
import com.m2i.formation.media.entities.*;
import com.m2i.formation.media.repositories.BookRepository;

public class Hello {

	public static void main(String[] args) {
		
		// TP1 ///////////////////////////////////////////
		String myText;
		myText = "Hello World";
		System.out.println(myText);
		//////////////////////////////////////////////////
		
		// TP2 ///////////////////////////////////////////
		int i = 12;
		int j = 13;
		
		System.out.println("i vaut : " + i);
		System.out.println("j vaut : " + j);
		
		int aux = i;
		i =j;
		j = aux;
		
		System.out.println("Apr�s inversion, i vaut : " + i);
		System.out.println("Apr�s inversion, j vaut : " + j);
		//////////////////////////////////////////////////
		
		
		// TP3 ///////////////////////////////////////////
		
		//Compter jusqu'� 99
		for (i = 0; i<100;i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		//Decompte de 10 � 1 puis BOOM
		for (i = 10;i>0;i--)
		{
			System.out.print(i + " ");
		}
		System.out.print("BOOM");
		System.out.println();
		
		//Afficher les puissances de 2 sans utiliser l'op�rateur puissance
		for (i = 2;i<=1024;i+=i){
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//Afficher les 50 premiers nombres premiers
		i = 0;
		j = 2;
		while (i<50){
			boolean isPrime = true;
			for (int k = 2; k <= Math.sqrt(j); k++){
				if (!isPrime || (j%k == 0)){
					isPrime = false;
					k = j;
				}
			}
			
			if (isPrime){
				i++;
				System.out.print(j + " ");
			}
			j++;
		}
		System.out.println();
		//////////////////////////////////////////////////
		
		
		//Afficher les 50 premiers nombres premiers (avec tableau)
		i = 0;
		j = 3;
		int[] arrPrimes = new int[50];
		System.out.print(2 + " ");
		i++;
		arrPrimes[0] = 2;
		while (i<50){
			boolean isPrime = true;
			int l = 0;
			int k = arrPrimes[l];
			while ( isPrime && ( k <= Math.sqrt(j)) ){
				if (!isPrime || (j%k == 0)){
					isPrime = false;
				}
				l++;
				k = arrPrimes[l];
			}
			
			if (isPrime){
				arrPrimes[i] = j;
				i++;
				System.out.print(j + " ");
			}
			j += 2;
		}
		System.out.println();
		//////////////////////////////////////////////////
		
		// TP 5 //////////////////////////////////////////
		System.out.println("Resultat de add(4,5) = " + add(4,5));
		//////////////////////////////////////////////////
		
		// TP 5 //////////////////////////////////////////
		int[] arr10 = {1,4,6,9,11,15,17,21,23,512};
		System.out.println("Display result :");
		display(arr10);
		System.out.println("Sum result : " + sum(arr10));
		System.out.println("Max result : " + max(arr10));
		System.out.println("Average result : " + average(arr10));
		randomize(arr10);
		System.out.println("Display result of first randomized array :");
		display(arr10);
		randomize(arr10);
		System.out.println("Display result of second randomized array :");
		display(arr10);
		System.out.println("Display result of create random array with length = 20 :");
		arr10 = createRandomlyTab(20);
		display(arr10);
		put(arr10,5,20);
		System.out.println("Display result of put(arr,5,20) :");
		display(arr10);
		permut(arr10,5,7);
		System.out.println("Display result of permut(arr,5,7) :");
		display(arr10);
		permut2(arr10,5);
		System.out.println("Display result of permut2(arr,5) :");
		display(arr10);
		insert(arr10,9,50);
		System.out.println("Display result of insert(arr,9,50) :");
		display(arr10);
		remove(arr10,9);
		System.out.println("Display result of remove(arr,9,50) :");
		display(arr10);
		int[] tab2 = clone(arr10);
		display(tab2);
		display(inverse(tab2));
		display(even(tab2));
		display(remove2(tab2,10));
		display(insert2(tab2,7,99));
		System.out.println(recursiveSum(tab2, 0));
		System.out.println(factorielle(15));
		display(bubbleSort(tab2));
		display(selectionSort(tab2));
		//////////////////////////////////////////////////
		
		// TP 1 POO //////////////////////////////////////
		Book b1 = new Book();
		b1.setTitle("Java");
		System.out.println(b1.getTitle());
		
		Book b2 = new Book();
		b2.setTitle("Java");
		System.out.println(b2.getTitle());
		
		System.out.println("b1 et b2 sont ils identiques? ");
		System.out.println(b1 == b2);
		//////////////////////////////////////////////////
		
		// TP 2 POO //////////////////////////////////////
		Publisher p = new Publisher();
		p.setName("Publisher Random");
		b2.setPublisher(p);
		System.out.println(b2.getPublisher().getName());
		Author a1 = new Author();
		a1.setFirstName("Albert");
		a1.setLastName("Nonyme");
		Author a2 = new Author();
		a2.setFirstName("Alphonse");
		a2.setLastName("Nonyme");
		try {
			b2.addAuthor(a1);
			b2.addAuthor(a2);
			b2.displayAuthors();
		} catch (MediaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//////////////////////////////////////////////////
		// TP POO Static//////////////////////////////////
		for (i = 0; i < 10; i++){
			System.out.println(Counter.increment());
		}
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		for (i = 0; i < 10; i++){
			System.out.println(c1.increment());
		}
		for (i = 0; i < 10; i++){
			System.out.println(c2.increment());
		}
		//////////////////////////////////////////////////
		// TP POO Enum////////////////////////////////////
		b1.setCategory(BookCategory.SF);
		//////////////////////////////////////////////////
		
		// TP POO Enum////////////////////////////////////
		Media m = new Book();
		m.setPrice(10);
		System.out.println("Price : " + m.getPrice() + "; VATPrice = " + m.getVATPrice());
		//////////////////////////////////////////////////
		
		// TP Collections ////////////////////////////////
		List<Book> lb = CollectionTest.listTest();
		Set<Book> sb = CollectionTest.setTest();
		Map<String, Book> mb = CollectionTest.mapTest();
		
		System.out.println("\n listTest books : ");
		for (Book bAux : lb){
			System.out.println(bAux.getTitle());
		}
		
		System.out.println("\n setTest books :");
		for (Book bAux : sb){
			System.out.println(bAux.getTitle());
		}
		
		System.out.println("\n mapTest books :");
		for (Book bAux : mb.values()){
			System.out.println(bAux.getTitle());
		}
		//////////////////////////////////////////////////
		
		// TP Cart ///////////////////////////////////////
		
		Book bCart1 = new Book();
		Cd cdCart1 = new Cd();
		Dvd dvdCart1 = new Dvd();
		bCart1.setCategory(BookCategory.SF);
		bCart1.setEvaluation(4.8);
		bCart1.setPrice(150);
		cdCart1.setPrice(100);
		dvdCart1.setPrice(50);
		Cart cart = new Cart();
		cart.getMedias().add(bCart1);
		cart.getMedias().add(cdCart1);
		cart.getMedias().add(dvdCart1);
		System.out.println("\nCart price : " + cart.getVatPrice());
		//////////////////////////////////////////////////
	
		// TP IO /////////////////////////////////////////
		try {
			FileTest.readFile("C:\\Users\\adminlocal\\git\\FormationJava\\ListBooks.csv");
			List<Book> lbIO = FileTest.readBook("C:\\Users\\adminlocal\\git\\FormationJava\\ListBooks.csv");
			for(Book bIO : lbIO){
				System.out.println(bIO.getTitle());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//////////////////////////////////////////////////
		
		// TP Repositories ///////////////////////////////
		BookRepository bRepo = new BookRepository();
		bRepo.setUri("C:\\Users\\adminlocal\\git\\FormationJava\\ListBooks.csv");
		try {
			System.out.println();
			System.out.println("All books:");
			List<Book> lbRepoAll = bRepo.getAll();
			for(Book b_RepoAux : lbRepoAll){
				System.out.println(b_RepoAux.getTitle());
			}
			System.out.println();
			System.out.println("Book with ID 1:");
			Book b_RepoID = bRepo.getByID(1);
			if (b_RepoID != null){ 
				System.out.println(b_RepoID.getTitle());
			}
			System.out.println();
			System.out.println("Book with price <=100:");
			List<Book> lbRepoPrice = bRepo.getByPrice(100);
			for(Book b_RepoAux : lbRepoPrice){
				System.out.println(b_RepoAux.getTitle());
			}
			System.out.println();
			System.out.println("Book with title containing front:");
			List<Book> lbRepoTitle = bRepo.getByTitle("FRONT");
			for(Book b_RepoAux : lbRepoTitle){
				System.out.println(b_RepoAux.getTitle());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//////////////////////////////////////////////////
		
	}

	public static int add(int a, int b){
		int result = a + b;
		return result;
	}
	
	public static void display(int[] tab){
		for(int auxValue : tab){
			if (auxValue>10) {
				System.out.print(auxValue + " ");
			}
			else{
				System.out.print(" " + auxValue + " ");
			}
		}
		System.out.println();
	}
	
	public static int sum(int[] tab){
		int result = 0; 
		for (int aux : tab){
			result += aux;
		}
		return result;
	}
	
	public static int max(int[] tab){
		int result;
		result = tab[0];
		for (int aux : tab){
			if (aux > result){
				result = aux;
			}
		}
		return result;
	}
	
	public static double average(int[] tab){
		double result;
		result = sum(tab);
		result = result/tab.length;
		return result;
	}
	
	public static void randomize(int[] tab){
		Random rnd = new Random();
		for (int i = 0; i < tab.length; i++){
			tab[i] = rnd.nextInt(100);
		}
	}
	
	public static int[] createRandomlyTab(int length){
		int[] result = new int[length];
		Random rnd = new Random();
		for (int i = 0; i < result.length; i++){
			result[i] = rnd.nextInt(100);
		}
		return result;
	}
	
	public static void put(int[] tab, int index, int value){
		tab[index] = value;
	}
	
	public static void permut(int[] tab, int index1, int index2){
		int aux = tab[index1];
		tab[index1] = tab[index2];
		tab[index2] = aux;
	}
	
	public static void permut2(int[] tab, int index){
		permut(tab, index, (index-1));
	}
	
	public static void insert(int[] tab, int index, int value){
		for (int i = tab.length-1; i> index; i--){
			tab[i] = tab[i-1];
		}
		tab[index] = value;
	}
	
	public static void remove(int[] tab, int index){
		for (int i = index+1;i<tab.length;i++){
			tab[i-1] = tab[i];
		}
	}
	
	public static int[] clone(int[] tab){
		int[] result = new int[tab.length];
		for (int i =0;i<tab.length;i++){
			result[i] = tab[i];
		}
		return result;
	}
	
	public static int[] inverse(int[] tab){
		int[] result = new int[tab.length];
		for (int i =0;i<tab.length;i++){
			result[tab.length - i - 1] = tab[i];
		}
		return result;
	}
	
	public static int[] even(int[] tab){
		int[] result = new int[tab.length];
		int indexEven = 0;
		int indexNull = tab.length-1;
		for (int aux : tab){
			if (aux %2 == 0){
				result[indexEven] = aux;
				indexEven++;
			}
			else{
				result[indexNull] = 0;
				indexNull --;
			}
		}
		return result;
	}
	
	public static int[] remove2(int[] tab, int index){
		int[] result = new int[tab.length-1];
		for (int i =0;i<index;i++){
			result[i] = tab[i];
		}
		for (int i = index +1; i< tab.length;i++ ){
			result[i-1] = tab[i];
		}
		return result;
	}
	
	public static int[] insert2(int[] tab, int index,int value){
		int[] result = new int[tab.length+1];
		for (int i =0;i<index;i++){
			result[i] = tab[i];
		}
		result[index] = value;
		for (int i = index ; i< tab.length;i++ ){
			result[i+1] = tab[i];
		}
		return result;
	}
	
	public static int min(int[] tab){
		int result;
		result = tab[0];
		for (int aux : tab){
			if (aux < result){
				result = aux;
			}
		}
		return result;
	}
	
	public static int[] bubbleSort(int[] tab){
		int[] result = clone(tab);
		
		for(int i = result.length;i>0;i--){
			for(int j = 1;j<i;j++){
				if(result[j-1]>result[j]){
					permut2(result,j);
				}
			}
		}
		return result;
	}
	
	public static int[] selectionSort(int[] tab){
		int[] result = clone(tab);
		for(int indiceSorted = 0; indiceSorted < result.length;indiceSorted++){
			int valueMin = result[indiceSorted];
			int indiceMin = indiceSorted;
			for(int i = indiceSorted; i < result.length; i++){
				if (result[i] < valueMin){
					valueMin = result[i];
					indiceMin = i;
				}
			}
			permut(result,indiceSorted,indiceMin);
		}
		return result;
	}
	
	public static int recursiveSum(int[] tab,int indiceStart){
		if (indiceStart == tab.length){
			return 0;
		}
		else{
			return (tab[indiceStart]+(recursiveSum(tab,indiceStart+1)));
		}
	}
	
	public static int factorielle(int n){
		if (n<1) {
			return 1;
		}
		else{
			return n*factorielle(n-1);
		}
	}
	
}
