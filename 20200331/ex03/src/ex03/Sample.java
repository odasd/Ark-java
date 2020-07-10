package ex03;

public class Sample {

	public static void main(String[] args) {
		/*Grade g1=new Grade("01", "È«±æµ¿", 90 , 60, 84);
		g1.tot=g1.total(g1.kor, g1.eng, g1.mat);
		g1.printGrade(g1);
		System.out.println();
		
		Grade g2=new Grade("02", "¸ÛÃ»ÀÌ", 50 , 64, 75);
		//g2.tot=g2.total(g2.kor, g2.eng, g2.mat); //¾ø¾îµµ µÊ¤»¤»
		g2.printGrade(g2);
		*/
		
		//¹è¿­
		Grade[] grade=new Grade[2];
		grade[0]=new Grade("01", "È«±æµ¿", 95,35,15);
		grade[1]=new Grade("02", "½ÉÃ»ÀÌ", 65,40,28);
		
		for(int i=0; i<grade.length; i++) {
			grade[i].printGrade(grade[i]);
		}
	}

}
