package com.codechobo2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginAction")

public class LoginAction extends HttpServlet {
private static final long serialVersionUID = 1L; 

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub

	String id = req.getParameter("id");
	String pwd = req.getParameter("pwd");


	
	PrintWriter out = resp.getWriter();

out.println("<!DOCTYPE html>");

out.println("<html>");

out.println("<head>");

out.println("</head>");

out.println("<body>");
	

			
	out.println("<h1>Hello, "+id+".</h1>");
	out.println("<h1>Your password is "+pwd+"</h1>");

	out.println("</body>");

	out.println("</html>");

}
}
