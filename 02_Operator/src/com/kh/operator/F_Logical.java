package com.kh.operator;
import java.util.Scanner;

public class F_Logical {
	
	/*
	 * �� ������: ���� ������, �� ���� ������ �����ϴ� ������
	 * 
	 * [ǥ����] ���� �� ������ ���� -> ������� ����
	 * 
	 * ����
	 * AND ������ : ����&&����
	 * ->���� ������ ��� true���� ������� true
	 * 
	 * OR ������ : ����||����
	 * ->���� �Ǵ� ������ �� �ϳ��� true���� ����� true
	 */
	
	static Scanner sc = new Scanner(System.in);

	public void method1() {//AND ������
		//����ڰ� �Է��� ���� ����̸鼭 ¦������ Ȯ���غ���
		
		System.out.println("���� �Է�: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		boolean result=(num>0)&&(num%2==0);
		//&& : ~�̸鼭, ~�̰�
		System.out.println("�Է��� ����\n����̸鼭 ¦���ΰ���? \n"
				+result);
		
		//����ڰ� �Է��� ���� �����̸鼭 Ȧ������ Ȯ���غ���
		
		boolean result2=(num<0)&&(num%2!=0);
		System.out.println("\n�Է��� ����\n�����̸鼭 Ȧ���ΰ���? \n"
				+result2);
		
		//�Է��� ���� ���� 1�̻� 100�������� Ȯ��
		boolean result3=(1<=num)&&(num<=100);
		System.out.println("\n�Է��� ���� 1�̻� 100�����ΰ���? \n"
				+result3);
		
	}
	
	
	public void method2() {//OR ������
		//����ڰ� �Է��� ���� M �Ǵ� m���� Ȯ��
		//����� �����Դϱ�? t/f
		
		System.out.println("���� �Է�: ");
		char c= sc.nextLine().charAt(0);		
		boolean result=(c=='M')||(c=='m');
//		String c2=sc.nextLine();
//		boolean result2=(c2.equals("M"))||(c2.equals("n"));
//		���ڿ�(String) �񱳴� .equals	
		System.out.println("�Է��� ���� M �Ǵ� m �ΰ���? \n"
				+result);
		System.out.println("�����Դϱ�? \n"+result);
	}
	
	public void method3() {
		int num=10;
		boolean result = false && (num>0);
		//dead code: ������ f�� ���� �� ���� ������ ����x
		System.out.println(result);
		
		boolean result2 = false || (num>0);
		System.out.println(result2);
	}

}
