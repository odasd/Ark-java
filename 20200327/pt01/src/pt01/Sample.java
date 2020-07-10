package pt01;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String[] account=new String[100];
		String[] name=new String[100];
		int[] money=new int[100];
		int count=0;
		
		
		boolean run=true;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			int menu=s.nextInt();
			
			switch(menu) {
			
			case 1:
				System.out.print("계좌번호> ");
				account[count]=s.next();
				System.out.print("계좌주> ");
				name[count]=s.next();
				System.out.print("초기입금액> ");
				money[count]=s.nextInt();
				System.out.println("결과 : 계좌가 생성되었습니다.");
				count=count+1;
				break;
			case 2:
				System.out.println("----------------------------------------------");
				System.out.println("계좌목록");
				System.out.println("----------------------------------------------");
				
				for(int i=0; i<count ; i++) {
					System.out.println(account[i]+"\t"+name[i]+"\t"+money[i]);
				}
				break;
			case 3:
				System.out.println("예금");
				System.out.println("----------------------------------------------");
				System.out.println("계좌번호 : ");
				String account2=s.next();
				
				for(int i=0; i<count; i++) {
					if(account[i].equals(account2)) {
						System.out.println("예금액 : ");
						int money2=s.nextInt();
						money[i]=money[i]+ money2;
					}
				}	System.out.println("결과 : 예금이 완료되었습니다.");
				break;
			case 4:
				System.out.println("예금");
				System.out.println("----------------------------------------------");
				System.out.println("계좌번호 : ");
				String account3=s.next();
				
				for(int i=0; i<count; i++) {
					if(account[i].equals(account3)) {
						System.out.println("출금액 : ");
						int money3=s.nextInt();
						money[i]=money[i]- money3;
					} System.out.println("결과 : 출금이 완료되었습니다.");
				}
				break;
			case 5:
				System.out.println("종료");
				run=false;
				break;
			default :
				System.out.println("잘못된 선택");
					
			}
		}
		
		

	}

}
