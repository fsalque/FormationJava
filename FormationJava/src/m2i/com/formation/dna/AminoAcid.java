package m2i.com.formation.dna;

public class AminoAcid {
	private String longName;
	private String trigram;
	private Character code;
	
	public static AminoAcid factory(Character code){
		AminoAcid result = new AminoAcid();
		return result;
	}

	protected AminoAcid(){		
	}
	
	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getTrigram() {
		return trigram;
	}

	public void setTrigram(String trigram) {
		this.trigram = trigram;
	}

	public Character getCode() {
		return code;
	}

	public void setCode(Character code) {
		this.code = code;
	}
}
