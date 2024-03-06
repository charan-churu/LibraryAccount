package UserInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddUser {
	public String update(String name,String dob,String num,String mail,String password,String Address) {
		String message = null;
		PreparedStatement st=null;
		Connection c=null;
		String url,user,pwd;
		url="jdbc:mysql://localhost:3306/Project";
		user="root";
		pwd="june";
		String qry="insert into person (name, DOB, PhoneNumber, Mail, Password, Address) values(?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection(url,user,pwd);
			st=c.prepareStatement(qry);
			st.setString(1,name);
			st.setString(2, dob);
			st.setString(3, num);
			st.setString(4,mail);
			st.setString(5, password);
			st.setString(6, Address);
			st.executeUpdate();
			message="You have Successfully Register...!";
			System.out.println("Table Updated");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(c!=null) {
				try {
					c.close();
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

		return message;
	}
}
