package ex04;

public class Sample {

	public static void main(String[] args)  {
		//switch��
		int num=1;
		
		switch(num) {
		case 1 :
			System.out.println("1���� ���Խ��ϴ�.");
			System.out.println("--------------");
			break; // ���� case�� �������� ���� switch���� ���������� ���ؼ��̴�
		case 2 :
			System.out.println("2���� ���Խ��ϴ�.");
			break;
		case 3 :
			System.out.println("3���� ���Խ��ϴ�.");
			break;
		case 4 :
			System.out.println("4���� ���Խ��ϴ�.");
			break;
		case 5 : 
			System.out.println("5���� ���Խ��ϴ�.");
			break;
		case 6 : 
			System.out.println("6���� ���Խ��ϴ�.");
			break; //������ ������ break���� ����
		default : //�ش�Ǵ� case�� ���� ���ڸ� ���������� ���ϴ� ���� ���
			System.out.println("��ȣ�� Ʋ�Ƚ��ϴ�.");
		}

	}

}
