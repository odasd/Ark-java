package ex01;

import java.util.Scanner;

public class Sample {
	public static void method1() {
		//�̸�, ����, ����, ���� Ű���忡�� �Է�
				//����, ��� ��� -> ��������� ����
				
				Scanner s = new Scanner(System.in);
				System.out.print("�̸� ");
				String name=s.next(); //Ű���忡�� �Է¹޾Ƽ� name�� �־��ְڴ�
				
				System.out.println("���� ");
				int kor=s.nextInt();
				
				System.out.println("���� ");
				int eng=s.nextInt();
				
				System.out.println("����");
				int mat=s.nextInt();
				
				int tot=kor+eng+mat;
				System.out.println("����\n" + tot);
				
				
				double avg=(double)tot/3;
				System.out.println("���\n" + avg);
	}

	public static void main(String[] args) {
		method1();
		method2();
		method3();
		
		System.out.println("[1] ���� �Է� ���α׷�");
		System.out.println("[2] ���� ���� ���ϱ�");
		System.out.println("[3] �ﰢ���� ���� ���ϱ�");
		System.out.println("[4] ���α׷� ����");
		
		Scanner s=new Scanner(System.in);
		System.out.println("�޴�����[1~4]?");
		int menu=s.nextInt();
		
		switch(menu) {
		
		case 1 :
			method1();
			break;
		case 2:
			method2();
			break;
		case 3:
			method3();
			break;
		case 4:
			System.out.println("���α׷� ����");
			break;
		default :
			System.out.println("����� Ʋ�Ƚ��ϴ٤�_��");
		}
	}
	public static void method2() {
		//���� �������� �Է� �޾� ���� ���̸� ���Ҽ� �ִ�.
		//�������� 0�̸� ���α׷� ����
		boolean run=true; //run�� true�� ���ȿ� �����Ѵ�
		
		while(run) {
			
		Scanner s=new Scanner(System.in);
		System.out.println("���� ������ = ");
		int r = s.nextInt();
		double area = r * r * 3.14;
		System.out.println("���� ����" + area);
		run=false;
		
		/*if(r==0) {
			System.out.println("���α׷� ����");
			run=false;
	    	}*/
		}
	}
	
	public static void method3() {
		//�ﰢ���� ���̿� �غ��� Ű���忡�� �Է¹޴´�.
		//�ﰢ���� ���̸� ���Ͽ� ����Ѵ�.
		Scanner s=new Scanner(System.in);
		boolean run=true;
		
		while(run) {
		
		System.out.println("�ﰢ���� ���̸� ���ϽǷ���(y/n)?");
		String q=s.next();
		if(q.equals("y") || q.equals("Y") ) { //String �̱⶧���� ==���� equals�� �����
		
		System.out.println("����");
		int h=s.nextInt();
		System.out.println("�غ�");
		int w=s.nextInt();
		double area=(double)h*w*1/2;  //h*w*1/2.; .�� ����൵ �Ǽ��� ǥ��
		System.out.println("�ﰢ���� ���� " + area);
			run=false;
		} else if(q.equals("n") || q.equals("N")) {
			System.out.println("���α׷� ����");
			run=false;
		} else {
			System.out.println("�ٽ� ������!");
		}
		}	
	}

}
