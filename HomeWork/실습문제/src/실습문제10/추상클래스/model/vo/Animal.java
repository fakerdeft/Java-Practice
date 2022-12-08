package 실습문제10.추상클래스.model.vo;

public abstract class Animal {
	
	private String name;
	private String kinds;
	public Animal() {
		super();
	}
	public Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}
	
	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고\n종류는 " + kinds + "입니다.\n";
	}
	
	public abstract void speak();

}
