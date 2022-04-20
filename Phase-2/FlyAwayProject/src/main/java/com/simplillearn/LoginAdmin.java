package com.simplillearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date; 

@WebServlet("/logadmin")
public class LoginAdmin extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		
 String email=request.getParameter("Uname");
 String pwd=request.getParameter("Pass");


 
		PrintWriter out= response.getWriter();
		if(email.equals("sharvani123@gmail.com") && pwd.equals("sharvani123"))
		{
		 
		 response.sendRedirect("addflight.html");
		}
		else {
			 out.print("Incorrect password or Username");
		 }
	}
}