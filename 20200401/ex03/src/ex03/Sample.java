package ex03;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
		
		//Exception in thread "main" java.lang.NullPointerException -Report[] report=new Report[5];
		//at ex03.Sample.main(Sample.java:25) -- 5개의 배열을 만들었었으나 2개의 값밖에 없어서 오류가 났었다.(생성한 방보다 입력한 데이터의 개수가 적어서 오류가 남)
		
		//배열사용
		/*
		Report[] report=new Report[100]; -- 데이터 낭비가 심함
		
		int count=0; //데이터를 넣어줄때마나 1씩증가
		
		Report r=new Report();
		
		report[0]=new Report();
		report[0].setSno("01");
		report[0].setSname("홍길동");
		report[0].setKor(90);
		report[0].setEng(80);
		report[0].setMat(70);
		
		count=count+1;
		
		report[1]=new Report();
		report[1].setSno("02");
		report[1].setSname("심청이");
		report[1].setKor(80);
		report[1].setEng(70);
		report[1].setMat(45);
		
		count=count+1;
		
		for(int i=0; i<count; i++) {
			report[i].printList();
		}
		*/
		/*
		r.setSno("01");
		r.setSname("홍길동");
		r.setKor(50);
		r.setEng(60);
		r.setMat(80);
		r.printReport();
		r.printList();
		*/
		
		//ArraryList 사용(컬랙션)
		ArrayList <Report> array= new ArrayList <Report>();
		
		Report r = new Report();
		
		r.setSno("01");
		r.setSname("홍길동");
		r.setKor(90);
		r.setEng(70);
		r.setMat(80);
		array.add(r); //array에 r을 추가해줌
		
		r = new Report();
		r.setSno("02");
		r.setSname("심청이");
		r.setKor(75);
		r.setEng(90);
		r.setMat(63);
		array.add(r);
		
		for(int i=0; i<array.size(); i++) {
			r=array.get(i); //array에 있는 정보를 get으로 불러옴
			r.printList();
		}
	}

}
