package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//cal();
		//Area a1=new Area();  //static을 적용해주면 클래스 이름을 적어줘도 사용가능 객체생성이 필요없음 Area클래스에 적을시
		System.out.println(Area.triangle(5, 6));
		System.out.println(Area.rectangle(5, 6));
		System.out.println(Area.rectangle(5));
		System.out.println(Area.circle(5));
	}
	//일반
	public static void cal() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("x = ");
		int x=s.nextInt();
		System.out.println("y = ");
		int y=s.nextInt();
		
		Calculator c1=new Calculator(x, y);
		System.out.println("x = " + c1.x);
		System.out.println("y = " + c1.y);
		System.out.println("x + y = "+ c1.plus(c1.x, c1.y));
		
		
		double result=c1.divide(c1.x, c1.y);
		System.out.println("x / y = " + result);
		
		result=c1.multiply(c1.x, c1.y);
		System.out.println("x * y = " + result);
		
		
		result=c1.minus(c1.x, c1.y);
		System.out.println("x - y = "+ result);
		
		c1.powerOn();
		
	}
	
	
	
}
