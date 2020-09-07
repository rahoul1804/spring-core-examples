package tryWithResource_FinallyClose20;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FinallyCloseResources {

	public static void main(String[] args)
	{
		
		Connection con=null;
		Statement stmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver clas loaded and registered");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
     
		finally {
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}

