package pt01;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String[] account=new String[100];
		String[] name=new String[100];
		int[] money=new int[100];
		int count=0;
		
		
		boolean run=true;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("----------------------------------------------");
			System.out.print("����> ");
			
			int menu=s.nextInt();
			
			switch(menu) {
			
			case 1:
				System.out.print("���¹�ȣ> ");
				account[count]=s.next();
				System.out.print("������> ");
				name[count]=s.next();
				System.out.print("�ʱ��Աݾ�> ");
				money[count]=s.nextInt();
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				count=count+1;
				break;
			case 2:
				System.out.println("----------------------------------------------");
				System.out.println("���¸��");
				System.out.println("----------------------------------------------");
				
				for(int i=0; i<count ; i++) {
					System.out.println(account[i]+"\t"+name[i]+"\t"+money[i]);
				}
				break;
			case 3:
				System.out.println("����");
				System.out.println("----------------------------------------------");
				System.out.println("���¹�ȣ : ");
				String account2=s.next();
				
				for(int i=0; i<count; i++) {
					if(account[i].equals(account2)) {
						System.out.println("���ݾ� : ");
						int money2=s.nextInt();
						money[i]=money[i]+ money2;
					}
				}	System.out.println("��� : ������ �Ϸ�Ǿ����ϴ�.");
				break;
			case 4:
				System.out.println("����");
				System.out.println("----------------------------------------------");
				System.out.println("���¹�ȣ : ");
				String account3=s.next();
				
				for(int i=0; i<count; i++) {
					if(account[i].equals(account3)) {
						System.out.println("��ݾ� : ");
						int money3=s.nextInt();
						money[i]=money[i]- money3;
					} System.out.println("��� : ����� �Ϸ�Ǿ����ϴ�.");
				}
				break;
			case 5:
				System.out.println("����");
				run=false;
				break;
			default :
				System.out.println("�߸��� ����");
					
			}
		}
		
		

	}

}
