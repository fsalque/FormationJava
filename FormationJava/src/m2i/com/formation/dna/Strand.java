package m2i.com.formation.dna;

import java.util.ArrayList;
import java.util.List;

public abstract class Strand {
	private List<Base> listBase = new ArrayList<Base>();

	public List<Base> getListBase() {
		return listBase;
	}

}
