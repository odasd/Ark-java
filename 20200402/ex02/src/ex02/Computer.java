package ex02;

public class Computer extends Calculator {

	@Override //calculator에 있는 areaCircle 메서드를 재 정의 하는것 - 여기선 159까지 입력해 더 정확한 값을 출력하기 위함임
	double areaCircle() {
		return r*r*3.14159;
	}
	
	

}
