package 실습문제10.인터페이스.model.vo;

public abstract class SmartPhone implements CellPhone,TouchDisplay{
	
	private String maker; //제조사 정보
	
	public SmartPhone() {
		super();
	}
	
	public String getMaker() {
		return maker;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public abstract String printInformation();
	
}

































