package com.kh.operator;

public class C_Compound {
	
	
//	���� ���� ������: �ٸ� ��� �����ڶ� ���� ������
//	+=
//	-=
//	*=
//	/=
//	%=
	
//	����) a+=3; -> a=a+3;
	
	public void method1() {
		
		int num=12;
		System.out.println("���� num: "+num);
		num=num+3;
		System.out.println("+3 num: "+num);
		num+=3;
		System.out.println("+3 num: "+num);
		num-=3;
		System.out.println("-3 num: "+num);
		num*=3;
		System.out.println("X3 num: "+num);
		num/=3;
		System.out.println("/3 num: "+num);
		num%=3;
		System.out.println("%3 num: "+num);
		
	}
	
}
