package ex01;

public class Car { //�ؾƲ�̶�� �Ѵ�... Ʋ�� ������ ���°� ����� ����
	//�ʵ�(�Ӽ�)
	String company="����";
	String model;
	String color;
	int maxSpeed;
	
	//�⺻������ -�⺻�����ڸ� ����Ҷ��� �������� / �Ϲݻ����ڸ� ����Ϸ��� ���Ǹ� �ؾ���
	Car() {
		
	}
	//�Ϲݻ����� �����ڴ� ��ü�� �����Ѵٴ� ����
	Car(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
		
	}
	
	//��� �޼ҵ�
	public void printCar(Car car) {
		System.out.println("------------�ڵ��� ����------------");
		System.out.println("ȸ�� : " + car.company);
		System.out.println("�� : " + car.model);
		System.out.println("�� : " + car.color);
		System.out.println("�ִ� �ӵ� : "+ car.maxSpeed);
	}
	
}
