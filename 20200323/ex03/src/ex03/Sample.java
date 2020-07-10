package ex03;

public class Sample {

	public static void main(String[] args) {
		//문자형 변수 
		char a='A'; //char변수는 문자 하나를 저장 가능함(싱글쿼터 사용)
		String name="홍길동"; //string은 여러 문자 저장에 사용 (값을 줄때 더블쿼터 사용)
		System.out.println("반"+a);
		System.out.println("이름"+name);
		
		int kor=85, eng=76, mat=77;
		double tot=kor+eng+mat;
		double avg=tot/3;		
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);
		
		//논리형 변수 - 참 혹은 거짓 값을 선언하면 믿줄에서 사용(true값과 false값만 가질수 있음)
		boolean stop=true;
		stop=false;
		System.out.println("stop:"+stop);
		
	}

}
// workspace -> project -> class -> main methhod
// char 1byte
// int, flat 4byte
// double 8byte
// boolean 1byte