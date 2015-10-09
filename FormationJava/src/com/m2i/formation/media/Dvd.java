package com.m2i.formation.media;

public class Dvd extends Media {
	private Region region;

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public double getVATPrice(){
		return this.getPrice() * 1.20;
	}
}
