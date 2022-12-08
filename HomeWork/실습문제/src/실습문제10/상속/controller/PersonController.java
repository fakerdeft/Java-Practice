package 실습문제10.상속.controller;

import 실습문제10.상속.model.vo.Employee;
import 실습문제10.상속.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	
	public int[] personCount() {
		
		int count1=0,count2=0;
		
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null) {
				count1++;
			}
			else break;
		}
		
		for(int i=0;i<e.length;i++) {
			if(e[i]!=null) {
				count2++;
			}
			else break;
		}
		
		int[] iarr= new int[2];
		iarr[0]=count1;
		iarr[1]=count2;
		
		return iarr;
	}
	
	public void insertStudent(String name,int age,double height
			,double weight,int grade,String major) {
		
		for(int i=0;i<s.length;i++) {
			if(s[i]==null) {
				s[i]= new Student(name,age,height,weight,grade,major);
				break;
			}//if(s[i]==null) 
		}//for(int i=0;i<s.length;i++) 
		
	}//public void insertStudent
	
	public void insertEmployee(String name,int age,double height
			,double weight,int salary,String dept) {
		
		for(int i=0;i<e.length;i++) {
			if(e[i]==null) {
				e[i]= new Employee(name,age,height,weight,salary,dept);
				break;
			}//if(e[i]==null) 
		}//for(int i=0;i<e.length;i++) 
		
	}//public void insertEmployee
	
	public Student[] printStudent() {
		
		return s;
	}
	
	public Employee[] printEmployee() {
		
		return e;
	}
}
































