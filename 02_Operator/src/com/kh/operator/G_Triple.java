package com.kh.operator;
import java.util.Scanner;
public class G_Triple {
	
	/*
	 * ���� ������: �ǿ����ڰ� 3��-> �� 3���� ������ 1���� �̷������.
	 * 
	 * ���ǽ�: ������� ���� ������ ó���ϴ� ���
	 * -> ������� ���� ��� ��1�� ó��
	 * -> ������� ������ ��� ��2�� ó��
	 * 
	 * [ǥ����]
	 * ���ǽ� ? ��1 : ��2 ;
	 * ���ǽ� �� -> ��1 , ����-> ��2
	 * 
	 * ex) 10>5 ? num++ : num--;
	 * 
	 */
	
	static Scanner sc=new Scanner(System.in);
	
	public void method1() {
		//����ڰ� �Է��� ���� ������� �ƴ��� �Ǻ� �� �׿� �´� ����� ���
		System.out.println("���� �Է�: ");
		int n=sc.nextInt();
		
		//������� ���ڿ��� ���� �� �ֵ��� �ۼ�
		String result=(n>0)?"����Դϴ�.":"����� �ƴմϴ�.";
		System.out.println(result);	
	}
	
	public void method2() {
		//¦������ Ȧ������ �Ǻ��ؼ� ¦���Դϴ�orȦ���Դϴ� ���ڿ� ���
		System.out.println("���� �Է�: ");
		int n=sc.nextInt();
		String result=(n%2==0)?"¦���Դϴ�":"Ȧ���Դϴ�";
		System.out.println(result);
	}
	
	public void method3() {
		//������ �ϳ� �Է� �޾� ��ҹ��� �Ǵ�
		System.out.println("���� �Է�: ");
		char c=sc.nextLine().charAt(0);
		String result=(c>='a'&& c<='z')?"�ҹ����Դϴ�":"�빮���Դϴ�";
		//���ĺ��� ����ó�� ũ��� ����
		System.out.println(result);
	}
	
	public void method4() {
		//�������� ������� 0���� �������� �Ǻ��غ���
		System.out.println("���� �Է�: ");
		int n=sc.nextInt();
		String result=(n>0)?"����Դϴ�":((n==0)?"0�Դϴ�":"�����Դϴ�");
		System.out.println(result);
	}
}
