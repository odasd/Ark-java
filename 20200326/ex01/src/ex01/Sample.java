package ex01;

public class Sample {

	public static void main(String[] args) {
		//�迭�� �ִ� ���̴�Ʋ�� ���� ��հ��� �ִ밪
		int[] num = {-12, -15, -5, -100, -58, -65, -45, 90};
				  //0����,1����,...
		
		int sum=0;
		int max=-1000000000; //�ִ밪 ���庯��
		int min=1000000000;  //�ּҰ� ���庯��
	
		
		for(int i=0; i<num.length; i++) {
			sum=sum+num[i];
			if(num[i]>max) {
				max=num[i];
				
			}
			if(num[i]<min) {
				min=num[i];
				
			}
			
		}   double avg= (double)sum/num.length;
			System.out.println("��ü �հ�" + sum);
			System.out.println("��� : " + avg);
			System.out.println("�ִ밪 : " + max);
			System.out.println("�ּҰ� : " + min);
	}      

}
