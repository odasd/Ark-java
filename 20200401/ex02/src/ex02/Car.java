package ex02;

public class Car {
	//�ʵ�(�Ӽ�) �����ʵ尪�� �������� ���ϰ� �����̺����� ��
	private String company;
	private int maxSpeed;
	
	
	//set()�޼��� 			//�Ű�����
	public void setCompany(String company) {
		this.company=company;
		
		
	}
	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed<0) {
			this.maxSpeed=0;
		} else {
			this.maxSpeed=maxSpeed;
		}
		
	}
	
	//get()�޼���
	public String getCompany() {
		return company;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	//������(�⺻������) ���� Ʋ�̶���
	Car() {
		
	}
	
	//�޼���(����) ���� ���������� ������
	public void printCar() {
		System.out.println("���� ȸ�� : " + company);
		System.out.println("�ִ� �ӵ� : " + maxSpeed);
	}
}
