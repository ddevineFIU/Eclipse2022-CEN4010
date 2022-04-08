
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;


public class BookDetails_SQL 
{
   public static void main(String[] args) 
   {
	    Connection conn = null;
	    Statement stmt = null;
	      try {
	          try {
	             Class.forName("com.mysql.jdbc.Driver");
	          } catch (Exception e) {
	             System.out.println(e);
	       }
	      
	    conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "rocky77854");
		stmt = (Statement) conn.createStatement();
		String query1 = "INSERT INTO book " + "VALUES ('13','James Taylor','Long Shot','Longest shot in history.','$9.99','Thriller','Partner Publishing','2020','3600')";
		stmt.executeUpdate(query1);
		query1 = "INSERT INTO InsertDemo " + "VALUES (2, 'Carol', 42)";
		stmt.executeUpdate(query1);
	      } catch (SQLException excep) {
	          excep.printStackTrace();
	       } catch (Exception excep) {
	          excep.printStackTrace();
	       } finally {
	          try {
	             if (stmt != null)
	                conn.close();
	          } catch (SQLException se) {}
	          try {
	             if (conn != null)
	                conn.close();
	          } catch (SQLException se) {
	             se.printStackTrace();
	          }  
	       }
   }
}
