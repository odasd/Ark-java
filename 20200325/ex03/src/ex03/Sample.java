package ex03;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	boolean run =true;
	int speed=0;
	while(run) {
		System.out.println("-------------------");
		System.out.println("1. 증속 | 2. 감속 | 3. 중지");
		System.out.println("-------------------");
		System.out.println("선택 : ");
		int menu=s.nextInt();
		
		
		
		switch(menu) {
		case 1:
			speed = speed+1;
			System.out.println("현재속도 " + speed+"\n");
			break;
		case 2:
			speed = speed-1;
			System.out.println("현재속도 " + speed+"\n");
			break;
		case 3:
			run=false;
			System.out.println("프로그램 종료");
		}
		
			
		
		
	}
	}

}
