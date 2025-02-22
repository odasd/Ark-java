package ex02;

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

		System.out.println("----------------------------------------------");
		System.out.println("1. 계좌생성 | 2. 목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
		System.out.println("----------------------------------------------");
		
		int menu=s.nextInt();
		
		switch(menu) {

		case 1: //계좌생성
			String sql="insert into tbl_account(ano,aname,balance) values(?,?,?)";
			
			System.out.print("계좌번호> ");
			String ano=s.next();
			System.out.print("계좌주> ");
			String aname=s.next();
			System.out.print("초기입금액> ");
			int balance=s.nextInt();
			
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, ano);
			ps.setString(2, aname);
			ps.setInt(3, balance);
			ps.execute();
			System.out.println("계좌가 생성되었습니다.");
			System.out.println("");
			break;
		case 2: //목록
			sql="select * from tbl_account";
			ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
	
			System.out.println("계좌목록");
			System.out.println("----------------------------------------------");
			
			while(rs.next()) {
				
				ano=rs.getString("ano");
				aname=rs.getString("aname");
				balance=rs.getInt("balance");
				System.out.print(ano+"\t");
				System.out.print(aname+"\t");
				System.out.println(balance);
				
				
			}	
			break;
		case 3: //예금
			System.out.println("---------------------------------");
			System.out.println("예금");
			System.out.println("---------------------------------");
			System.out.println("계좌번호");
			ano=s.next();
			sql="select*from tbl_account where ano=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, ano);
			rs=ps.executeQuery();
			if(rs.next()) {
				aname=rs.getString("aname");
				balance=rs.getInt("balance");
				System.out.println("계좌주 : " + aname);
				System.out.println("잔액 : " + balance);
				System.out.println("입금액");
				int input=s.nextInt();
				sql="update tbl_account set balance=balance+? where ano=?";
				ps=con.prepareStatement(sql);
				ps.setInt(1, input);
				ps.setString(2, ano);
				ps.execute();
			}
			
			break;
		case 4: //출금
			System.out.println("---------------------------------");
			System.out.println("예금");
			System.out.println("---------------------------------");
			System.out.println("계좌번호");
			ano=s.next();
			sql="select*from tbl_account where ano=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, ano);
			rs=ps.executeQuery();
			if(rs.next()) {
				aname=rs.getString("aname");
				balance=rs.getInt("balance");
				System.out.println("계좌주 : " + aname);
				System.out.println("잔액 : " + balance);
				System.out.println("출금액 : ");
				int input=s.nextInt(); //출금할 금액
				sql="update tbl_account set balance=balance-? where ano=?";
				ps=con.prepareStatement(sql);
				ps.setInt(1, input);
				ps.setString(2, ano);
				ps.execute();
			}
			break;
		case 5:
			run=false;
			System.out.println("프로그램 종료");
			break;
		default :
			System.out.println("선택 잘못함");
		}
		
		}
	}

}
