package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		boolean run=true;
		
		Grade[] grade= new Grade[100];
		
		int count=0;
		
		while(run) {
		
		System.out.println("----------------------------------------");
		System.out.println("1. �����Է� | 2. ������� | 3. ������ȸ | 4.���� ");
		System.out.println("----------------------------------------");
		System.out.print("�޴�����> ");
		int menu=s.nextInt();
		
		switch(menu) {
		
		case 1:
			grade[count]=new Grade(); //
			
			System.out.print("�й�> ");
			grade[count].sno=s.next();
			
			System.out.print("����> ");
			grade[count].sname=s.next();
			
			System.out.print("��������> ");
			grade[count].kor=s.nextInt();
			
			System.out.print("��������> ");
			grade[count].eng=s.nextInt();
			
			System.out.print("��������> ");
			grade[count].mat=s.nextInt();
			
			System.out.println("�Է¿Ϸ�\n");
			count=count+1;
			
			break;
			
			
		case 2:
			System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
			for(int i=0; i<count; i++) {
				
				grade[i].printGrade(grade[i]);
			}
			System.out.println();
			break;
			
			
		case 3:
			System.out.println("��ȸ�� ��ȣ> ");
			String no=s.next();
			boolean find=false;
			for(int i=0; i<count; i++) {
				if(no.equals(grade[i].sno)) {
					System.out.println("���� : " + grade[i].sname);
					System.out.println("���� : " + grade[i].kor);
					System.out.println("���� : "+ grade[i].eng);
					System.out.println("���� : "+ grade[i].mat);
					System.out.println("��� : "+ grade[i].tot/3.);
					System.out.println();
					find=true;
				}
			}	
			if(find==false) {
				System.out.println("��ȣ�� �������� �ʽ��ϴ�.");
			}
			System.out.println();
			break;
			
			
		case 4:
			run=false;
			System.out.println("���α׷� ����");
			break;
			
			
		default :
				System.out.println("�߸��� �����Դϴ�.");
		}
		
		}
	}

}
