package ex01;

public class Sample {
	// 다중 if문
	
	public static void main(String[] args) {
		// 다중 if문
		/*
		int score=80;
		System.out.println("점수는"+ score + "점 입니다.");
		if(score>=90) {
			System.out.println("등급은 A등급입니다.");
		} else if(score>=80) {// \n은 ln과 같이 다음줄에 출력한다는 뜻
			System.out.println("등급은 B입니다.");
		} else if(score>=70) {
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("등급은 F입니다.");
		}
		*/
	
		
		//사원의 실적이 100만원 이상이면 최우수, 50만원 이상이면 우수, 30만원 미만이면 보통 출력
	
		int sale = 25;
		System.out.println("판매 실적은" + sale + "만원 입니다.");
		if (sale>=100) {
			System.out.println("최우수 사원입니다.");
		} else if (sale>=50) {
			System.out.println("우수 사원입니다.");
		} else if (sale>=30) {
			System.out.println("보통 사원입니다.");
		}
		else  {
			System.out.println("해고.");
		}
		
	
		
		
		//중첩 if문
		/*
		int score=50
				;
		String grade=""; //한글자면 char 여러글자면 String
		if(score>=90) {      //90점 인지 아닌지
			if(score>=95) {   
				grade="A+";
			} else {           //95점 이상이면 A+ 95점 미만이면 A0 출력
				grade="A0";
			}
		} else if(score>=80) {
			if(score>=85) {
				grade="B+";
			} else {
				grade="B0";
			}
		} else if(score>=70) {
			if(score>=75) {
				grade="C+";
			} else {
				grade="C0";
			}
		} else {
			grade="F";
		}
		System.out.println("등급은 "+ grade + "이고.\n" + "점수는 " + score + "입니다.");
		*/
	
		
	}// main 
}// sample class


