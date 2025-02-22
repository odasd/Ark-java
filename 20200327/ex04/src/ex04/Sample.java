package ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception {
		
		boolean run=true;
	      Scanner s=new Scanner(System.in);
	      //oracle Database접속
	      String driver = "oracle.jdbc.driver.OracleDriver";
	      String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	      String user = "system";
	      String password = "159752s";

	      Class.forName(driver);
	      Connection con=DriverManager.getConnection(url, user, password);
	      
	      while(run) {
	         System.out.println("1.성적입력|2.성적출력|3.종료");
	         System.out.println("----------------------------");
	         System.out.print("메뉴선택>");
	         int menu=s.nextInt();
	         
	         switch(menu) {
	         case 1: //성적입력
	            String sql="insert into tbl_grade(sno,sname,kor,eng,mat) values(?,?,?,?,?)";
	            PreparedStatement ps=con.prepareStatement(sql);
	            
	            System.out.print("번호>");
	            String sno=s.next();
	            System.out.print("성명>");
	            String sname=s.next();
	            System.out.print("국어>");
	            int kor=s.nextInt();
	            System.out.print("영어>");
	            int eng=s.nextInt();
	            System.out.print("수학>");
	            int mat=s.nextInt();
	            
	            
	            ps.setString(1, sno);
	            ps.setString(2, sname);
	            ps.setInt(3, kor);
	            ps.setInt(4, eng);
	            ps.setInt(5, mat);
	            ps.execute();
	            
	            System.out.println("입력완료.....");
	            break;
	         case 2: //성적출력
	            sql="select * from tbl_grade order by kor+eng+mat desc";
	            ps=con.prepareStatement(sql);
	            ResultSet rs=ps.executeQuery();
	            System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균"); 
	            while(rs.next()) {
	               int kor1=rs.getInt("kor");
	               int eng1=rs.getInt("eng");
	               int mat1=rs.getInt("mat");
	               int sum=kor1 + eng1 + mat1;
	               int avg=sum/3;
	               
	               
	               System.out.print(rs.getString("sno")+"\t");
	               System.out.print(rs.getString("sname")+"\t");
	               System.out.print(rs.getInt("kor")+"\t");
	               System.out.print(rs.getInt("eng")+"\t");
	               System.out.print(rs.getInt("mat")+ "\t");
	               System.out.print(sum + "\t");
	               System.out.println(avg);
	            }           
	            break;
	         case 3:
	            run=false;
	            System.out.println("프로그램종료");
	         }
	         System.out.println();
	      }

	   }
}
