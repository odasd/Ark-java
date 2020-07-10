package 으앙;

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
			System.out.println("1. 상품등록 | 2. 상품목록 | 3. 상품수정 | 4. 종료 ");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			int menu=s.nextInt();
			
			switch(menu) {
			case 1:
				
				String sql="insert into pm(pnum, pname, price, stock ) values(?,?,?,?)";
				
				System.out.print("상품번호> ");
				String pnum=s.next();
				System.out.print("상품명> ");
				String pname=s.next();
				System.out.print("단가> ");
				int price=s.nextInt();
				System.out.print("수량> ");
				int stock=s.nextInt();
				
				System.out.println("상품입력 완료.");
				
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
				
				
				System.out.println("상품번호\t상품명\t단가\t수량\t금액");
				
				
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
				System.out.print("수정 상품 번호  >");
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
					System.out.println("상품명 = "+ pname);
					System.out.print("상품가격 = ("+ price +")> ");
					price=s.nextInt();
					System.out.print("재고 = (" + stock + ")> ");
					stock=s.nextInt();
					
					sql="update pm set price=?,stock=? where pnum=? ";
					ps=con.prepareStatement(sql);
					ps.setInt(1, price);
					ps.setInt(2, stock);
					ps.setString(3, pnum);
					ps.execute();
					System.out.println("");
					System.out.println("변경이 완료됨");
					System.out.println("");
					
				} else {
					System.out.println("값이 일치하지 않는다.");
				}
				
				
				System.out.println();
				break;
			case 4:
				run=false;
				System.out.println("프로그램 종료");
				break;
				default:
				System.out.println("당신은 잘못 골랐덩");
			}
			
		}

	}

}
