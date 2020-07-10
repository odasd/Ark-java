package ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sample {

	public static void main(String[] args) throws Exception {
		//oracle database 접속
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "system";
		String password = "159752s";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		String sql="select*from tbl_grade order by kor+eng+mat desc";//order by ~ desc 큰값에서 작은값순으로 출력함(내림차순)
		PreparedStatement ps=con.prepareStatement(sql);				//order by ~ asc 작은값에서 큰값으로 출력함(오름차순)
		ResultSet rs=ps.executeQuery();
		
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		while(rs.next()) {
			int kor=rs.getInt("kor");
			int eng=rs.getInt("eng");
			int mat=rs.getInt("mat");
			int sum=kor+eng+mat;
			double avg=sum/3;
			
			
			System.out.print(rs.getString("sno") + "\t"); //오라클의 sno값을 불러옴
			System.out.print(rs.getString("sname")+ "\t"); // 위와 같음ㅋㅋ
			System.out.print(rs.getInt("kor")+ "\t");
			System.out.print(rs.getInt("eng")+ "\t");
			System.out.print(rs.getInt("mat")+ "\t");
			System.out.print(sum+"\t"); //int sum 값을 설정하고 총점을 구함
			System.out.println(avg); // sum값을 3으로 나누어 avg인 평균값을 구함
		}
		
		
	}

}
