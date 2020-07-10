package ex01;

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
			
		System.out.println("-------------------------------------------");
		System.out.println("1. �Է� | 2. ��� | 3. ���� | 4. ���� | 5. ���� ");
		System.out.println("-------------------------------------------");
		System.out.print("�۾�����> ");
		int menu=s.nextInt();
		
		switch(menu) {
		
			case 1: //�Է�
				
				String sql="insert into tbl_grade(sno,sname,kor,eng,mat,tot) values(?,?,?,?,?,?)";
				
				System.out.print("��ȣ> ");
				String no=s.next();
				System.out.print("�̸�> ");
				String name=s.next();
				System.out.print("����> ");
				int kor=s.nextInt();
				System.out.print("����> ");
				int eng=s.nextInt();
				System.out.print("����> ");
				int mat=s.nextInt();
				System.out.print("���> ");
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, no);
				ps.setString(2, name);
				ps.setInt(3, kor);
				ps.setInt(4, eng);
				ps.setInt(5, mat);
				ps.setInt(6, kor+eng+mat);
				ps.execute();
				System.out.println("�������Է¿Ϸ�");
				System.out.println("");
				
				break;
			case 2: //���
				sql="select * from tbl_grade";
				ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
		
				while(rs.next()) {
					String sno=rs.getString("sno");
					String sname=rs.getString("sname");
					kor=rs.getInt("kor");
					eng=rs.getInt("eng");
					mat=rs.getInt("mat");
					int sum=kor+eng+mat;
					double avg=(double)sum/3;	
					System.out.print(sno+"\t");
					System.out.print(sname+"\t");
					System.out.print(kor+"\t");
					System.out.print(eng+"\t");
					System.out.print(mat+"\t");	
					System.out.print("���� = " + sum+"\t");
					System.out.println("��� = " + avg);
					
				}	
				break;
			case 3: // ����
				System.out.println("��ȣ> ");
				no=s.next();
				
				sql="delete from tbl_grade where sno=?";
				ps=con.prepareStatement(sql);
				
				ps.setString(1, no);
				ps.execute();
				System.out.println("������ �����Ϸ�.");
				break;
			case 4: // ������ ����
				System.out.println("������ȣ> ");
				no=s.next();
				sql="select * from tbl_grade where sno=?";
				ps=con.prepareStatement(sql);
				ps.setString(1, no);
				rs=ps.executeQuery(); //select * from ������(����� �޾ƿö���) executeQuery�� �������� execute��
				
				if(rs.next()) { 
					name=rs.getString("sname");
					kor=rs.getInt("kor");
					eng=rs.getInt("eng");
					mat=rs.getInt("mat");
					System.out.println("���� : " + name);
					System.out.print("���� :(" + kor + ")>");
					kor=s.nextInt();
					System.out.print("���� :(" + eng+ ")>");
					eng=s.nextInt();
					System.out.print("���� :(" + mat+ ")>");
					mat=s.nextInt();
					
					sql="update tbl_grade set kor=?, eng=?, mat=? where sno=?";
					ps=con.prepareStatement(sql);
					ps.setInt(1, kor);
					ps.setInt(2, eng);
					ps.setInt(3, mat);
					ps.setString(4, no);
					ps.executeQuery();
					System.out.println("������ �����Ϸ�");
					System.out.println("");
					
				} else {
					System.out.print("�����Ͱ� �����ϴ�.");
				}
				
				
				
				break;
			case 5:
				run=false;
				System.out.println("���α׷� ����");
				break;
			default :
				System.out.println("�ٽ� ������!");
				
		}
		
		
		
		
		}
	}
}
