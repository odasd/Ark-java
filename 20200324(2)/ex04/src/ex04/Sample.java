package ex04;

public class Sample {

	public static void main(String[] args)  {
		//switch문
		int num=1;
		
		switch(num) {
		case 1 :
			System.out.println("1번이 나왔습니다.");
			System.out.println("--------------");
			break; // 다음 case를 실행하지 말고 switch문을 빠져나오기 위해서이다
		case 2 :
			System.out.println("2번이 나왔습니다.");
			break;
		case 3 :
			System.out.println("3번이 나왔습니다.");
			break;
		case 4 :
			System.out.println("4번이 나왔습니다.");
			break;
		case 5 : 
			System.out.println("5번이 나왔습니다.");
			break;
		case 6 : 
			System.out.println("6번이 나왔습니다.");
			break; //마지막 구문은 break생략 가능
		default : //해당되는 case가 없는 숫자를 선택했을때 원하는 구문 출력
			System.out.println("번호가 틀렸습니다.");
		}

	}

}
