package Module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HelperClass {
	public static Connection con = null;
	@SuppressWarnings("unused")
	public static  Connection getdbconnection() throws SQLException, ClassNotFoundException {
		if(con==null) {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		return con;
		}
		else{
			return con;
		}
	}
	public static Boolean createUser(String fname,String lname,String mob,String type,String mail,String password) throws SQLException {
		Boolean result = false;
		PreparedStatement stmt = con.prepareStatement("insert into userDetails(user_first_name,user_last_name,user_mob,user_type,user_mail,user_password) values (?,?,?,?,?,?)");
		stmt.setString(1, fname);
		stmt.setString(2, lname);
		stmt.setString(3, mob);
		stmt.setString(4, type);
		stmt.setString(5, mail);
		stmt.setString(6, password);
		
		int i = stmt.executeUpdate();
		if(i==1) {
			result=true;
		}
		return result;
		
	}
}
