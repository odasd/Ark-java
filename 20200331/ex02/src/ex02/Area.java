package ex02;

//����
public class Area {
	//�ﰢ�� ����
	static double triangle(int x, int y) {
		System.out.println("�ﰢ�� ����");
		return (double)x * y / 2;
	}
	
	
	//���簢�� ����
	static int rectangle(int x, int y) {
		System.out.println("���簢�� ����");
		return x * y;
	}
	
	//���簢�� ���� ���� �������� ������ �ٸ��� ��밡��
	static int rectangle(int x) {
		System.out.println("���簢�� ����");
		return x * x;
	}
	
	//���� ����
	static double circle(int r) {
		System.out.println("���� ����");
		final double pi=3.141597; //final�� ������ ���̶� ������ ������ �Ұ�
		return r * r * pi;
	}
}
