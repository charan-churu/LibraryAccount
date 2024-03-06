package Servers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UserInfo.AddUser;


@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("nm");
		String dob=req.getParameter("DOB");
		String num=req.getParameter("num");
		String mail=req.getParameter("mail");
		String password=req.getParameter("pwd");
		String Address=req.getParameter("add");
		
		AddUser au=new AddUser();
		
		String message=au.update(name,dob,num,mail,password,Address);
		
		req.setAttribute("message", message);

		// Forward the request to the JSP file
		RequestDispatcher dispatcher = req.getRequestDispatcher("/SignIn.jsp");
		dispatcher.forward(req, resp);
	}
}
