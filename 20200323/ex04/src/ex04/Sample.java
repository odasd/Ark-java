package ex04;

public class Sample {

	public static void main(String[] args) {
		// �ڵ�����ȯ(������->ū��)
		char charValue='a'; //(�������ִ� �ڵ尪�� �˰� ������ �����)
		// ����, ������, �� // �������� ���� �ҹ��ڷ� ���� // ����������(Ŭ���� �̸�) �ι�° �ܾ�´빮�� ���
		// workspace -> project -> class -> main methhod
		// char 1byte
		// int, flat 4byte
		// double 8byte
		// boolean 1byte
		int intValue = charValue;
		System.out.println(intValue);
		
		double doubleValue=charValue;
		System.out.println(doubleValue);
		
		intValue=100; // ������ ��Ʈ������ �����߱⶧���� �̸��� �ٸ��� �ؾ���
		doubleValue=intValue;
		System.out.println(doubleValue);
		
		// ��������ȯ(ū��->������)
		intValue = 65;
		charValue = (char)intValue; //��������ȯ�� ()�ȿ� Ÿ���� ������ (�������ִ� �ڵ尪�� �˰� ������ �����)
		System.out.println(charValue);
		
		doubleValue = 100.5;
		intValue=(int)doubleValue;
		System.out.println(intValue); // ������ Ÿ���� ()�ȿ� �����ָ� ��������ȯ�� �Ǿ� ������ ���� ����
		
		
		int kor=95, eng=100;
		double avg=(double)(kor+eng)/2; 
		// �� ���� ����� 97.5�� ���;� �ϳ� ������ 95�� ���� ���� �������� ������ 97.5�� ���� ������ �ִ�
		System.out.println(avg);
		
		doubleValue=12.4567;
		intValue=(int)doubleValue;
		System.out.println(intValue);
		
		intValue=68;
		charValue=(char)intValue;
		System.out.println(charValue);
		
		
		//for�� 
		for(char i='A'; i<'Z'; i++) {
			intValue = i;
			System.out.println(i+":"+intValue);
		
		}
		for(int i=15; i<65; i++) {
			charValue=(char)i;
			System.out.println(i+":"+charValue);
		}
	}

}

// �ڵ�����ȯ
// char -> int, int->double

// ��������ȯ
// (char)int->char,(int)double->int
