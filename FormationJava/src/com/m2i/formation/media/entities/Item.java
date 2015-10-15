package com.m2i.formation.media.entities;

public abstract class Item implements IItem {
	private double price;
	private double evaluation;
	private int id;
	
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#getPrice()
	 */
	@Override
	public double getPrice() {
		return price;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#setPrice(double)
	 */
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#getEvaluation()
	 */
	@Override
	public double getEvaluation() {
		return evaluation;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#setEvaluation(double)
	 */
	@Override
	public void setEvaluation(double evaluation) {
		this.evaluation = evaluation;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#getId()
	 */
	@Override
	public int getId() {
		return id;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#setId(int)
	 */
	@Override
	public void setId(int id) {
		this.id = id;
	}

}
