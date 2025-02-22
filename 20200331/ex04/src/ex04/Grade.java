package ex04;
//성적 관리용 class
public class Grade {
	//필드
	String sno;
	String sname;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	char grade;
	
	//기본생성자
	public Grade() {
		
	}
	//생성자
	public Grade(String sno, String sname, int kor, int eng, int mat) {
		super(); //수퍼는 기본생성자
		this.sno = sno;
		this.sname = sname;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		
	}
	
	//메서드(처리, 작업, 동작)
	int total(int kor, int eng, int mat) {
		return kor+eng+mat;
	}
	
	//출력 메서드
	void printGrade(Grade g) { //grade 객체 타입 g는 객체
		
		g.tot=g.kor + g.eng + g.mat;
		g.avg=g.tot/3.;
		g.grade=grade(g.avg);
		System.out.println(g.sno + "\t"+ g.sname + "\t" +g.kor + "\t" + g.eng + "\t"+ g.mat + "\t" + g.tot + "\t" + g.avg + "\t"+ g.grade);
		System.out.println();
		
		
	}
	
	//학점메서드
	char grade(double avg) {

		if(avg>=90) {
			return 'A';
		} else if(avg>=80) {
			return 'B';
		} else if(avg>=70) {
			return 'C';
		} else {
			return 'F';
		}
		
	}
}
