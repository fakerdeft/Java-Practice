package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle {
	private int tire;
	private int wing;
	
	public Airplane() {
		super();
	}

	public Airplane(String name, double mileage, String kind,int tire,int wing) {
		super(name, mileage, kind);
		this.tire=tire;
		this.wing=wing;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}

	@Override
	public String toString() {
		return "Airplane "+super.toString()+",tire=" + tire + ", wing=" + wing + "]";
	}
	
	
	
	
	

}
