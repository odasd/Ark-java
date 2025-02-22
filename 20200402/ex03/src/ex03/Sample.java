package ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception {
		
		Scanner s=new Scanner(System.in);
		
		boolean run=true;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "system";
        String password = "159752s";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, password);
        
        String sql=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        ResultSet rs2=null;
		
		while(run) {
		System.out.println("------------------------------------------");
		System.out.println(" 1. 성적입력 | 2. 성적조회 | 3. 성적수정 | 4. 종료 ");
		System.out.println("------------------------------------------");
		System.out.print("메뉴선택> ");
		
		int menu=s.nextInt();
		
		switch(menu) {
		
			case 1:
				ReportVO vo=new ReportVO();
				boolean find = false;
				while(find==false) {
				System.out.print("번호 : ");
				vo.setSno(s.next());
				sql="select*from tbl_student where sno=?";
				ps=con.prepareStatement(sql);
				ps.setString(1, vo.getSno());
				rs=ps.executeQuery();
				
				if(rs.next()) {
					System.out.println("이름 : " + rs.getString("sname"));
					System.out.print("몇 월 : ");
					vo.setMonth1(s.next());
					System.out.print("국어 : ");
					vo.setKor(s.nextInt());
					System.out.print("영어 : ");
					vo.setEng(s.nextInt());
					System.out.print("수학 : ");
					vo.setMat(s.nextInt());
					
					sql="insert into tbl_report(sno, month1, kor, eng, mat) values (?, ?, ?, ?, ?)";
					ps=con.prepareStatement(sql);
					ps.setString(1, vo.getSno());
					ps.setString(2, vo.getMonth1());
					ps.setInt(3, vo.getKor());
					ps.setInt(4, vo.getEng());
					ps.setInt(5, vo.getMat());
					ps.execute();
					System.out.println("저장완료.\n");
					find=true;
				} else {
					System.out.println("학생이 존재하지 않습니다.");
					
				}
				}
				break;
				
			case 2: //조희
				find=false;
				while(find==false) { //못찾으면 계속 입력(찾을때까지 입력)
				System.out.println("번호 : ");
				String sno=s.next();
				sql="select*from tbl_student where sno=?";
				ps=con.prepareStatement(sql);
				ps.setString(1, sno);
				rs=ps.executeQuery();
		
				if(rs.next()) {
					System.out.println("성명 : " +rs.getString("sname"));
					sql="select*from tbl_report where sno=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, sno);
					rs=ps.executeQuery();
					System.out.println("---------------------------------------");
					System.out.println("월\t국어\t영어\t수학\t평균");
					System.out.println("---------------------------------------");
					while(rs.next()) {
						System.out.print(rs.getString("month1") + "\t");
						System.out.print(rs.getInt("kor") + "\t");
						System.out.print(rs.getInt("eng") + "\t");
						System.out.print(rs.getInt("mat") + "\t");
						double avg=(rs.getInt("kor") + rs.getInt("eng") + rs.getInt("mat")/3.);
						System.out.println(avg);
						find=true;
					} 
					}else {
						System.out.println("학생이 존재하지 않습니다.");
			}
			}
				
				break;
			case 3:
				vo=new ReportVO();
				find = false;
				
				while(find==false) {
					
					System.out.print("번호 : ");
					vo.setSno(s.next());
					sql="select*from tbl_student where sno=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, vo.getSno());
					rs=ps.executeQuery();
					
					if(rs.next()) {
						System.out.println("이름 : " + rs.getString("sname"));
						System.out.print("몇 월 : ");
						vo.setMonth1(s.next());
						sql="select * from tbl_report t2, tbl_student t1 where t1.sno=t2.sno and t2.month1=?";
								//"select*from tbl_report where month1=?";
						ps=con.prepareStatement(sql);
						ps.setString(1, vo.getMonth1());
						rs2=ps.executeQuery();
						
						if(rs.next()) {
							
							
							System.out.print("국어 : " + rs.getInt("kor") + " > ");
							vo.setKor(s.nextInt());
							System.out.print("영어 : " + rs.getInt("eng") + " > ");
							vo.setEng(s.nextInt());
							System.out.print("수학 : " + rs.getInt("mat") + " > ");
							vo.setMat(s.nextInt());
							
							
							
							sql="update tbl_report set kor=?,eng=?,mat=?";
							ps=con.prepareStatement(sql);
							ps.setInt(1, vo.getKor());
							ps.setInt(2, vo.getEng());
							ps.setInt(3, vo.getMat());
							ps.execute();
							System.out.println("저장완료.\n");
							find=true;
						}
						
						} else {
							System.out.println("학생이 존재하지 않습니다.");
						}
				}
				break;
				
				
				
			case 4:
				run=false;
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("잘못된 입력입니다.");
					
				
		
		
		}
		
		}	
	}

}
