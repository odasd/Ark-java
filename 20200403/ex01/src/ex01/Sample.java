package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception  {
		
		Scanner s=new Scanner(System.in);
		
		StudentDAO dao=new StudentDAO();
		
		
		
		boolean run=true;
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println(" 1. 입력 | 2. 조회 | 3. 목록 | 4. 수정 | 5. 삭제 | 6.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("메뉴선택> ");
			int menu=s.nextInt();
		switch(menu) {
		
			case 1:
				System.out.println("------");
				System.out.println("학생입력");
				System.out.println("------");
				
				StudentVO vo=new StudentVO();
				
				System.out.println("학번(두자리입력)> ");
				String sno=s.next();
				
				vo=dao.read(sno);
				
				if(vo.getSno()==null) {
				vo.setSno(sno);
				System.out.println("성명> ");
				vo.setSname(s.next());
				System.out.println("전화번호> ");
				vo.setTel(s.next());
				dao.insert(vo);
		
				} else {
					System.out.println("이미 학생이 존재합니다.");
				}
					System.out.println();

				break;
			case 2: //조희
				System.out.println("------");
				System.out.println("학생입력");
				System.out.println("------");
				System.out.print("조회할 학번> ");
				sno=s.next();
				
				vo=dao.read(sno);
				
				if(vo.getSname()==null) {
					System.out.println("학생이 존재하지 않습니다.");
				} else {
				System.out.println("성명 : " + vo.getSname());
				System.out.println("전화번호 : " + vo.getTel());
				System.out.println("");
				}
				break;
			case 3: //목록
				System.out.println("학생목록");
				System.out.println("-------------------------");
				System.out.println("학번\t성명\t전화번호");
				System.out.println("-------------------------");
				ArrayList<StudentVO> array=dao.list();
				
				for(int i=0; i<array.size(); i++) {
					vo=array.get(i);
					System.out.print(vo.getSno() + "\t");
					System.out.print(vo.getSname() + "\t");
					System.out.println(vo.getTel() + "\t");
				}
				break;
			case 4: //수정
				System.out.print("수정할 번호> ");
				sno=s.next();
				vo=dao.read(sno);
				
				if(vo.getSno()==null) {
					System.out.println("학생이 존재하지 않습니다.");
				} else {
					System.out.print("이름 (" + vo.getSname() + ")> ");
					vo.setSname(s.next());
					System.out.print("번호 (" + vo.getTel() + ")> ");
					vo.setTel(s.next());
					dao.update(vo);
					System.out.println("수정완료.");
				}
				break;
			case 5: //삭제
				System.out.print("삭제할 번호> ");
				sno=s.next();
				vo=dao.read(sno);
				if(vo.getSno()==null) {
					System.out.println("제거할 학생이 없습니다.");
				} else {
					dao.delete(sno);
					System.out.println("학생이 제거되었습니다.\n");
				}
				break;
			case 6:
				run=false;
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("잘못된 입력입니다.");
		
		}
		
		}

	}

}
