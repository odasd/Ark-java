package ex06;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//for1();
		//for2();
		//for3();
		//for4();
		
		System.out.print("1:100�հ� 2:¦���հ� 3:Ȧ���հ�");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		switch(number) {
		case 1:
			for2();
			break;
		case 2:
			for3();
			break;
		case 3:
			for4();
			
		}
	
	}
	
	
	//for �ݺ���
	//0~100���� ¦���� �� ��
	
	public static void for3() {
		System.out.println("¦���� ����");
		int tot=0;
		for(int i=0; i<=100; i+=2) {
			tot=tot+i;
		}
		System.out.println("1~100���� ¦���� �� "+ tot);
	}
	
	
	
	//1~100���� Ȧ���� �D
	public static void for4() {
		System.out.println("Ȧ���� ����");
		int tot=0;
		for(int i=1; i<=100; i+=2) {
			tot=tot+i;
		}
		System.out.println("1~100���� Ȧ���� ���� "+ tot);
	}
	
	
	
	//1~100���� ���� ���
	public static void for2() {
		System.out.println("����2");
		int sum=0;
		for(int i=0; i<=100; i++) {
			sum=sum+i;
		}
		System.out.println("1~100������ �հ� : " + sum);
	}
	
	
	
	// for �ݺ���
	// 5���� �ݺ����
	public static void for1() {
		System.out.println("����1");
		for(int i=1; i<=5; i+=1) { //i=i+2 �� ���� ��� ��� i���� 2�� ����
		System.out.println(i);      // i++ = i+=1 = i=i+1 �´� i�� 1�� ����
		}                           // i+2 = i=i+2// i+=3 = i=i+3
	}                               // sum=sum+i = tot=tot+i
}
