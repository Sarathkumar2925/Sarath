package wipro;
import java.sql.*;  
public class JDBC {
	public static void main(String args[]){  
	try{  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	  
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@172.16.7.154:1521:orcl","cse12","cse12");
	  

	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from deepi");  
	while(rs.next())  
	System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
	con.close();  
	  
	}catch(Exception e)
	{ System.out.println(e);
	}  
	}  
	} 

