package com.m2i.formation.media.entities;

public class Cd extends Media {
	int nbTrack;

	public int getNbTrack() {
		return nbTrack;
	}

	public void setNbTrack(int nbTrack) {
		this.nbTrack = nbTrack;
	}
	
	@Override
	public double getVATPrice(){
		return this.getPrice() * 1.20;
	}

}
