package ex06;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//for1();
		//for2();
		//for3();
		//for4();
		
		System.out.print("1:100합계 2:짝수합계 3:홀수합계");
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
	
	
	//for 반복문
	//0~100까지 짝수의 총 합
	
	public static void for3() {
		System.out.println("짝수의 총합");
		int tot=0;
		for(int i=0; i<=100; i+=2) {
			tot=tot+i;
		}
		System.out.println("1~100까지 짝수의 합 "+ tot);
	}
	
	
	
	//1~100까지 홀수의 핪
	public static void for4() {
		System.out.println("홀수의 총합");
		int tot=0;
		for(int i=1; i<=100; i+=2) {
			tot=tot+i;
		}
		System.out.println("1~100까지 홀수의 총합 "+ tot);
	}
	
	
	
	//1~100까지 합을 출력
	public static void for2() {
		System.out.println("예제2");
		int sum=0;
		for(int i=0; i<=100; i++) {
			sum=sum+i;
		}
		System.out.println("1~100까지의 합계 : " + sum);
	}
	
	
	
	// for 반복문
	// 5까지 반복출력
	public static void for1() {
		System.out.println("예제1");
		for(int i=1; i<=5; i+=1) { //i=i+2 도 같은 결과 출력 i값에 2씩 증가
		System.out.println(i);      // i++ = i+=1 = i=i+1 셋다 i에 1씩 증가
		}                           // i+2 = i=i+2// i+=3 = i=i+3
	}                               // sum=sum+i = tot=tot+i
}
