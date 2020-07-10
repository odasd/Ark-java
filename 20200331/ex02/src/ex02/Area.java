package ex02;

//넓이
public class Area {
	//삼각형 넓이
	static double triangle(int x, int y) {
		System.out.println("삼각형 넓이");
		return (double)x * y / 2;
	}
	
	
	//직사각형 넓이
	static int rectangle(int x, int y) {
		System.out.println("직사각형 넓이");
		return x * y;
	}
	
	//정사각형 넓이 같은 변수여도 개수가 다르면 사용가능
	static int rectangle(int x) {
		System.out.println("정사각형 넓이");
		return x * x;
	}
	
	//원의 넓이
	static double circle(int r) {
		System.out.println("원의 넓이");
		final double pi=3.141597; //final은 최종적 값이라 변수값 변경이 불가
		return r * r * pi;
	}
}
