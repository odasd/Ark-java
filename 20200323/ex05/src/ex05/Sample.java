package ex05;

public class Sample {

	public static void main(String[] args) {
		//���������
		int num1=10;
		int num2=3
				; //=�� ������ ���� ���ʰ��� �����ϴ� ��
		int result1= num1+num2;
		int result2= num1-num2;
		int result3= num1*num2;
		int result4= num1/num2;
		int result5= num1%num2;
		//+, -, *, /, %(������)������ ���
		System.out.println(num1 + "+" +num2 + "=" + result1);
		System.out.println(num1 + "-" +num2 + "=" + result2);
		System.out.println(num1 + "*" +num2 + "=" + result3);
		System.out.println(num1 + "/" +num2 + "=" + result4);
		System.out.println(num1 + "%" +num2 + "=" + result5);
		
		//����(��)������
		boolean result6 = (num1==num2); //num1��num2��
		System.out.println(num1 + "==" + num2 + ":" + result6);
		result6= (num1 > num2);//ũ��
		System.out.println(num1 + ">" +num2 +":" +result6);
		result6= (num1<num2);//�۳�
		System.out.println(num1 + "<" +num2 +":" +result6);
		result6=(num1>=num2);//ũ�ų� ����
		System.out.println(num1 + ">=" +num2 +":" +result6);
		result6=(num1<=num2);//�۰ų� ����
		System.out.println(num1 + "<=" +num2 +":" +result6);
		result6=(num1 != num2); //!= �� ���� �����ʴ�
		System.out.println(num1 + "!=" +num2 +":" +result6);
		
		//�������� (and, or, not)
		result6 = (num1>10) || (num2<5); // ||�Ǵ�(or) ���߿� �ϳ��� ���̾ ������ ǥ��
		System.out.println("----------");
		System.out.println(result6);
		
		result6 = (num1>10) && (num2<5); // &&�׸���(and)
		System.out.println(result6);
		
		result6 = !(num1>10) && (num2<5); // !--> ���� ���� ������ �� �׸���(not) !���� ��ȣ�� ���� ���� = not
		System.out.println(result6);
		
		int age=92;
		char gender='M';
		// �� 20�� �̻��̸� ���尡�� �ƴϸ� �Ұ��� ��� 'M' ĳ���͹��̶� �̱����ͻ��
		if((age>=20)&&(gender == 'M')) {
			System.out.println("���尡��");
		}else {
			System.out.println("����Ұ���");
		}
		
		int kor=90, eng=60;
		//����, ���� ������ ���� 70���̻��̰�
		//����� 70�̻��̸� �հ�
		double avg=(double)(kor+eng/2); // int ���� double�� ������ ����ȯ�� �ʿ� ���⶧���� ��������
		if((kor>=70)&&(eng>=70)&&(kor+eng/2>=70)) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		
		//���׿�����
		int grade=65;
		if(grade < 70) {
			System.out.println("���հ�");
		} else {
			System.out.println("�հ�");
		}
		
		String result=(grade < 70) ? "���հ�":"�հ�";
		System.out.println(result);
		
		//���� ������ 
		System.out.println(++grade); //++�� grade���� +1�� ����
		System.out.println(--grade); // --�� grade���� -1�� ��
		
		//���� ������
		grade=60;
		System.out.println(grade);
		grade = grade + 3; // grade +=3;
		grade = grade - 3; // grade -=3;
		System.out.println(grade);
		
	}

}



// ������
// 1) ���������
// 2) ��(����)������
// 3) �� ������
// 4) ���׿�����
// 5) ���׿�����
// 6) ���Կ�����