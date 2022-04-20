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

@WebServlet("/register")
public class SaveServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		
 String fname=request.getParameter("fname1");
 String lname=request.getParameter("lname1");
 String email=request.getParameter("email1");
 String pwd=request.getParameter("pwd1");
 String phno=request.getParameter("phno1");

 UserReg u=new UserReg();
 u.setID(1);
 u.setFname(fname);
 u.setLname(lname);
 u.setEmail(email);
 u.setPwd(pwd);
 u.setPhno(phno);

		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session= factory.openSession();	
		Transaction tx=session.beginTransaction();
		session.save(u);
		tx.commit();
		PrintWriter out= response.getWriter();
		 out.print("Registered Successfully!");
		
	}
}