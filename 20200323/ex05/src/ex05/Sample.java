package ex05;

public class Sample {

	public static void main(String[] args) {
		//산술연산자
		int num1=10;
		int num2=3
				; //=은 오른쪽 값을 왼쪽값에 저장하는 것
		int result1= num1+num2;
		int result2= num1-num2;
		int result3= num1*num2;
		int result4= num1/num2;
		int result5= num1%num2;
		//+, -, *, /, %(나머지)연산결과 출력
		System.out.println(num1 + "+" +num2 + "=" + result1);
		System.out.println(num1 + "-" +num2 + "=" + result2);
		System.out.println(num1 + "*" +num2 + "=" + result3);
		System.out.println(num1 + "/" +num2 + "=" + result4);
		System.out.println(num1 + "%" +num2 + "=" + result5);
		
		//관계(비교)연산자
		boolean result6 = (num1==num2); //num1과num2비교
		System.out.println(num1 + "==" + num2 + ":" + result6);
		result6= (num1 > num2);//크냐
		System.out.println(num1 + ">" +num2 +":" +result6);
		result6= (num1<num2);//작냐
		System.out.println(num1 + "<" +num2 +":" +result6);
		result6=(num1>=num2);//크거나 같냐
		System.out.println(num1 + ">=" +num2 +":" +result6);
		result6=(num1<=num2);//작거냐 같냐
		System.out.println(num1 + "<=" +num2 +":" +result6);
		result6=(num1 != num2); //!= 의 뜻은 같지않다
		System.out.println(num1 + "!=" +num2 +":" +result6);
		
		//논리연산자 (and, or, not)
		result6 = (num1>10) || (num2<5); // ||또는(or) 둘중에 하나만 참이어도 참으로 표시
		System.out.println("----------");
		System.out.println(result6);
		
		result6 = (num1>10) && (num2<5); // &&그리고(and)
		System.out.println(result6);
		
		result6 = !(num1>10) && (num2<5); // !--> 참은 거짓 거짓은 참 그리고(not) !뒤의 괄호의 값을 부정 = not
		System.out.println(result6);
		
		int age=92;
		char gender='M';
		// 만 20세 이상이면 입장가능 아니면 불가능 출력 'M' 캐릭터문이라 싱글쿼터사용
		if((age>=20)&&(gender == 'M')) {
			System.out.println("입장가능");
		}else {
			System.out.println("입장불가능");
		}
		
		int kor=90, eng=60;
		//국어, 영어 점수가 각각 70점이상이고
		//평균이 70이상이면 합격
		double avg=(double)(kor+eng/2); // int 에서 double로 갈때는 형변환이 필요 없기때문에 생략가능
		if((kor>=70)&&(eng>=70)&&(kor+eng/2>=70)) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		//삼항연산자
		int grade=65;
		if(grade < 70) {
			System.out.println("불합격");
		} else {
			System.out.println("합격");
		}
		
		String result=(grade < 70) ? "불합격":"합격";
		System.out.println(result);
		
		//단항 연산자 
		System.out.println(++grade); //++는 grade값에 +1을 더합
		System.out.println(--grade); // --는 grade값에 -1을 뺌
		
		//대입 연산자
		grade=60;
		System.out.println(grade);
		grade = grade + 3; // grade +=3;
		grade = grade - 3; // grade -=3;
		System.out.println(grade);
		
	}

}



// 연산자
// 1) 산술연산자
// 2) 비교(관계)연산자
// 3) 논리 연산자
// 4) 삼항연산자
// 5) 단항연산자
// 6) 대입연산자