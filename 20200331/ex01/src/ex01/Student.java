package ex01;

public class Student {
	//필드 //Student라는 클래스가 가지는 속성 /객체를 생성함  
	String sno;
	String sname;
	String tel;
	
	
	
	//기본생성자 - 생략가능
	Student() {	
		
	}
	//일반생성자 : 오버로딩 / 매개변수 개수가 틀려야  사용가능
	Student(String sno, String sname, String tel) {
		this.sno=sno;
		this.sname=sname;
		this.tel=tel;
	}
	
	// 메소드 (parameter)매개변수	
	public void print(Student s) {
		System.out.println("--------------------------------------------");
		System.out.println("번호 : "+ s.sno);
		System.out.println("이름 : "+ s.sname);
		System.out.println("전화번호 : "+ s.tel);
		
	}
}
