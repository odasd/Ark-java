package ex04;

public class Sample {

	public static void main(String[] args) {
		// 자동형변환(작은것->큰것)
		char charValue='a'; //(정해져있는 코드값을 알고 싶을때 사용함)
		// 변수, 변수명, 값 // 변수명은 보통 소문자로 시작 // 합쳐질때는(클래스 이름) 두번째 단어는대문자 사용
		// workspace -> project -> class -> main methhod
		// char 1byte
		// int, flat 4byte
		// double 8byte
		// boolean 1byte
		int intValue = charValue;
		System.out.println(intValue);
		
		double doubleValue=charValue;
		System.out.println(doubleValue);
		
		intValue=100; // 위에서 인트벨류를 선언했기때문에 이름을 다르게 해야함
		doubleValue=intValue;
		System.out.println(doubleValue);
		
		// 강제형변환(큰것->작은것)
		intValue = 65;
		charValue = (char)intValue; //강제형변환은 ()안에 타입을 적어줌 (정해져있는 코드값을 알고 싶을때 사용함)
		System.out.println(charValue);
		
		doubleValue = 100.5;
		intValue=(int)doubleValue;
		System.out.println(intValue); // 데이터 타입을 ()안에 적어주면 강제형변환이 되어 오류가 나지 않음
		
		
		int kor=95, eng=100;
		double avg=(double)(kor+eng)/2; 
		// 두 수의 평균은 97.5가 나와야 하나 정수라 95가 나와 강제 형변한을 함으로 97.5의 값을 얻을수 있다
		System.out.println(avg);
		
		doubleValue=12.4567;
		intValue=(int)doubleValue;
		System.out.println(intValue);
		
		intValue=68;
		charValue=(char)intValue;
		System.out.println(charValue);
		
		
		//for문 
		for(char i='A'; i<'Z'; i++) {
			intValue = i;
			System.out.println(i+":"+intValue);
		
		}
		for(int i=15; i<65; i++) {
			charValue=(char)i;
			System.out.println(i+":"+charValue);
		}
	}

}

// 자동현변환
// char -> int, int->double

// 강제형변환
// (char)int->char,(int)double->int
