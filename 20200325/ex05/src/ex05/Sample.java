
package ex05;

public class Sample {

	public static void main(String[] args) {
		String[] name= {"홍길동", "심청이", "강감찬"};
		int[] kor = {90, 95, 70};
		int[] eng = {90, 95, 70};
		int[] mat = {90, 95, 77};
		int[] tot = new int[3]; // 정수값 3칸을 만듬
		double[] avg = new double[3]; // 실수값 3칸을 만듬
		int sumKor=0;
		int sumEng=0;
		int sumMat=0;
		int sumTot=0;
		double sumAvg=0;
		
		//데이터 입력
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<3; i++) {
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3.;
			
			String grade=""; //grade값을 선언해줘야함
			if(avg[i]>=90) {
				grade="A";   //grade 선언
			} else if(avg[i]>=80) {
				grade="B";
			} else if(avg[i]>=70) {
				grade="C";
			} else {
				grade="F";
			}
				
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+Math.floor(avg[i])+"\t"+ grade);
			sumKor=sumKor+kor[i];
			sumEng=sumEng+eng[i];
			sumMat=sumMat+mat[i];
			sumTot=sumTot+tot[i];
			sumAvg=sumAvg+avg[i]/3; // 여기서 /3해도됨ㅋㅋ
		}
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("국어평균\t" + sumKor/3+"\t"+"영어평균\t"+sumEng/3+"\t"+ "수학평균\t"+sumMat/3+"\t"+"전체합\t"+sumTot/3 +"\t" +"전체평균"+ sumAvg);
		
	}

}

//이따가 등급도 만들
