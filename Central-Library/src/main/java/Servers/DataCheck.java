package Servers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataCheck {
	public boolean check(String m,String pswd) {
		Connection c=null;
		PreparedStatement st=null;
		String url,user,pwd;
		url="jdbc:mysql://localhost:3306/Project";
		user="root";
		pwd="june";
		String qry="select * from person where Mail=? and password=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection(url,user,pwd);
			st=c.prepareStatement(qry);
			
			st.setString(1, m);
			st.setString(2, pswd);
			ResultSet rt=st.executeQuery();
			if(rt.next()) {
				return true;
			}
			
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(c!=null)c.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(st!=null)c.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return false;

}
}