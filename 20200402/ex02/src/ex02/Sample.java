package ex02;

public class Sample {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.r=5;
		double area=c1.areaCircle();
		System.out.println("¿øÀÇ ³ĞÀÌ  : " + area);
		//c1.areaCircle(9);
		
		Computer cu=new Computer();
		cu.r=6;
		System.out.println("¿øÀÇ ³ĞÀÌ : " + cu.areaCircle());
		
	}

}
