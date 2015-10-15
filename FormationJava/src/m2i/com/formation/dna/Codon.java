package m2i.com.formation.dna;

public class Codon {
	private RNABase[] rnaBases = new RNABase[3];

	private Protein aminoAcid;
	
	public RNABase[] getRnaBases() {
		return rnaBases;
	}

	public Protein getAminoAcid() {
		return aminoAcid;
	}

	public void setAminoAcid(Protein aminoAcid) {
		this.aminoAcid = aminoAcid;
	}

	public void setRnaBases(RNABase[] rnaBases) {
		this.rnaBases = rnaBases;
	}

}
