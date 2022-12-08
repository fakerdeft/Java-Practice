package 실습문제10.상속.model.vo;

public class Student extends Person{
	
	private int grade;
	private String major;
	
	public Student() {
		super();
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "\n학생 이름: "+super.getName()+"\n학생 나이:"+super.getAge()+"\n학생 키: "+super.getHeight()
		+"\n학생 몸무게: "+super.getWeight()+"\n학생 학년: "+grade + "\n학생 전공: " + major;
	}
	
	
	

}
