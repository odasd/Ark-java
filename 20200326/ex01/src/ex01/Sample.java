package ex01;

public class Sample {

	public static void main(String[] args) {
		//배열에 있는 테이다틀에 대한 평균값과 최대값
		int[] num = {-12, -15, -5, -100, -58, -65, -45, 90};
				  //0번방,1번방,...
		
		int sum=0;
		int max=-1000000000; //최대값 저장변수
		int min=1000000000;  //최소값 저장변수
	
		
		for(int i=0; i<num.length; i++) {
			sum=sum+num[i];
			if(num[i]>max) {
				max=num[i];
				
			}
			if(num[i]<min) {
				min=num[i];
				
			}
			
		}   double avg= (double)sum/num.length;
			System.out.println("전체 합계" + sum);
			System.out.println("평균 : " + avg);
			System.out.println("최대값 : " + max);
			System.out.println("최소값 : " + min);
	}      

}
