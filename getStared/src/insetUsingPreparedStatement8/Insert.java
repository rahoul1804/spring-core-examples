package insetUsingPreparedStatement8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insert 
{

	
	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		
			
		String qry="insert into rahul.student values(?,?,?)";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver clas loaded and registered");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul","root","root");
			System.out.println("connection stablish");
			
			pstmt=con.prepareStatement(qry);
			
			System.out.println("platform created");
			
			
			pstmt.setInt(1, 83);
			pstmt.setString(2, "rahul");
			pstmt.setString(3, "eee");
			
			pstmt.executeUpdate();
			System.out.println("inserted");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			
			
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
