package ex01;

public class Phone { //틀이라함
	//필드(속성)
	String model;
	String color;
	
	
	//기본생성자라 생략
	
	//메서드
  //리턴타입  메서드이름
	//클래스를 가지고 생성한게 객체
	void poweron() {
		System.out.println("전원을 켭니다.");
	}
	
	void poweroff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울림~");
	}
						//매개변수(파라미터)
	void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	
	void reciveVoice(String recive) {
		System.out.println("너 : " + recive);
	}
	
	void hangup() {
		System.out.println("전화를 끊습니다.");
	}
	
	void run() {
		System.out.println("도망칩니다.");
	}
	
	
}
