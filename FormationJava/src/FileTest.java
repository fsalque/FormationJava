import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.m2i.formation.media.entities.Book;

public class FileTest {
	public static void readFile(String uri) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(uri));
		String line= br.readLine();
		if ((line == null) || (line == "")){
			br.close();
			return;
		}
		StringTokenizer st = new StringTokenizer(line,";");
		List<String> listChamps = new ArrayList<String>();
		do{
			listChamps.add(st.nextToken());
		}while (st.hasMoreTokens());
		line= br.readLine();
		while ((line != null)  && (line != "")){
			st = new StringTokenizer(line,";");
			for (String champ : listChamps){
				if (st.hasMoreTokens()){
					System.out.println("Book " + champ + " :" + st.nextToken());
				}
				else{
					System.out.println("Book " + champ + " :");
				}
			}
			System.out.println();
			line= br.readLine();
		}	
		br.close();
	}
	
	public static List<Book> readBook(String uri) throws IOException{
		List<Book> result = new ArrayList<Book>();
		BufferedReader br = new BufferedReader(new FileReader(uri));
		String line= br.readLine();
		if ((line == null) || (line == "")){
			br.close();
			return result;
		}
		line= br.readLine();
		StringTokenizer st;
		while ((line != null)  && (line != "")){
			Book b = new Book();
			st = new StringTokenizer(line,";");
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
			line= br.readLine();
			result.add(b);
		}	
		br.close();
		return result;
	}

}
