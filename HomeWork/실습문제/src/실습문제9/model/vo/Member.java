package 실습문제9.model.vo;

public class Member {
	
	private String id;
	private String name;
	private String pw;
	private String email;
	private char gender;
	private int age;
	
	public Member(){} // 기본 생성자
	
	public Member(String id,String name,String pw,String email
			,char gender,int age) {  // 모든 필드 초기화 생성자
		
		this.id=id;
		this.name=name;
		this.pw=pw;
		this.email=email;
		this.gender=gender;
		this.age=age;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPw(String pw) {
		this.pw=pw;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPw() {
		return pw;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	
	public String inform() {
		return id+" "+name+" "+pw+" "+email+" "+gender+" "+age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
