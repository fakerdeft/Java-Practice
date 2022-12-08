package 실습문제;

import java.util.*;

public class 실습문제7 {
	
//////////////////////////////////////////////////////////////////////
	
//	private int empNo;
//	private String empName;
//	private String dept;
//	private String job;
//	private int age;
//	private char gender;
//	private int salary;
//	private double bonusPoint;
//	private String phone;
//	private String address;
//	
//	public 실습문제7(){
//		System.out.println("기본생성자 입니다.");
//	}
//	
//	public 실습문제7(int empNo,String empName) {
//		this(empNo,empName,"","",1,' ',1,1.1,"","");
//	}
//	
//	public 실습문제7(int empNo,String empName,String dept,String job,
//			int age,char gender,int salary,double bonusPoint,
//			String phone,String address) {
//		this.empNo=empNo;
//		this.empName=empName;
//		this.dept=dept;
//		this.job=job;
//		this.age=age;
//		this.gender=gender;
//		this.salary=salary;
//		this.bonusPoint=bonusPoint;
//		this.phone=phone;
//		this.address=address;
//	
//	}
//	public void setEmpNo(int empNo) {
//		this.empNo=empNo;
//	}
//	public void setEmpName(String empName) {
//		this.empName=empName;
//	}
//	public void setDept(String dept) {
//		this.dept=dept;
//	}
//	public void setJob(String job) {
//		this.job=job;
//	}
//	public void setAge(int age) {
//		this.age=age;
//	}
//	public void setSalary(int salary) {
//		this.salary=salary;
//	}
//	public void setBonusPoint(double bonusPoint) {
//		this.bonusPoint=bonusPoint;
//	}
//	public void setPhone(String phone) {
//		this.phone=phone;
//	}
//	public void setAddress(String address) {
//		this.address=address;
//	}
//	
//	public int getEmpNo(){
//		return empNo;
//	}
//	public String getEmpName(){
//		return empName;
//	}
//	public String getDept(){
//		return dept;
//	}
//	public String getJob(){
//		return job;
//	}
//	public int getAge(){
//		return age;
//	}
//	public int getSalary(){
//		return salary;
//	}
//	public double getBonusPoint(){
//		return bonusPoint;
//	}
//	public String getPhone(){
//		return phone;
//	}
//	public String getAddress() {
//		return address;
//	}
//
//	public String info() {
//		return "\n사원 번호: "+empNo+"\n사원 이름: "+empName;
//	}
//	
//	public String info2() {
//		return "\n사원 번호: "+empNo+"\n사원 이름: "+empName+"\n부서: "
//				+dept+"\n직책: "+job+"\n나이: "+age+"\n월급: "+salary+"원"
//				+"\n인센티브: "+bonusPoint+"%"+"\n폰 번호: "+phone+"\n주소: "+address;
//	}
//////////////////////////////////////////////////////////////////////
	
//	Scanner sc=new Scanner(System.in);
//	
//	private String id;
//	private String pw;
//	private String authority;
//	private	int point;
//	
//	public 실습문제7(){
//		
//	}
//	public void setId(String id) {
//		this.id=id;
//	}
//	public void setPw(String pw) {
//		this.pw=pw;
//	}
//	public void setAuthority(String authority) {
//		if(authority=="") {
//			this.authority="일반";
//		}
//		else if(authority=="운영자") {
//			this.authority="운영자";
//			System.out.println("운영자가 원하는 포인트 입력:");
//		}
//		else {
//			this.authority=authority;
//		}
//	}
//	public void setPoint(int point) {
//		if(authority=="운영자")
//		{
//			while(true) {
//				if(point>=0) {
//					this.point=point;
//					break;
//				}
//				else {
//					System.out.println("음수는 불가능합니다.\n다시 입력:");
//					point=sc.nextInt();
//				}
//			}//while
//		}//if
//		else {
//			this.point=100;
//		}//else
//	}//setPoint
//	
//	public String getId(){
//		return id;
//	}
//	public String getPw(){
//		return pw;
//	}
//	public String getAuthority() {
//		return authority;
//	}
//	public int getPoint() {
//		return point;
//	}
//	
//
//	public void info() {
//		System.out.println("\nID: "+id+"\nPW: "+pw+"\n권한: "
//				+authority+"\n포인트: "+point);
//	}


//////////////////////////////////////////////////////////////////////

Scanner sc=new Scanner(System.in);

	private String name;//기종 필드
	private String telecom;//통신사 필드
	private int price;//가격 필드
	private	int period;//약정기간 필드
	
	String[] Arr= {"SK","KT","LG"}; //통신사 배열을 이용하기
	
	public 실습문제7() {//기본 생성자
	}
		
	public void setName(String name) {//세터메소드

		this.name=name; //기종 매개변수를 필드에 저장
	}
	public void setTelecom(String telecom) {//세터메소드
		
		while(true) {//통신사가 SK,KT,LG일 경우
			if(telecom.equals("SK")||telecom.equals("KT")||telecom.equals("LG")) {
				this.telecom=telecom;//통신사 매개변수를 필드에 저장
				System.out.println("가격 입력:");
				break;//반복 탈출
			}
			else {//지정된 통신사가 아닐 경우
				System.out.println("SK, KT, LG만 가능합니다.\n다시 입력:");
				telecom=sc.nextLine();//통신사 재입력
			}
		}//while
	}//setTelecom
	
	public void setPrice(int price) {//세터메소드
		
		while(true) {//가격이 0이상일 경우까지 반복
			if(price>=0) {//가격이 0이상일 경우
				this.price=price;//가격 매개변수를 필드에 저장
				System.out.println("약정기간 입력:");
				break;//반복 탈출
			}
			else {//가격이 음수일 경우
				System.out.println("음수 입력 불가능.\n다시 입력:");
				price=sc.nextInt();//가격 재입력
			}
		}//while
	}//serPrice
	
	public void setPeriod(int period) {//세터메소드
		while(true) {//약정기간이 6개월 단위인 경우까지 반복 
			if(period%6==0) {//약정기간이 6개월 단위일 경우
				this.period=period;//약정기간 메소드를 필드에 저장
				break;//반복 탈출
			}
			else {//6개월 단위 아닐 경우
				System.out.println("약정기간은 6개월 단위로만\n입력 가능합니다.\n다시 입력:");
				period=sc.nextInt();//약정기간 재입력		
			}		
		}//while
	}//setPeriod
	
	public String getName(){//게터메소드
		return name;
	}
	public String getTelecom(){//게터메소드
		return telecom;
	}
	public int getPrice() {//게터메소드
		return price;
	}
	public int getPeriod() {//게터메소드
		return period;
	}
	
	
	public void info() {//결과 출력 메소드
		System.out.println("\n이름: "+name+"\n통신사: "+telecom+"\n가격: "
				+price+"만원\n약정기간: "+period+"개월\n");
	}
	
}//class





























