package ex01;

public class Sample {

	public static void main(String[] args) { //void는 리턴 타입 리턴할게없다.
		/*
		Phone p1=new Phone();
		p1.poweron();
		p1.bell();
		p1.reciveVoice("여보세요?");
		p1.sendVoice("경찰서 입니다.");
		p1.hangup();
		p1.poweroff();
		p1.run();
		*/
		
		DmbPhone d1= new DmbPhone("삼성 노트", "흰색", 11);
		d1.poweron();
		d1.trunOnDmb();
		d1.changeChannel(9);
		d1.turnOffDmb();
	}

}
