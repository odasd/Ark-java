package ex01;

public class Phone { //Ʋ�̶���
	//�ʵ�(�Ӽ�)
	String model;
	String color;
	
	
	//�⺻�����ڶ� ����
	
	//�޼���
  //����Ÿ��  �޼����̸�
	//Ŭ������ ������ �����Ѱ� ��ü
	void poweron() {
		System.out.println("������ �մϴ�.");
	}
	
	void poweroff() {
		System.out.println("������ ���ϴ�.");
	}
	
	void bell() {
		System.out.println("���� �︲~");
	}
						//�Ű�����(�Ķ����)
	void sendVoice(String message) {
		System.out.println("�� : " + message);
	}
	
	void reciveVoice(String recive) {
		System.out.println("�� : " + recive);
	}
	
	void hangup() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
	void run() {
		System.out.println("����Ĩ�ϴ�.");
	}
	
	
}
