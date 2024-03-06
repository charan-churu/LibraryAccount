package UserInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		String url,user,pwd;
		url="jdbc:mysql://localhost:3306/Project";
		user="root";
		pwd="june";
		String qry="delete from person where id>4";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,user,pwd);
			st=con.createStatement();
			int r=st.executeUpdate(qry);
			System.out.println(r+" "+"no of rows affected");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(st!=null) {
				try {
					st.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
