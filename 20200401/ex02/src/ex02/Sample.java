package ex02;

public class Sample {

	public static void main(String[] args) {
		Car c1=new Car();
		//c1.company="현대";
		//c1.maxSpeed=200;
		
		c1.setCompany("삼성");
		System.out.println("제조사 : " + c1.getCompany());
		
		c1.setMaxSpeed(-120);
		System.out.println("최고 속력 : " + c1.getMaxSpeed());
		//c1.printCar();
		
	}

}
