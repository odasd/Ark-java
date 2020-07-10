package ex01;

import java.util.Scanner;

public class Sample {
	public static void method1() {
		//이름, 국어, 영어, 수학 키보드에서 입력
				//총점, 평균 출력 -> 변수명부터 생각
				
				Scanner s = new Scanner(System.in);
				System.out.print("이름 ");
				String name=s.next(); //키보드에서 입력받아서 name에 넣어주겠다
				
				System.out.println("국어 ");
				int kor=s.nextInt();
				
				System.out.println("영어 ");
				int eng=s.nextInt();
				
				System.out.println("수학");
				int mat=s.nextInt();
				
				int tot=kor+eng+mat;
				System.out.println("총점\n" + tot);
				
				
				double avg=(double)tot/3;
				System.out.println("평균\n" + avg);
	}

	public static void main(String[] args) {
		method1();
		method2();
		method3();
		
		System.out.println("[1] 성적 입력 프로그램");
		System.out.println("[2] 원의 넓이 구하기");
		System.out.println("[3] 삼각형의 넓이 구하기");
		System.out.println("[4] 프로그램 종료");
		
		Scanner s=new Scanner(System.in);
		System.out.println("메뉴선택[1~4]?");
		int menu=s.nextInt();
		
		switch(menu) {
		
		case 1 :
			method1();
			break;
		case 2:
			method2();
			break;
		case 3:
			method3();
			break;
		case 4:
			System.out.println("프로그램 종료");
			break;
		default :
			System.out.println("당신은 틀렸습니다ㅋ_ㅋ");
		}
	}
	public static void method2() {
		//원의 반지름을 입력 받아 원의 넓이를 구할수 있다.
		//반지름이 0이면 프로그램 종료
		boolean run=true; //run이 true인 동안에 실행한다
		
		while(run) {
			
		Scanner s=new Scanner(System.in);
		System.out.println("원의 반지름 = ");
		int r = s.nextInt();
		double area = r * r * 3.14;
		System.out.println("원의 넓이" + area);
		run=false;
		
		/*if(r==0) {
			System.out.println("프로그램 종료");
			run=false;
	    	}*/
		}
	}
	
	public static void method3() {
		//삼각형의 높이와 밑변을 키보드에서 입력받는다.
		//삼각형의 넓이를 구하여 출력한다.
		Scanner s=new Scanner(System.in);
		boolean run=true;
		
		while(run) {
		
		System.out.println("삼각형의 넓이를 구하실래요(y/n)?");
		String q=s.next();
		if(q.equals("y") || q.equals("Y") ) { //String 이기때문에 ==말고 equals를 사용함
		
		System.out.println("높이");
		int h=s.nextInt();
		System.out.println("밑변");
		int w=s.nextInt();
		double area=(double)h*w*1/2;  //h*w*1/2.; .을 찍어줘도 실수로 표기
		System.out.println("삼각형의 넓이 " + area);
			run=false;
		} else if(q.equals("n") || q.equals("N")) {
			System.out.println("프로그램 종료");
			run=false;
		} else {
			System.out.println("다시 쓰세요!");
		}
		}	
	}

}
