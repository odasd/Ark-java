package ex01;

public class Sample {

	public static void main(String[] args) { //void�� ���� Ÿ�� �����ҰԾ���.
		/*
		Phone p1=new Phone();
		p1.poweron();
		p1.bell();
		p1.reciveVoice("��������?");
		p1.sendVoice("������ �Դϴ�.");
		p1.hangup();
		p1.poweroff();
		p1.run();
		*/
		
		DmbPhone d1= new DmbPhone("�Ｚ ��Ʈ", "���", 11);
		d1.poweron();
		d1.trunOnDmb();
		d1.changeChannel(9);
		d1.turnOffDmb();
	}

}
