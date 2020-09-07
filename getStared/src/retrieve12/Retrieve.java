package retrieve12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Retrieve {
	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		
		ResultSet rs=null;
		
		
		String qry1="select * from rahul.student";
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver clas loaded and registered");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul","root","root");
			System.out.println("connection stablish");
			
			pstmt=con.prepareStatement(qry1);
			
			System.out.println("platform created");
			
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String dept=rs.getString(3);
				
				System.err.println(id+","+name+","+dept);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			if(rs!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
}

