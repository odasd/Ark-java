package ex05;

import java.text.DecimalFormat;

//학생 성적관리용 클래스
public class Report { //private값이므로 다른 클래스에서 수정할수 없기 때문에 이값은 샘플 클래스에서 setSno등 키보드 입력으로 수정해준 데이터는 리포트 클래스의 메서드로  값이 입력되므로
					  //리포트 메서드의 매개변수인 String sno가 변경되며 메서드의 sno는 this.sno와 같다는 값을 주어 this.sno가 결과적으로 샘플클래스에서 set으로 입력한 값으로 변경됨
																				
	//필드 - private을 준 이유는 마음대로 수정할수 없게 하기위해 private을 줌
	private String sno;
	private String sname;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private char grade;//학점 90점이상 A 80점이상 B 70점이상 C 70점 미만이면 F
	
	//생성자 - 기본 생성자라 생략함
	
	
	//메서드
	public String getSno() { //get은 불러올때 사용
		return sno;
	}
	public void setSno(String sno) { // set은 입력할때 사용, String sno는 메서드의 sno를 의미함 색도 같음
		this.sno = sno;					// this.sno에서 this는 클래스의 sno라는 뜻임(위에 private값을 준 sno를 의미함)
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		tot=kor + eng + mat;
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		avg=(getTot())/3.;
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		if(getAvg()>=90) {
			grade='A';
		} else if(getAvg()>=80) {
			grade='B';
		} else if(getAvg()>=70) {
			grade='C';
		} else {
			grade='F';
		}
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void printReport() { //세로로 출력
		System.out.println("번호 : " + sno);
		System.out.println("이름 : " + sname);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + getTot());
		System.out.println("평균 : " + getAvg());
		System.out.println("학점 : " + getGrade());
	}
	public void printList() { //가로로 출력
		System.out.print(sno + "\t");
		System.out.print(sname + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(getTot() + "\t");
		//System.out.print(getAvg() + "\t");
		//System.out.println(getGrade());
		DecimalFormat df=new DecimalFormat("###.00");
		System.out.println(df.format(getAvg()) + "\t");
		System.out.println(getGrade());
	}
	
}
