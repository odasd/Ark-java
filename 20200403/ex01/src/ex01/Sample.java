package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception  {
		
		Scanner s=new Scanner(System.in);
		
		StudentDAO dao=new StudentDAO();
		
		
		
		boolean run=true;
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println(" 1. �Է� | 2. ��ȸ | 3. ��� | 4. ���� | 5. ���� | 6.����");
			System.out.println("-------------------------------------------------");
			System.out.print("�޴�����> ");
			int menu=s.nextInt();
		switch(menu) {
		
			case 1:
				System.out.println("------");
				System.out.println("�л��Է�");
				System.out.println("------");
				
				StudentVO vo=new StudentVO();
				
				System.out.println("�й�(���ڸ��Է�)> ");
				String sno=s.next();
				
				vo=dao.read(sno);
				
				if(vo.getSno()==null) {
				vo.setSno(sno);
				System.out.println("����> ");
				vo.setSname(s.next());
				System.out.println("��ȭ��ȣ> ");
				vo.setTel(s.next());
				dao.insert(vo);
		
				} else {
					System.out.println("�̹� �л��� �����մϴ�.");
				}
					System.out.println();

				break;
			case 2: //����
				System.out.println("------");
				System.out.println("�л��Է�");
				System.out.println("------");
				System.out.print("��ȸ�� �й�> ");
				sno=s.next();
				
				vo=dao.read(sno);
				
				if(vo.getSname()==null) {
					System.out.println("�л��� �������� �ʽ��ϴ�.");
				} else {
				System.out.println("���� : " + vo.getSname());
				System.out.println("��ȭ��ȣ : " + vo.getTel());
				System.out.println("");
				}
				break;
			case 3: //���
				System.out.println("�л����");
				System.out.println("-------------------------");
				System.out.println("�й�\t����\t��ȭ��ȣ");
				System.out.println("-------------------------");
				ArrayList<StudentVO> array=dao.list();
				
				for(int i=0; i<array.size(); i++) {
					vo=array.get(i);
					System.out.print(vo.getSno() + "\t");
					System.out.print(vo.getSname() + "\t");
					System.out.println(vo.getTel() + "\t");
				}
				break;
			case 4: //����
				System.out.print("������ ��ȣ> ");
				sno=s.next();
				vo=dao.read(sno);
				
				if(vo.getSno()==null) {
					System.out.println("�л��� �������� �ʽ��ϴ�.");
				} else {
					System.out.print("�̸� (" + vo.getSname() + ")> ");
					vo.setSname(s.next());
					System.out.print("��ȣ (" + vo.getTel() + ")> ");
					vo.setTel(s.next());
					dao.update(vo);
					System.out.println("�����Ϸ�.");
				}
				break;
			case 5: //����
				System.out.print("������ ��ȣ> ");
				sno=s.next();
				vo=dao.read(sno);
				if(vo.getSno()==null) {
					System.out.println("������ �л��� �����ϴ�.");
				} else {
					dao.delete(sno);
					System.out.println("�л��� ���ŵǾ����ϴ�.\n");
				}
				break;
			case 6:
				run=false;
				System.out.println("���α׷� ����");
				break;
			default :
				System.out.println("�߸��� �Է��Դϴ�.");
		
		}
		
		}

	}

}
