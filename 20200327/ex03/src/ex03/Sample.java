package ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception {
		//oracle datebase sever에 접속
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		//sql
		String sql="insert into tbl_grade(sno, sname) values(?,?)";
		PreparedStatement ps =con.prepareStatement(sql);
		Scanner s = new Scanner(System.in);
		System.out.print("번호> ");
		String sno=s.next();
		System.out.print("이름> ");
		String sname=s.next();
		
		ps.setString(1, sno);
		ps.setString(2, sname);
		ps.execute(); //ps값을 시행한다는 뜻
		
		System.out.println("입력완료....");
		
				

		
	}

}
