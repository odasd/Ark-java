package 복습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Retry {

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
		         System.out.println("1.장부입력|2.장부출력|3.종료");
		         System.out.println("----------------------------");
		         System.out.print("메뉴선택>");
		         int menu=s.nextInt();
		         
		         switch(menu) {
		         case 1: //성적입력
		            String sql="insert into cog(플랫폼, 구매자정보, 상품주문번호, 해외주문번호, 주문날짜, 구매날짜, 상품명, 상품번호, 결제수단, 소비자결제금액)"
		            		+ "values(?,?,?,?,?,?,?,?,?,?)";
		            PreparedStatement ps=con.prepareStatement(sql);
		            
		            System.out.print("플랫폼> ");
		            String sno=s.next();
		            System.out.print("구매자> ");
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
		
		            
		        }
	      }
	}

}
