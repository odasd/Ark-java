package ����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Retry {

	public static void main(String[] args) throws Exception {
		
		boolean run=true;
		
	      Scanner s=new Scanner(System.in);
	      //oracle Database����
	      String driver = "oracle.jdbc.driver.OracleDriver";
	      String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	      String user = "system";
	      String password = "159752s";
	      
	      Class.forName(driver);
	      Connection con=DriverManager.getConnection(url, user, password);
	      
	      while(run) {
		         System.out.println("1.����Է�|2.������|3.����");
		         System.out.println("----------------------------");
		         System.out.print("�޴�����>");
		         int menu=s.nextInt();
		         
		         switch(menu) {
		         case 1: //�����Է�
		            String sql="insert into cog(�÷���, ����������, ��ǰ�ֹ���ȣ, �ؿ��ֹ���ȣ, �ֹ���¥, ���ų�¥, ��ǰ��, ��ǰ��ȣ, ��������, �Һ��ڰ����ݾ�)"
		            		+ "values(?,?,?,?,?,?,?,?,?,?)";
		            PreparedStatement ps=con.prepareStatement(sql);
		            
		            System.out.print("�÷���> ");
		            String sno=s.next();
		            System.out.print("������> ");
		            String sname=s.next();
		            System.out.print("����>");
		            int kor=s.nextInt();
		            System.out.print("����>");
		            int eng=s.nextInt();
		            System.out.print("����>");
		            int mat=s.nextInt();
		            
		            
		            ps.setString(1, sno);
		            ps.setString(2, sname);
		            ps.setInt(3, kor);
		            ps.setInt(4, eng);
		            ps.setInt(5, mat);
		            ps.execute();
		            
		            System.out.println("�Է¿Ϸ�.....");
		            break;
		
		            
		        }
	      }
	}

}
