package ho01;

public class Sample {

	public static void main(String[] args) {
		int score=80;
		System.out.println("점수는 "+ score + "점입니다.");
		if(score>=90) {
			System.out.println("등급은 A등급 입니다.");
		} else if(score>=80) {
			System.out.println("등급은 B입니다.");
		} else if(score>=70) {
			System.out.println("등급은 C입니다.");
		} else if(score>=60) {
			System.out.println("등급은 F등급 입니다.");
		}

	}

}
