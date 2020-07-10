package ex01;
// 패키지안의 클래스를 사용하려면 import를 하고 전부 사용하려면 *을 기입(예시-금호의 일반타이어와 빅와이드 타이어 같이 사용가능)
import hyndai.Engine;
import hankook.*;// import + 패키지의 클래스 이름
import kumho.*;

//public은 다른 패키지(어디에서나)에서 사용할수 있게 해주고 private은 같은 패키지에서만 사용 가능함
public class Sample {

	public static void main(String[] args) {
		SnowTire st=new SnowTire();
		hankook.Tire t =new hankook.Tire(); //한국 일반타이어 --두가지 클래스중 하나를 골라서 임폴트함(두개를 하고싶으면 패키지명을 적어줘야함)
		kumho.Tire t2=new kumho.Tire();  //금호 일반타이어 -- 이름이 Tire로 같아 패키지명을 줘야 어떤 타이어인지 알수 있음
		Engine e=new Engine(); //현대 엔진
		BigWidthTire bt=new BigWidthTire(); //금호  빅와이드 타이어
	}

}
