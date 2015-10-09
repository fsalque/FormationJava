package com.m2i.formation.railroad;

public class Train {
	private Locomotive locomotive;
	private Voiture[] voitures = new Voiture[10];
	private int nbVoiture = 0;
	
	private String idTrain;
	
	public void addVoiture(Voiture voiture){
		voitures[nbVoiture++] = voiture;
	}

	public Locomotive getLocomotive() {
		return locomotive;
	}

	public void setLocomotive(Locomotive locomotive) {
		this.locomotive = locomotive;
	}

	public String getIdTrain() {
		return idTrain;
	}

	public void setIdTrain(String idTrain) {
		this.idTrain = idTrain;
	}

}
