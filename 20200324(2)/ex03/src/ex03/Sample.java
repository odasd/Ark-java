package ex03;

public class Sample {
    
	public static void main(String[] args) {
		String name="냉장고";
		int price=100;
		int number=6;
		int total=price*number;
		String remark="";
		/*
		if(total>=1000) {
			System.out.println("최우수 사원입니다.");
		} else if(total>=500 ) {
			System.out.println("우수 사원입니다.");
		} else { //if문 마지막 else에는 조건 기입 불필요
			System.out.println("보통 사원입니다.");
		}
		
		*/
		
		//중첩 if문
	
		if(total>=900) {
			if(total>=1000) {
			  remark="최우수사원";
		  } else {
			  remark="우수사원";
			}
		}   else if(total<=400) {
			if(total<=500) {
				remark="보통사원";
			}else {
				remark="말단사원";
			}  
		}    else {
			    remark="해고";
			
		}
	
		
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("개수 : " + number);
		System.out.println("전체판매액 : " + total);
		System.out.println("사원등급 : " + remark);
	    
	    
	
	}

}
