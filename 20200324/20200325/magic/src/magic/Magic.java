package magic;

import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("숫자입력>");
		int num=s.nextInt();
		int sum=0;
		
		while(num!=0) {
			for(int i=0; i<=num; i++) {
				sum=sum+i;
			}
			System.out.println("1~"+num+"까지의 합계"+sum+"\n");
			sum=0;
			System.out.println("숫자입력>");
			num=s.nextInt();
			
		}
		System.out.println("프로그램 종료");
	}

}
