package 으악;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception {
		
		Scanner s=new Scanner(System.in);
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		
		boolean run=true;
		
		while(run) {
			
			System.out.println("------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 입금 | 4. 출금 | 5.종료 ");
			System.out.println("------------------------------------------------");
			
			int menu=s.nextInt();
			switch(menu) {
				
			case 1: //계좌 생성
				String sql="insert into tbl_account(ano, aname, balance) values ('111-555','김미남', 5000)";
				System.out.print("계좌번호> ");
				String ano=s.next();
				System.out.print("계좌주> ");
				String aname=s.next();
				System.out.println("초기 예금액");
				int balance=s.nextInt();
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, ano);
				ps.setString(2, aname);
				ps.setInt(3, balance);
				ps.execute();
				
				System.out.println("계좌가 생성되었습니다.");
				System.out.println("");
				
				break;
			case 2: //계좌목록
				sql="select*from tbl_account";
				ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				break;
			case 3: //예금
				
				break;
			case 4://출금
				
				break;
			case 5://프로그램 종료
				run=false;
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("다시 고르세요!");
					
			
			}
		}

	}

}
