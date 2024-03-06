package Servers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class login extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mail=req.getParameter("mail");
		String password=req.getParameter("pwd");
		DataCheck dc=new DataCheck();
		if(dc.check(mail, password)) {
			HttpSession s=req.getSession();
			s.setAttribute("mail", mail);
			resp.sendRedirect("Home.jsp");
		}
		else {
			resp.sendRedirect("login.jsp");	
		}
	}
}
