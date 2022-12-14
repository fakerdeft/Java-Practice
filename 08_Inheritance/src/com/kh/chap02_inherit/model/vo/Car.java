package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle {
	
	private int tire;

	public Car() {
		super();
	}

	public Car(String name, double mileage, String kind,int tire) {
		super(name, mileage, kind);
		this.tire=tire;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	@Override
	public String toString() {
		return "Car "+super.toString()+",tire=" + tire + "]";
	}
	
	
	

}
