package ex02;

public class Sample {

	public static void main(String[] args) {
		//실수형 변수
		//float num1=10.5f; //실수형 변수(float)는 숫자 마지막에 f를 기입해야함, 꼭 실수가 아니어도 실행됨
		//float num2=20.3f;
		//float 대신 실수는 double를 더 많이 사용함(더 정밀한 값 표시 가능) float처럼 f를 기입 안해도됨
		//double는 float보다 더 많은 저장공간을 필요로함
		double num1=10;
		double num2=20.3;
		double num3=num1+num2;
		double num4=num1-num2;
		double num5=num1*num2;
		double num6=num1/num2;
		
		System.out.println("num1+num2=" + num3 );
		System.out.println("num1-num2=" + num4 );
		System.out.println("num1*num2=" + num5 );
		System.out.println("num1/num2=" + num6 );
		
		//반지름이 5인 원의 넓이
		int r=5; // 정수형이라 int를 사용
		double area=r*r*3.14; // 3.14는 실수이기 때문에 double사용
		
		System.out.println("반지름이"+ r +"인 원의 넓이=" + area); 
		//프린트 문에 들어있는 +는 연결해서 출력하라는 뜻
		// r은 변수이기 때문에 ""밖으로 빼서 기
		
		
		
	}

}
