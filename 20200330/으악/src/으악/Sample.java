package ����;

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
			System.out.println("1. ���»��� | 2. ���¸�� | 3. �Ա� | 4. ��� | 5.���� ");
			System.out.println("------------------------------------------------");
			
			int menu=s.nextInt();
			switch(menu) {
				
			case 1: //���� ����
				String sql="insert into tbl_account(ano, aname, balance) values ('111-555','��̳�', 5000)";
				System.out.print("���¹�ȣ> ");
				String ano=s.next();
				System.out.print("������> ");
				String aname=s.next();
				System.out.println("�ʱ� ���ݾ�");
				int balance=s.nextInt();
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, ano);
				ps.setString(2, aname);
				ps.setInt(3, balance);
				ps.execute();
				
				System.out.println("���°� �����Ǿ����ϴ�.");
				System.out.println("");
				
				break;
			case 2: //���¸��
				sql="select*from tbl_account";
				ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				break;
			case 3: //����
				
				break;
			case 4://���
				
				break;
			case 5://���α׷� ����
				run=false;
				System.out.println("���α׷� ����");
				break;
			default :
				System.out.println("�ٽ� ������!");
					
			
			}
		}

	}

}
