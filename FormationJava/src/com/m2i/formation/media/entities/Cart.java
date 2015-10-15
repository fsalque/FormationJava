package com.m2i.formation.media.entities;

import java.util.ArrayList;
import java.util.List;

public class Cart implements IEntity{
	private List<Media> medias = new ArrayList<Media>();
	private int id;
	
	public List<Media> getMedias() {
		return medias;
	}
	
	public double getVatPrice(){
		double result = 0;
		for (Media mAux : medias)
		{
			result += mAux.getVATPrice();
		}
		return result;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}
}
