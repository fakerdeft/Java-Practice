package com.kh.operator;

public class E_Comparison {
	
	/*
	 * �� ������(���� ������)
	 * �� ���� ���� ���ϴ� ���� ������
	 * �� ������ �� ����� true / false
	 * Ư�� ������ ������ �� �ִ� ���ǹ����� ���δ�.
	 * 
	 * ����
	 * 1. ��Һ�
	 * a<b: a�� b���� �۴�
	 * a>b: a�� b���� ũ��
	 * a<=b: a�� b���� �۰ų� ����
	 * a>=b: a�� b���� ũ�ų� ����
	 * 
	 * 2. �����
	 * a==b: a�� b�� ��ġ
	 * a!=b: a�� b�� ��ġx
	 * 
	 * 
	 */
	public void method1() {
		
		int a=10,b=25;
		System.out.println("a<b: "+(a<b));
		//�� ���꺸�� ��� ������ �켱������ �� ���Ƽ� ��ȣ�� �����
		System.out.println("a<=b: "+(a<=b));
		System.out.println("a>b: "+(a>b));
		System.out.println("a>=b: "+(a>=b));
		
		System.out.println("a==b: "+(a==b));
		System.out.println("a!=b: "+(a!=b));
		
		//���+�� ����
		System.out.println("a-b<0: "+(a-b<0));
		
		//��� ���� 2�� ���������� ������ 1->Ȧ, ������ 0-> ¦
		System.out.println("a�� ¦���Դϱ�?: "+(a%2==0));
		System.out.println("b�� Ȧ���Դϱ�?: "+(b%2!=0));
		
	}
}
