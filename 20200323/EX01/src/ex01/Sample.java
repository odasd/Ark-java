package ex01;

public class Sample {

	public static void main(String[] args) {
		System.out.println("안녕!!");
		System.out.println("홍길동...");

		
		//정수형변수 -- 중요함 -- 프로그램에서 =의 뜻은 오른쪽거를 왼쪽에 저장한다는 뜻임
		int num=100; // 100이라는 값을 num에 저장하는 것(int num은 num에 정수값만 들어갈수 있음을 의미함)
		System.out.println(num);
		System.out.println("num=" + num);
		
		int num1=1000; //num값 정의, int는 정수형 변수(실수는 값에 표시되지 않음)
		int num2=200;
		int num3=num1+num2;
		int num4=num1-num2;
		int num5=num1*num2;
		int num6=num1/num2;
		
		System.out.println("num1=" + num1 ); // println에서 + 는 연결해서 출력하라는 뜻
		System.out.println("num2=" + num2 );
		System.out.println("두수를 더한 결과=" + num3 );
		System.out.println("두 수를 뺀 결과=" + num4);
		System.out.println("두 수를 곱한 결과=" + num5 );
		System.out.println("두 수를 나눈 결과=" + num6 );
		
			}

}
