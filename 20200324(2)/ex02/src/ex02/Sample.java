package ex02;

public class Sample {

	public static void main(String[] args) {
		String name="홍길동";
		int kor=83, eng=56, mat=78;
		int tot=kor + eng + mat;
		double avg= tot/3;
		String grade="";
		
		if(avg>=90) {
			
			if(avg>=95) {
			  grade="A+";
		  } else {
			  grade="A0";
			}
			
		}   else if(avg>=80) {
			
			if(avg>=85) {
				
				grade="B+";
			}else {
				grade="B0";
			}
			
		}   else if(avg>=70) {
			
			if(avg>=75) {
				grade="C+";
			}else {
				grade="C0";
			}
			
		}    else {
			    grade="F";
		}
		//성적표 출력
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng );
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println("국어 점수는 " + kor + "점 " + "영어점수는 " + eng + "점 " +"수학점수는 " + mat + "점 " + "이다.");
		System.out.println("등급은 " + grade + "이다.");
		
	}

}
