package ex03;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		boolean run=true;
		
		String[] no=new String[100]; 
		String[] name=new String[100];
		String[] address=new String[100];
		int count=0; // 주소 입력 개수 == 입력될때마다 1씩증가
			
		while(run) {
			
			System.out.println("----------------------------------------------------");
			System.out.println("1.번 주소입력 | 2.번 주소목록 | 3.번 주소 조회 | 4.번 프로그램종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");
			
			int menu=s.nextInt();
			
			switch(menu) {
				
				case 1: // 주소입력
					
					System.out.println("-------------------------------------------");
					System.out.println("주소입력");
					System.out.println("-------------------------------------------");
					System.out.print("번호> ");
					no[count] =s.next();
					System.out.print("성명> ");
					name[count]=s.next();
					System.out.print("주소> ");
					s.nextLine();
					address[count]=s.nextLine();
					count=count+1;
					System.out.print("결과 : 학생이 입력되었습니다.");
					break;
				case 2:	// 주소목록
					System.out.println("-------------------------------------------");
					System.out.println("주소목록");
					System.out.println("-------------------------------------------");
					for(int i=0; i<count; i++ ) {
						System.out.println("주소목록\n" + no[i] +"\t"+ name[i]+ "\t"+address[i]);
					}
					
					
					break;
				case 3: // 주소 조희
					System.out.println("-------------------------------------------");
					System.out.println("주소조회");
					System.out.println("-------------------------------------------");
					System.out.print("번호>");
					String number=s.next();
					for(int i=0; i<count; i++ ) {    //i가 0부터 1씩 늘어나면서 count-1보다 작거나 같을때까지 반복
							if(no[i].equals(number)) {  //i가 number에 해당하는 숫자와 같다면 아래를 출력 equals= 스트링의 값을  비교
								
								// 기본타입의 A와B값을 비교할 경우 A=B
								// 참조타입의 A와B값을 비교할 경우 A.equals(B)
								System.out.println("성명:" + name[i]);    
								System.out.println("주소:" + address[i]); 
							}
					}
					break;
				case 4: // 종료
					System.out.println("프로그램 종료");
					run=false;
			}
		}
		

	}

}
//등록된 주소를 불러오기, 등록이 어디에됐는데? count 아니냐?