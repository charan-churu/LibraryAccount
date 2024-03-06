package UserInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table {
	public static void main(String[] args) {
		Connection c=null;
		Statement st=null;
		String url="jdbc:mysql://localhost:3306/Project";
		String user="root";
		String pwd="june";
		String qry="create table person(id int AUTO_INCREMENT PRIMARY KEY,name varchar(45) not null,DOB varchar(45) not null,PhoneNumber varchar(45) not null, Mail varchar(45) not null,Password varchar(45) not null, Address varchar(50) not null)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection(url, user, pwd);
			st=c.createStatement();
			st.execute(qry);
			System.out.println("Table Created");
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		finally {
			if(c!=null) {
				try {
					c.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(st!=null) {
				try {
					st.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
