package ex02;

public class Sample {

	public static void main(String[] args) {
		//�Ǽ��� ����
		//float num1=10.5f; //�Ǽ��� ����(float)�� ���� �������� f�� �����ؾ���, �� �Ǽ��� �ƴϾ �����
		//float num2=20.3f;
		//float ��� �Ǽ��� double�� �� ���� �����(�� ������ �� ǥ�� ����) floató�� f�� ���� ���ص���
		//double�� float���� �� ���� ��������� �ʿ����
		double num1=10;
		double num2=20.3;
		double num3=num1+num2;
		double num4=num1-num2;
		double num5=num1*num2;
		double num6=num1/num2;
		
		System.out.println("num1+num2=" + num3 );
		System.out.println("num1-num2=" + num4 );
		System.out.println("num1*num2=" + num5 );
		System.out.println("num1/num2=" + num6 );
		
		//�������� 5�� ���� ����
		int r=5; // �������̶� int�� ���
		double area=r*r*3.14; // 3.14�� �Ǽ��̱� ������ double���
		
		System.out.println("��������"+ r +"�� ���� ����=" + area); 
		//����Ʈ ���� ����ִ� +�� �����ؼ� ����϶�� ��
		// r�� �����̱� ������ ""������ ���� ��
		
		
		
	}

}
