package m2i.com.formation.dna;

import java.util.ArrayList;
import java.util.List;

public class Cell {

	private List<DNA> chromosomes = new ArrayList<DNA>();
	private List<RNA> rnas = new ArrayList<RNA>();
	private List<Protein> genome = new ArrayList<Protein>();
	
	public List<DNA> getChromosomes() {
		return chromosomes;
	}
	public List<RNA> getRnas() {
		return rnas;
	}
	public List<Protein> getGenome() {
		return genome;
	}
	
}
