package 실습문제9.controller;

import 실습문제9.model.vo.Member;

public class MemberController {
	
	public final int SIZE=10;
	
	private Member[] m =new Member[SIZE];
	
	
	public int existMemberNum(){//등록된 회원 수
		int count=0;
		for(int i=0;i<m.length;i++) {
			if(m[i]!=null) {
				count++;
			}
			else {
				break;
			}
		}//for
		return count;
	}//public int existMemberNum()
	
	public boolean checkId(String id) {//id 체크
		for(int i=0;i<m.length;i++) {
			if(m[i]!=null) {
				if(m[i].getId().equals(id)) {
					return true;
				}
			}
		}//for	
		return false;
	}//public boolean checkId(String id)
	
	//배열에 입력값 넣기
	public Member[] insertMember(String id,String name,String pw,
			String email,char gender,int age) {
		
		for(int i=0;i<m.length;i++) {
			if(m[i]==null) {
			m[i]=new Member(id,name,pw,email,gender,age);	
			break;
			}
		}
		return m;
	}//public Member[] insertMember
	
	public String searchId(String id) {//id 검색
		for(int i=0;i<m.length;i++) {
			if(m[i]!=null) {
				if(m[i].getId().equals(id)) {
					return m[i].inform();
				}
			}
			
		}
		return null;
	}//public Member[] searchId(String id)
	
	
	public Member[] searchName() {//이름 검색

		return m;
	}//public Member[] searchName()
	
	public Member[] searchEmail() {//이멜 검색
		
		return m;
	}//public Member[] searchEmail()
	
	public boolean updatePassword(String id,String pw) {//비번 수정

		for(int i=0;i<m.length;i++) {
			if(m[i]!=null) {
				if(m[i].getId().equals(id)) {
					m[i].setPw(pw);
					return true;
				}
			}
		}
		return false ;
	}//public boolean updatePassword
	
	public boolean updateName(String id,String name) {//이름 수정

		for(int i=0;i<m.length;i++) {
			if(m[i]!=null) {
				if(m[i].getId().equals(id)) {
					m[i].setPw(name);
					return true ;
				}
			}
		}
		return false;
	}//public boolean updateName
	
	public boolean updateEmail(String id,String email) {//이멜 수정

		for(int i=0;i<m.length;i++) {
			if(m[i]!=null) {
				if(m[i].getId().equals(id)) {
					m[i].setPw(email);
					return true ;	
				}
			}
		}
		return false;
	}//public boolean updateName
	
	public boolean delete(String id) {//선택 삭제

		for(int i=0;i<m.length;i++) {
			if(m[i]!=null) {
				if(m[i].getId().equals(id)) {
					m[i]=null;
				return true;
				}
			}
		}//for
		return false;
	}//public boolean delete(String id)
	
	public void delete() {//전체 삭제
		for(int i=0;i<m.length;i++) {
			if(m[i]!=null) {
				m[i]=null;
			}
		}//for
	}//public void delete()
	
	public Member[] printAll() {//배열 출력
		
		return m;
	}//public Member[] printAll()
	
	
}//class MemberController













