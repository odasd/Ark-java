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
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "system";
		String password = "159752s";
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		boolean run=true;
		
		while(run) {
			
			System.out.println("-----------------------------------------");
			System.out.println("1. ��ǰ��� | 2. ��ǰ��� | 3. ��ǰ���� | 4. ���� ");
			System.out.println("-----------------------------------------");
			System.out.print("����> ");
			int menu=s.nextInt();
			
			switch(menu) {
			case 1:
				
				String sql="insert into pm(pnum, pname, price, stock ) values(?,?,?,?)";
				
				System.out.print("��ǰ��ȣ> ");
				String pnum=s.next();
				System.out.print("��ǰ��> ");
				String pname=s.next();
				System.out.print("�ܰ�> ");
				int price=s.nextInt();
				System.out.print("����> ");
				int stock=s.nextInt();
				
				System.out.println("��ǰ�Է� �Ϸ�.");
				
				PreparedStatement ps=con.prepareStatement(sql);
				
				ps.setString(1, pnum);
				ps.setString(2, pname);
				ps.setInt(3, price);
				ps.setInt(4, stock);
				ps.execute();
				
				break;
			case 2:
				sql="select*from pm";
				ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				
				
				System.out.println("��ǰ��ȣ\t��ǰ��\t�ܰ�\t����\t�ݾ�");
				
				
				while(rs.next()) {
					pnum=rs.getString("pnum");
					pname=rs.getString("pname");
					price=rs.getInt("price");
					stock=rs.getInt("stock");
					int sum=price+stock;
					System.out.println(pnum+"\t"+pname+"\t"+price+"\t"+stock+"\t"+sum);
					
				}
				
				
				break;
			case 3:
				
				System.out.println("-------------------------------");
				System.out.print("���� ��ǰ ��ȣ  >");
				pnum=s.next();
				sql="select * from pm where pnum=?";
				ps=con.prepareStatement(sql);
				ps.setString(1, pnum);
				rs=ps.executeQuery();
				
				
				if(rs.next()) {
					
					pname=rs.getString("pname");
					price=rs.getInt("price");
					stock=rs.getInt("stock");
					ps.execute();
					System.out.println("��ǰ�� = "+ pname);
					System.out.print("��ǰ���� = ("+ price +")> ");
					price=s.nextInt();
					System.out.print("��� = (" + stock + ")> ");
					stock=s.nextInt();
					
					sql="update pm set price=?,stock=? where pnum=? ";
					ps=con.prepareStatement(sql);
					ps.setInt(1, price);
					ps.setInt(2, stock);
					ps.setString(3, pnum);
					ps.execute();
					System.out.println("");
					System.out.println("������ �Ϸ��");
					System.out.println("");
					
				} else {
					System.out.println("���� ��ġ���� �ʴ´�.");
				}
				
				
				System.out.println();
				break;
			case 4:
				run=false;
				System.out.println("���α׷� ����");
				break;
				default:
				System.out.println("����� �߸� �����");
			}
			
		}

	}

}
