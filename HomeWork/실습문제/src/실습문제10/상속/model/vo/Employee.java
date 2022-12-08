package 실습문제10.상속.model.vo;

public class Employee extends Person{

	private int salary;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "\n사원 이름: "+super.getName()+"\n사원 나이:"+super.getAge()+"\n사원 키: "+super.getHeight()
		+"\n사원 몸무게: "+super.getWeight()+"\n사원 급여: "+salary + "\n사원 부서: " + dept;
	}
	
	
	
}
