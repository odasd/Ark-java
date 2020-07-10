package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		boolean run=true;
		
		String[] account=new String[100]; // 계좌번호
		String[] name=new String[100];	// 계좌주
		int[] money=new int[100];	// 잔액
		int count=0;
		
		
		
		
		while(run) {
			
		System.out.println("------------------------------------------------");
		System.out.println(" 1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
		System.out.println("------------------------------------------------");
		System.out.print("선택> ");

		int menu=s.nextInt();
		
		switch(menu) {
		
			case 1: //계좌 생성
				System.out.println("---------------------------------------------");
				System.out.println("계좌생성");
				System.out.println("---------------------------------------------");
				System.out.print("계좌번호> ");
				account[count]=s.next();
				System.out.print("계좌주> ");
				name[count]=s.next();
				System.out.print("초기 입금액> ");
				s.nextLine();
				money[count]=s.nextInt();
				count=count+1;
				System.out.print("결과 : 계좌가 생성되었습니다.");
				break;
			case 2: // 계좌목록
				System.out.println("-------------------------------------------");
				System.out.println("계좌목록");
				System.out.println("-------------------------------------------");
				for(int i=0; i<count; i++ ) {
					System.out.println(account[i] +"\t"+ name[i]+ "\t"+money[i]);
					System.out.println();
				}
				break;
			case 3: // 예금
				System.out.println("-------------------------------------------");
				System.out.println("예금");
				System.out.println("-------------------------------------------");
				System.out.print("계좌번호> ");
				String acc=s.next(); 
				System.out.print("예금액> ");
				int input=s.nextInt();
				
				boolean find=false;
				for(int i=0; i<count; i++) {
					if(account[i].equals(acc)) { 
						//입력되어 있는 계좌중(i) 입력한 계좌(acc)와 같은 값이 있으면 참값이므로 아래를 출력
						money[i]=money[i]+input;	//초기예금액=초기예금액 + 예금액(누적)
						System.out.println("결과 예금 성공");
						System.out.println("잔액" + money[i]);
						find=true;
					} 
				}
				if(find) {
					System.out.println("예금이 성공했습니다.\n");
				} else {
					System.out.println("계좌가 없습니다.\n");
				}
				 break;	
			case 4: // 출금
				System.out.println("-------------------------------------------");
				System.out.println("출금");
				System.out.println("-------------------------------------------");
				System.out.print("계좌번호> ");
				String acc2=s.next();
				System.out.print("출금액> ");
				int output=s.nextInt();
				
				boolean find1=false;
				for(int i=0; i<count; i++) {
					if(account[i].equals(acc2)) {
						//입력되어 있는 계좌중(i) 입력한 계좌(acc2)와 같은 값이 있으면 참값이므로 아래를 출력
						money[i]=money[i]-output; ////초기예금액=초기예금액 + 출금액(누적)
						System.out.println("결과 출금 성공");
						System.out.println("잔액 " + money[i]);
						find=true;
					} 	
				}	
				if(find1) {
					System.out.println("출금이 성공했습니다.\n");
				} else {
					System.out.println("계좌가 없습니다.\n");
				}
				break;
			case 5: // 종료
				run=false;
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("잘못된 메뉴입니다.");
				
		}
		
		}
	}

}
