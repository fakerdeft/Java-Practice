package 실습문제10.상속.view;

import java.util.Scanner;
import 실습문제10.상속.controller.PersonController;

public class PersonMenu {
	
	private Scanner sc= new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	String name="",major="",dept="";
	int age=0,grade=0,salary=0;
	double height=0,weight=0;
	
	public void mainMenu() {//메인 메뉴
		
		int a=0;
		while(a!=10) {
			System.out.println();
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 "+pc.personCount()[0]+"명 입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 "+pc.personCount()[1]+"명 입니다.");
			System.out.println();
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호:");
		
			switch(sc.nextInt()) {
			
			case 1:studentMenu();
					break;
			case 2:employeeMenu();
					break;
			case 9:System.out.println("종료합니다.");
				a=10;
				break;
			default:System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요.");
			}//switch
			
		}//while(a!=10)
		
	}//public void mainMenu()
	
	public void studentMenu() {//학생 메뉴
		
		while(true) {
			System.out.println();
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			if(pc.personCount()[0]!=3) {
				System.out.println("메뉴 번호:");
				switch(sc.nextInt()) {
				
				case 1:insertStudent();
					break;
				case 2:printStudent();
					break;
				case 9:System.out.println("메인으로 돌아갑니다.");
					return;
				default:System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요.");
				}//switch
			}//if(pc.personCount()[0]!=3)
			
			else {
				System.out.println("학생을 담을 수 있는 공간이\n꽉 찼기 때문에 학생 추가 메뉴는\n더 이상 활성화 되지 않습니다.");
				System.out.println("메뉴 번호:");
				switch(sc.nextInt()) {
				
				case 1:System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				case 2:printStudent();
					break;
				case 9:System.out.println("메인으로 돌아갑니다.");
					return;
				default:System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요.");
				}//switch
				
			}//else
			
		}//while
		
	}//public void studentMenu()
	
	public void employeeMenu() {//사원 메뉴
		
		while(true) {
			System.out.println();
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			if(pc.personCount()[1]!=10) {
				System.out.println("메뉴 번호:");
				switch(sc.nextInt()) {
					
				case 1:insertEmployee();
					break;
				case 2:printEmployee();
					break;
				case 9:System.out.println("메인으로 돌아갑니다.");
					return;
				default:System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요.");
				}//switch
			}//if(pc.personCount()[1]!=10)
			
			else {
				System.out.println("사원을 담을 수 있는 공간이\n꽉 찼기 때문에 학생 추가 메뉴는\n더 이상 활성화 되지 않습니다.");
				System.out.println("메뉴 번호:");
				switch(sc.nextInt()) {
				
				case 1:System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				case 2:printEmployee();
					break;
				case 9:System.out.println("메인으로 돌아갑니다.");
					return;
				default:System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요.");
				}//switch
				
			}//else
			
		}//while
		
	}//public void employeeMenu()
	
	public void insertStudent() {//학생 입력
			sc.nextLine();
		while(true) {
			
			System.out.println("학생 이름:");
			name=sc.nextLine();
			System.out.println("학생 나이:");
			age=sc.nextInt();
			System.out.println("학생 키:");
			height=sc.nextDouble();
			System.out.println("학생 몸무게:");
			weight=sc.nextDouble();
			System.out.println("학생 학년:");
			grade=sc.nextInt();
			sc.nextLine();
			System.out.println("학생 전공:");
			major=sc.nextLine();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			
			if(pc.personCount()[0]!=3) {
				
				System.out.println("그만하시려면 N(또는 n), 이어하시려면\n아무 키나 누르세요:");
				if(sc.nextLine().toUpperCase().equals("N")) {
					return;
				}//if(sc.nextLine().toUpperCase()=="N")
			
			}//if(pc.personCount()[0]!=3) 
			
			else {
				System.out.println("학생을 담을 수 있는 공간이\n꽉 찼기 때문에 학생 추가를\n종료하고 학생 메뉴로 돌아갑니다.");
				return;
			}//else
			
		}//while
	
	}//public void insertStudent()
	
	public void printStudent() {//학생 출력
		for(int i=0;i<pc.printStudent().length;i++) {
			if(pc.printStudent()[i]!=null)
			System.out.print(pc.printStudent()[i].toString());
			System.out.println();
		}
	}
	
	public void insertEmployee() {//사원 입력
		sc.nextLine();
		while(true) {
			
			System.out.println("사원 이름:");
			name=sc.nextLine();
			System.out.println("사원 나이:");
			age=sc.nextInt();
			System.out.println("사원 키:");
			height=sc.nextDouble();
			System.out.println("사원 몸무게:");
			weight=sc.nextDouble();
			System.out.println("사원 급여:");
			salary=sc.nextInt();
			sc.nextLine();
			System.out.println("사원 부서:");
			dept=sc.nextLine();
			
			pc.insertEmployee(name, age, height, weight, salary, dept);
			
			if(pc.personCount()[1]!=10) {
				
				System.out.println("그만하시려면 N(또는 n), 이어하시려면\n아무 키나 누르세요:");
				if(sc.nextLine().toUpperCase().equals("N")) {
					return;
				}//if(sc.nextLine().toUpperCase()=="N")
				
			}//if(pc.personCount()[0]!=3) 
			
			else {
				System.out.println("사원을 담을 수 있는 공간이\n꽉 찼기 때문에 사원 추가를\n종료하고 사원 메뉴로 돌아갑니다.");
				return;
			}//else
			
		}//while
		
	}//public void insertEmployee()
	
	public void printEmployee() {//사원 출력
		for(int i=0;i<pc.printStudent().length;i++) {
			if(pc.printEmployee()[i]!=null)
			System.out.print(pc.printEmployee()[i].toString());
			System.out.println();
		}
		
	}
	
	
}//public class PersonMenu































