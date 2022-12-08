package com.kh.operator;

public class B_InDecrease {
	
	/*
	 * ���� ������: ���� �����ڷν� �ѹ��� 1�� ���� �Ǵ� �����ϴ� ������
	 * ->��ġ�� ���� ���� ������ �� ������ ���߿� �� ������ �޶�����.
	 * 
	 * [ǥ����]
	 * ++: ���� 1�� ������Ű�� ������ 
	 * --: ���� 1�� ���ҽ�Ű�� ������
	 * 
	 * �������� ��ġ
	 * ���� ����) ++��, --��: ���� 1�� ���� �Ǵ� �����ϰ� ������ ���� ����
	 * ���� ����) ��++, ��--: �ٸ� ������ ���� ó�� �Ŀ� ���� ���� �Ǵ� ����
	 * 
	 */

	public void method1() {// ���� ����
		
		int num = 10;
		System.out.println("num�� ����: "+num);
		
		num++; // num�̶�� �ϴ� ������ +1
		System.out.println("num�� ����: "+num);
		
		num--; // num�� -1
		System.out.println("num�� ����: "+num);
		
		System.out.println("num�� ���� �����ϱ��? : "+num++); // 10
		System.out.println("���� num�� ����: "+num); // 11
	}
	
	public void method2(){// ���� ����
		
		int a=10,b=a++;
		System.out.println("a�� ����: "+a); // 11
		System.out.println("b�� ����: "+b); // 10
		//���� �����̱� ������
		//b��� ������ a���� ���� �����Ŀ� a�� ���������� ��������.
		
		int c=20,d=c--;
		System.out.println("c�� ����: "+c); // 19
		System.out.println("d�� ����: "+d); // 20
	}
	
	public void method3() {// ���� ����
		int a =10,b=++a;
		System.out.println("a: "+a); // 11
		System.out.println("b: "+b); // 11
		
		System.out.println("a: "+ ++a); // 12
	}
	
	public void method4() {// ���� ����
		int num1=20,result=num1++ *3;
		System.out.println("num1 : "+num1);
		System.out.println("result : "+result);
		
		//���� ����
		int num2=20,result2=++num2*3;
		System.out.println("num2 : "+num2);
		System.out.println("result2 : "+result2);
	}
	
}