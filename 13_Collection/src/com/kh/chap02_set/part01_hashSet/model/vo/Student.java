package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student {
	
	private String name;
	private int age;
	private int score;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
		String str = "asd";
	}
	
//	//동일객체로 판별하기 위한 작업 equals와 hashCode 오버라이딩
//	//Object에 있는 equals 메소드 오버라이딩 하기
//	@Override
//	public boolean equals(Object obj) {
//		
//		if(this == obj) {//이 객체와 전달받은 obj객체의 주소값이 동일하다면 - 같은 객체
//			return true; //이거 같은거야		
//		}
//		if(obj == null) {//전달받은 객체값이 null이면 비교할 필요도 없이 false
//			return false;
//		}
//		if(getClass()!=obj.getClass()) {//이 객체와 전달받은 객체의 타입이 다르면 false			
//			return false;
//		}
//		
//		//위에서 필드값을 비교할 가치가 없는 상황에서 걸리지지 않았을 때 
//		//비로소 객체 내부 필드값을 비교한다.
//		//전달받은 객체 타입이 Object이기 때문에 Student,메소드를 사용할 수 없다.
//		//강제형변환으로 객체 타입 통일시키기.
//		Student other = (Student)obj;
//		//null일때도 비교를 해야함 - 내부값을 비교하는 작접중이기 때무넹
//		if(this.name==null) {//name이 null일때
//			if(other.name!=null) {//전달받은 other객체의 name은 null이 아니라면
//				return false;
//			}
//		}
//		
//		//현재 객체의 name필드값과 other의 name필드값이 다르다면
//		else if(!(this.name.equals(other.name))){
//			return false;
//		}
//		if(this.age!=other.age) {
//			return false;
//		}
//		if(this.score!=other.score) {
//			return false;
//		} 
//		
//		return true;//위에서 아닌경우를 전부 거치고 내려왔으니 조건에 걸리지 않았다면 같다는 의미
//		
//	}
//	
//	@Override
//	public int hashCode() {
//		
//		return (this.name+this.age+this.score).hashCode();//필드값 전부 더해서 문자열.hashCode()
//	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
	

}




































