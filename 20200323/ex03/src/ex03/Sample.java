package ex03;

public class Sample {

	public static void main(String[] args) {
		//������ ���� 
		char a='A'; //char������ ���� �ϳ��� ���� ������(�̱����� ���)
		String name="ȫ�浿"; //string�� ���� ���� ���忡 ��� (���� �ٶ� �������� ���)
		System.out.println("��"+a);
		System.out.println("�̸�"+name);
		
		int kor=85, eng=76, mat=77;
		double tot=kor+eng+mat;
		double avg=tot/3;		
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
		System.out.println("����:"+mat);
		System.out.println("����:"+tot);
		System.out.println("���:"+avg);
		
		//���� ���� - �� Ȥ�� ���� ���� �����ϸ� ���ٿ��� ���(true���� false���� ������ ����)
		boolean stop=true;
		stop=false;
		System.out.println("stop:"+stop);
		
	}

}
// workspace -> project -> class -> main methhod
// char 1byte
// int, flat 4byte
// double 8byte
// boolean 1byte