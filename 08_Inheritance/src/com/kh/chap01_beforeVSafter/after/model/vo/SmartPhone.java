package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product{
	
	private String mobileAgency;

	public SmartPhone() {
		super();
	}
	
	public SmartPhone(String brand,String code,String name,int price,String mobileAgency) {
		super(brand,code,name,price);
		this.mobileAgency=mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String toString() {
		return "SmartPhone "+super.toString()+"mobileAgency=" + mobileAgency + "]";
	}
	
	//내 입맛대로 바꿀거야 
	

	
	
	
	
	
	
	
	
	
	
}
