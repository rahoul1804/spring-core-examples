package storedPocedure22;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StoredProcedur {
	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cstmt=null;
		ResultSet rs=null;
		String qry="{call storedpro.getstore(?)}";
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the id");
		int sid=scn.nextInt();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul","root","root");
			cstmt=con.prepareCall(qry);
			cstmt.setInt(1,sid);
			rs=cstmt.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String dept=rs.getString(3);
				System.out.println(id+" "+name+" "+dept);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(cstmt!=null)
				try {
					cstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
