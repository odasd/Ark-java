package 흠터레스팅;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		String[] account=new String[100];
		String[] name=new String[100];
		int[] money=new int[100];
		
		int count=0;
		
		
		boolean run=true;
		
		while(run) {
			
			System.out.println("-----------------------------------------------");
			System.out.println(" 1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			int menu=s.nextInt();
			
			switch(menu) {
			
			case 1:
				System.out.println("-----------------------------------");
				System.out.println("계좌생성~");
				System.out.println("-----------------------------------");
				System.out.print("계좌번호 : ");
				account[count]=s.next();
				System.out.print("계좌주인놈 : ");
				name[count]=s.next();
				System.out.print("얼마 가지고있냐 : ");
				money[count]=s.nextInt();
				count=count+1;
				
				System.out.println();
				System.out.println("계좌만들어짐ㅊㅋ");
				System.out.println();
				break;
				
			case 2 :
				System.out.println("-----------------------------------");
				System.out.println("계좌목록");
				System.out.println("-----------------------------------");
				
				for(int i=0; i<count; i++) {
					System.out.println(account[i]+"\t"+name[i]+"\t"+money[i]);
					
				}
				
				break;
				
			case 3:
				System.out.println("-----------------------------------");
				System.out.println("이예금");
				System.out.println("-----------------------------------");
				
				System.out.print("계좌번호 : ");
				String account2=s.next();
				
				for(int i=0; i<count; i++) {
					if(account[i].equals(account2)) {
						System.out.println("현재 잔액 : " + money[i]);
						System.out.print("예금액 : " );
						int money2=s.nextInt();
						money[i]=money[i]+money2;
						System.out.println("남은 잔액 : " +money[i]);
					} 
				}		System.out.println("입금완료");
					
				
				break;
				
			case 4:
				System.out.println("-----------------------------------");
				System.out.println("추울금");
				System.out.println("-----------------------------------");
				
				System.out.print("계좌번호 : ");
				account2=s.next();
				
				for(int i=0; i<count; i++) {
					if(account[i].equals(account2)) {
						System.out.println("현재 잔액 : " + money[i]);
						System.out.print("출금액 : " );
						int money2=s.nextInt();
						money[i]=money[i]-money2;
						System.out.println("남은 잔액 : " +money[i]);
					} 
				}		System.out.println("출금완료");
				break;
				
			case 5:
				run=false;
				System.out.println("장비를 정지합니다.");
				break;
				
			default :
					System.out.println("잘못누울렀다");
			
			
			}
		}
		
		
	}
	
}
