package ex01;

public class Car { //붕어빵틀이라고 한다... 틀을 가지고 찍어내는게 모양이 같음
	//필드(속성)
	String company="현대";
	String model;
	String color;
	int maxSpeed;
	
	//기본생성자 -기본생성자만 사용할때는 생략가능 / 일반생성자를 사용하려면 정의를 해야함
	Car() {
		
	}
	//일반생성자 생성자는 객체를 생성한다는 뜻임
	Car(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
		
	}
	
	//출력 메소드
	public void printCar(Car car) {
		System.out.println("------------자동차 정보------------");
		System.out.println("회사 : " + car.company);
		System.out.println("모델 : " + car.model);
		System.out.println("색 : " + car.color);
		System.out.println("최대 속도 : "+ car.maxSpeed);
	}
	
}
