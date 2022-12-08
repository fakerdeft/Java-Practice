package 실습문제9.view;

import java.util.Scanner;

import 실습문제9.controller.MemberController;

public class MemberMenu {
	
	private Scanner sc=new Scanner(System.in);
	private MemberController mc=new MemberController();
	
	public MemberMenu() {}//기본생성자
	
	
	String name="",id="",pw="",email="";
	char gender=0;
	int age=0,a=0,b=0;
	public void mainMenu() {//메인메뉴
		
		System.out.println("최대 등록 가능한 회원 수는 "+mc.SIZE+"명 입니다.");
		System.out.println("현재 등록된 회원 수는 "
					+mc.existMemberNum()+"명 입니다.");
		
		while(b!=10) {//메뉴 번호 누를때 까지 반복
			if(mc.existMemberNum()!=mc.SIZE) {
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.println("메뉴 번호: ");
				a=sc.nextInt();
				switch(a) {
				case 1: insertMember();
					break;
				case 2: searchMember();
					break;
				case 3: updateMember();
					break;
				case 4: deleteMember();
					break;
				case 5: printAll();
					break;
				case 9:	
					b=10;
					System.out.println("프로그램을 종료합니다");
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				}//switch
		
			}//if(mc.existMemberNum()!=mc.SIZE)
			
			else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.println("메뉴 번호: ");
				a=sc.nextInt();
				switch(a) {
				case 2: searchMember();
					break;
				case 3: updateMember();
					break;
				case 4: deleteMember();
					break;
				case 5: printAll();
					break;
				case 9:	
					b=10;
					System.out.println("프로그램을 종료합니다");
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				}//switch
			}//else	
			
		}//while
	}//public void mainMenu()
	
	
	public void insertMember() {//회원 정보 입력
		
		sc.nextLine();
		System.out.println("새 회원을 등록합니다.");
		System.out.println("아이디:");
		while(true) {
			id=sc.nextLine();
			if(mc.checkId(id)==true) {
				System.out.println("중복된 아이디입니다.\n다시 입력해주세요:");
			}
			else {
				break;
			}
		}//while
		System.out.println("이름:");
		name=sc.nextLine();
		System.out.println("비밀번호:");
		pw=sc.nextLine();
		System.out.println("이메일:");
		email=sc.nextLine();
		System.out.println("성별(M/F):");
		while(true) {
			gender=sc.nextLine().charAt(0);
			if(gender!='M'&&gender!='F'
					&&gender!='m'&&gender!='f') {
				System.out.println("성별을 다시 입력하세요:");
			}
			else {
				break;
			}
		}//while
		System.out.println("나이:");
		age=sc.nextInt();
		mc.insertMember(id, name, pw, email, gender, age);
		mainMenu();
		
	}//public void insertMember()
	
	
	public void searchMember() { //검색하기

		sc.nextLine();
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호:");
		a=sc.nextInt();
		switch(a) {
		case 1: searchId();
			break;
		case 2: searchName();
			break;
		case 3: searchEmail();
			break;
		case 9: System.out.println("메인으로 돌아갑니다.");
				return;
		default: System.out.println("잘못 입력하셨습니다.");
				return;
		}//switch
	}//public void searchMember() 
	
	public void searchId() {//id 검색
		sc.nextLine();
		System.out.println("검색할 회원의 아이디:");
		id=sc.nextLine();
		
			if(mc.searchId(id)!=null) {
				System.out.println("찾으신 회원 조회 결과입니다.");
				System.out.println(mc.searchId(id));
			}	
			else {
				System.out.println("검색 결과가 없습니다.");
			}
			return;

	}//public void searchId()
	
	public void searchName() {//이름 검색
		sc.nextLine();
		System.out.println("검색할 회원의 이름:");
		name=sc.nextLine();
		
		int count =0,count2=0;
		for(int i=0;i<mc.SIZE;i++) {
			if(mc.searchName()[i]!=null) {
				count++;
				if(name.equals(mc.searchName()[i].getName())) {
					if(count==1) {
						System.out.println("찾으신 회원 조회 결과입니다.");
					}//if(count==1)
				System.out.println(mc.searchName()[i].inform());
				}//if(name.equals(mc.searchName()[i].getName()))
				else {
					count2++;
				}
			}//if(mc.searchName()[i]!=null)
		}//for
		if(count2==count) {
			System.out.println("검색  결과가 없습니다.");
		}//if(count2==count)
		return;
		
	}//public void searchName()

	public void searchEmail() {//이메일 검색
		
		sc.nextLine();
		System.out.println("검색할 회원의 이메일:");
		email=sc.nextLine();
		
		int count =0,count2=0;
		for(int i=0;i<mc.SIZE;i++) {
			if(mc.searchEmail()[i]!=null) {
				count++;
				if(email.equals(mc.searchEmail()[i].getEmail())) {
					if(count==1) {
						System.out.println("찾으신 회원 조회 결과입니다.");
					}
				System.out.println(mc.searchEmail()[i].inform());
				}
				else {
					count2++;
				}
			}
		}
		if(count2==count) {
			System.out.println("검색  결과가 없습니다.");
		}
		return;

	}//public void searchEmail()
	
	
	public void updateMember() { //수정하기
		sc.nextLine();
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호:");
		a=sc.nextInt();
		switch(a) {
		case 1: updatePw();
			break;
		case 2: updateName();
			break;
		case 3: updateEmail();
			break;
		case 9: System.out.println("메인으로 돌아갑니다.");
				return;
		default: System.out.println("잘못 입력하셨습니다.");
				return;
		}//switch
	}//public void updateMember()
	
	public void updatePw() {//pw 수정
		sc.nextLine();
		System.out.println("수정할 회원의 아이디:");
		id=sc.nextLine();
		System.out.println("수정할 비밀번호:");
		pw=sc.nextLine();
		if(mc.updatePassword(id,pw)==true) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		return;
	}//public void updatePw()
	
	public void updateName() {//이름 수정
		sc.nextLine();
		System.out.println("수정할 회원의 아이디:");
		id=sc.nextLine();
		System.out.println("수정할 이름:");
		name=sc.nextLine();
		if(mc.updateName(id,pw)==true) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		return;
	}//public void updateName()
	
	public void updateEmail() {//이메일 수정
		sc.nextLine();
		System.out.println("수정할 회원의 아이디:");
		id=sc.nextLine();
		System.out.println("수정할 이메일:");
		email=sc.nextLine();
		if(mc.updateEmail(id,pw)==true) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		return;
	}//public void updateEmail()
	
	
	public void deleteMember() {//삭제하기
		sc.nextLine();
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호:");
		a=sc.nextInt();
		switch(a) {
		case 1: deleteOne();
			break;
		case 2: deleteAll();
			break;
		case 9: System.out.println("메인으로 돌아갑니다.");
				return;
		default: System.out.println("잘못 입력하셨습니다.");
				return;
		}//switch
	}//public void deleteMember()
	
	public void deleteOne() {//하나만 삭제
		sc.nextLine();
		String yn="";		
		System.out.println("삭제할 회원의 아이디:");
		id=sc.nextLine();
		System.out.println("정말 삭제하시겠습니까?(y/n)");
		yn=sc.nextLine();
		if(yn.equals("y")||yn.equals("Y")) {
			if(mc.delete(id)==true) {
				System.out.println("성공적으로 삭제하였습니다.");
				mc.delete(id);
			}
			else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
		return;
	}//public void deleteOne()
	
	public void deleteAll() {//전체 삭제
		sc.nextLine();
		String yn="";
		System.out.println("정말 삭제하시겠습니까?(y/n)");
		yn=sc.nextLine();
		if(yn.equals("y")||yn.equals("Y")) {
			System.out.println("성공적으로 삭제하였습니다.");
			mc.delete();
		}
		return;
	}//public void deleteAll()
	
	public void printAll() {//전체출력
			if(mc.existMemberNum()!=0) {
				for(int i=0;i<mc.SIZE;i++) {
					if(mc.printAll()[i]!=null) {
						System.out.println(mc.printAll()[i].inform());
					}
				}
			}
			else {
				System.out.println("저장된 회원이 없습니다.");
				System.out.println();
			}
			return;
		   
	}//public void printAll()

	
}//class MemberMenu



















