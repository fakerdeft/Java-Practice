package com.kh.second;
// ��Ű������ �׻� �ҹ��ڷ� �ۼ�

public class MethodTest {

	public static void main(String[] args) {
		System.out.println("���� �޼ҵ� ���� ��!");
		methodA();
		System.out.println("���ƿԳ�?");
	}
	
	public static void methodA() {
		System.out.println("�޼ҵ� A ���� ��!");
		methodB();
	}
	
	public static void methodB() {
		System.out.println("�޼ҵ� B ���� ��!");
		methodC();
	}
	
	public static void methodC() {
		System.out.println("�޼ҵ� C ���� ��!");
		// methodA(); <- ���ѷ����� ������
	}
}