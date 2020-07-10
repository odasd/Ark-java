package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception {
		
		Scanner s=new Scanner(System.in);
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "system";
		String password = "159752s";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
	
		
		boolean run=true;
		
		while(run) {
			
		System.out.println("-------------------------------------------");
		System.out.println("1. 입력 | 2. 출력 | 3. 삭제 | 4. 수정 | 5. 종료 ");
		System.out.println("-------------------------------------------");
		System.out.print("작업선택> ");
		int menu=s.nextInt();
		
		switch(menu) {
		
			case 1: //입력
				
				String sql="insert into tbl_grade(sno,sname,kor,eng,mat,tot) values(?,?,?,?,?,?)";
				
				System.out.print("번호> ");
				String no=s.next();
				System.out.print("이름> ");
				String name=s.next();
				System.out.print("국어> ");
				int kor=s.nextInt();
				System.out.print("영어> ");
				int eng=s.nextInt();
				System.out.print("수학> ");
				int mat=s.nextInt();
				System.out.print("평균> ");
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, no);
				ps.setString(2, name);
				ps.setInt(3, kor);
				ps.setInt(4, eng);
				ps.setInt(5, mat);
				ps.setInt(6, kor+eng+mat);
				ps.execute();
				System.out.println("데이터입력완료");
				System.out.println("");
				
				break;
			case 2: //출력
				sql="select * from tbl_grade";
				ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
		
				while(rs.next()) {
					String sno=rs.getString("sno");
					String sname=rs.getString("sname");
					kor=rs.getInt("kor");
					eng=rs.getInt("eng");
					mat=rs.getInt("mat");
					int sum=kor+eng+mat;
					double avg=(double)sum/3;	
					System.out.print(sno+"\t");
					System.out.print(sname+"\t");
					System.out.print(kor+"\t");
					System.out.print(eng+"\t");
					System.out.print(mat+"\t");	
					System.out.print("총점 = " + sum+"\t");
					System.out.println("평균 = " + avg);
					
				}	
				break;
			case 3: // 삭제
				System.out.println("번호> ");
				no=s.next();
				
				sql="delete from tbl_grade where sno=?";
				ps=con.prepareStatement(sql);
				
				ps.setString(1, no);
				ps.execute();
				System.out.println("데이터 삭제완료.");
				break;
			case 4: // 데이터 수정
				System.out.println("수정번호> ");
				no=s.next();
				sql="select * from tbl_grade where sno=?";
				ps=con.prepareStatement(sql);
				ps.setString(1, no);
				rs=ps.executeQuery(); //select * from 쓸때만(결과를 받아올때만) executeQuery씀 나머지는 execute씀
				
				if(rs.next()) { 
					name=rs.getString("sname");
					kor=rs.getInt("kor");
					eng=rs.getInt("eng");
					mat=rs.getInt("mat");
					System.out.println("성명 : " + name);
					System.out.print("국어 :(" + kor + ")>");
					kor=s.nextInt();
					System.out.print("영어 :(" + eng+ ")>");
					eng=s.nextInt();
					System.out.print("수학 :(" + mat+ ")>");
					mat=s.nextInt();
					
					sql="update tbl_grade set kor=?, eng=?, mat=? where sno=?";
					ps=con.prepareStatement(sql);
					ps.setInt(1, kor);
					ps.setInt(2, eng);
					ps.setInt(3, mat);
					ps.setString(4, no);
					ps.executeQuery();
					System.out.println("데이터 수정완료");
					System.out.println("");
					
				} else {
					System.out.print("데이터가 없습니다.");
				}
				
				
				
				break;
			case 5:
				run=false;
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("다시 고르세욧!");
				
		}
		
		
		
		
		}
	}
}
