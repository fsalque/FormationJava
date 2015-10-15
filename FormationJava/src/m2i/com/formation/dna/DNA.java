package m2i.com.formation.dna;

import java.util.ArrayList;
import java.util.List;

public class DNA extends Strand {
	private List<DNABase> dnaBases = new ArrayList<DNABase>();

	public List<DNABase> getDnaBases() {
		return dnaBases;
	}
}
