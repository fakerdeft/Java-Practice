package com.kh.operator;
import java.util.Scanner;
public class A_Arithmetic {
	
	
//	 ��� ������ - ���� �����ڷν� ���� ���, �켱������ �Ϲ� ���� ����̶� �����ϴ�.
//	 
//	 +:����
//	 -:����
//	 *:����
//	 /:������
//	 %:��ⷯ(modular) ������ ���� ���ϴ� ������
	 
	public void method1() {
		
		int num1=10;
		int num2=3;
		System.out.println("num1 + num2 = "+(num1+num2));
		System.out.println("num1 - num2 = "+(num1-num2)); 
		// ������ ��� ���ڿ��� ���� ������ �Ŀ� ���ڿ��� ������ �Ϸ��� �ϱ� ������ ����
		
		System.out.println("num1 * num2 = "+(num1*num2));
		System.out.println("num1 / num2 = "+(num1/num2));
		System.out.println("num1 % num2 = "+(num1%num2));
		
//	    0���� ������ x
//		System.out.println(10/0);
//		System.out.println(10%0);
		
		double d1 = 35; //35.0
		double d2 = 10; //10.0
		
		System.out.println("\nd1 + d2 = "+(d1+d2));
		System.out.println("d1 - d2 = "+(d1-d2));
		System.out.println("d1 * d2 = "+(d1*d2));
		System.out.println("d1 / d2 = "+(d1/d2));
		System.out.println("d1 % d2 = "+(d1%d2));
		
	}
	
	public void methodCandy() { // ���ο��� ������ ���� �ִ� �޼ҵ�
		//�ο����� �������� �Է� �޾� 1�δ� ���� �� �ִ� ������ ������ ���� ������ ������ ���غ���
		
		Scanner sc= new Scanner(System.in);
		System.out.println("�ο� ���� �Է��ϼ���");
		int sup = sc.nextInt();
		sc.nextLine();
		
		System.out.println("���� ���� �Է��ϼ���");
		int can = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("1�δ� ���� �� �ִ� ������ ����: %d\n���� ������ ����: %d",
				can/sup,can%sup);
		
	}

}