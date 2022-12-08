package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle{
	
	private int propeller;

	public Ship() {
		super();
	}

	public Ship(String name, double mileage, String kind,int propeller) {
		super(name, mileage, kind);
		this.propeller=propeller;
	}

	public int getPropeller() {
		return propeller;
	}

	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}

	@Override
	public String toString() {
		return "Ship "+super.toString()+",propeller=" + propeller + "]";
	}
	
	
	
	
	
	

}
