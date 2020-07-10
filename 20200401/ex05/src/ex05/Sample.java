package ex05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Scanner;



public class Sample {

	public static void main(String[] args) throws Exception {
		//데이터베이스 접속
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "system";
        String password = "159752s";
        
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, password);
        
        String sql=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        
        Scanner s=new Scanner(System.in);
		
		boolean run=true;
		
		
		
		while(run) {
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("1. 성적입력 | 2. 성적조회 | 3. 성적표 | 4. 데이터 삭제 | 5.수정 | 6. 프로그램 종료");
		System.out.println("-------------------------------------------------------------------");
		System.out.print("메뉴선택> ");
		int menu=s.nextInt();
		
		switch(menu) {
		
		case 1:
			Report r = new Report();
			System.out.print("번호> ");
			r.setSno(s.next());
			System.out.print("이름> ");
			r.setSname(s.next());
			System.out.print("국어> ");
			r.setKor(s.nextInt());
			System.out.print("영어> ");
			r.setEng(s.nextInt());
			System.out.print("수학> ");
			r.setMat(s.nextInt());
			
			sql="insert into tbl_report(sno,sname,kor,eng,mat) values(?, ?, ?, ?, ?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, r.getSno());
			ps.setString(2, r.getSname());
			ps.setInt(3, r.getKor());
			ps.setInt(4, r.getEng());
			ps.setInt(5, r.getMat());
			ps.execute();
			
			System.out.println("입력완료");
			break;
		case 2:
			System.out.print("조회할 번호> ");
			String no=s.next();
			sql="select * from tbl_report where sno=?";
			ps=con.prepareStatement(sql); //prepareStatement는 데이터베이스에 값을 입력한다고 생각하면 됨
			ps.setString(1, no);
			rs=ps.executeQuery(); // ResultSet은 prepareStatement로 데이터베이스에 입력한 값을 출력해서 이클립스로 볼수 있게 해줌
			if(rs.next()) { //rs.next rs에 출력된  값이 있는지 없는지 boolean값으로 가져온다
				//데이터 베이스에서 입력된 물음표인 sno값의 첫번째 줄을 가져오고 값이 있는 sno라면 참이므로 출력  입력한 sno 값이 없는 값이라면 거짓으로 판단해 else로 가서 출력하지 않음(어짜피 없는 데이터)
				r=new Report();
				r.setSno(rs.getString("Sno"));
				r.setSname(rs.getString("Sname"));
				r.setKor(rs.getInt("Kor"));
				r.setEng(rs.getInt("Eng"));
				r.setMat(rs.getInt("Mat"));
				r.printList();
			} else {
				System.out.println("존재하지 않는 변수입니다.");
			}
			
			break;
		case 3:
			sql="select * from tbl_report";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				r = new Report();
				r.setSno(rs.getString("sno"));
				r.setSname(rs.getString("sname"));
				r.setKor(rs.getInt("kor"));
				r.setEng(rs.getInt("eng"));
				r.setMat(rs.getInt("mat"));
				r.printList();
			}
			break;
		case 4:
			System.out.print("삭제할 번호> ");
			no=s.next();
			
			sql="select * from tbl_report where sno=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, no);
			rs=ps.executeQuery();
			if(rs.next()) {
				sql="delete from tbl_report where sno=?";
				ps=con.prepareStatement(sql);
				ps.setString(1, no);
				ps.execute();
				System.out.println("데이터가 삭제되었습니다.");
				} else {
					System.out.println("데이터가 존재하지 않습니다.");
				}
			break;
		case 5:
			System.out.println("수정할 번호>");
			no=s.next();
			sql="select * from tbl_report where sno=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, no);
			rs=ps.executeQuery();
			if(rs.next()) {
				r=new Report();
				r.setSno(rs.getString("sno"));
				r.setSname(rs.getString("sname"));
				r.setKor(rs.getInt("kor"));
				r.setEng(rs.getInt("eng"));
				r.setMat(rs.getInt("mat"));
				
				System.out.println("이름 : " + r.getSname());
				System.out.print("국어( " + r.getKor() + ")>" );
				r.setKor(s.nextInt());
				System.out.print("영어( " + r.getEng() + ")> ");
				r.setEng(s.nextInt());
				System.out.print("수학( " + r.getMat() + ")> ");
				r.setMat(s.nextInt());
				
				sql="update tbl_report set kor=?,eng=?,mat=? where sno=?";
				ps=con.prepareStatement(sql);
				ps.setInt(1, r.getKor());
				ps.setInt(2, r.getEng());
				ps.setInt(3, r.getMat());
				ps.setString(4, r.getSno());
				ps.execute();
				System.out.println("수정완료");
			} else {
				System.out.println("존재하지 않는 번호입니다.");
			}
			
			break;
		case 6:
			run=false;
			System.out.println("프로그램 종료");
			break;
		default :
				System.out.println("잘못된 선택입니다.");
		}
		
		
		
		
		}

	}

}
