package com.kh.chap02_inherit.model.vo;

public class Vehicle {
		private String name;//	- name : String
		private double mileage;//	- mileage : double
		private String kind;//	- kind : String
		
		
		public Vehicle() {
			super();
		}


		public Vehicle(String name, double mileage, String kind) {
			super();
			this.name = name;
			this.mileage = mileage;
			this.kind = kind;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public double getMileage() {
			return mileage;
		}


		public void setMileage(double mileage) {
			this.mileage = mileage;
		}


		public String getKind() {
			return kind;
		}


		public void setKind(String kind) {
			this.kind = kind;
		}

		@Override
		public String toString() {
			return "[name=" + name + ", mileage=" + mileage + ", kind=" + kind ;
		}
		
		//	+ Vehicle()
		//	+ Vehicle(name:String, mileage:double,
		//	kind:String)
		//	+ setter/getter()
		//	+ information() : String


}
