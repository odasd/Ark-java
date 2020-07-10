package ex01;

public class DmbPhone extends Phone { //상속
	//필드
	int channel;
	
	//기본생성자 (오버로딩) 생성자 이름은같고 매개변수의 개수가 다르거나 타입이 틀려야함-같은 이름으로 여러개 선언하는 것
	DmbPhone() {
		
	}
	
	
	//일반 생성자
		DmbPhone(String model, String color, int channel) {
			this.model=model;
			this.color=color;
			this.channel=channel;
}

	//메서드
		void trunOnDmb() {
			System.out.println(channel + "번 Dmb를 방송을 수신합니다.");
		}
		void changeChannel(int channel) {
			System.out.println(channel + "번 으로 채널을 변경합니다.");
		}
		
		void turnOffDmb() {
			System.out.println("Dmb 방송 수신을 멈춥니다.");
		}
		
		
		
		
		
	}