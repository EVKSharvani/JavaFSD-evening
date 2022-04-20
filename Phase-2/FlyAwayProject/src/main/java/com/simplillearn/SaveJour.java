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

@WebServlet("/search")
public class SaveJour extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		

String date=request.getParameter("tdate");
 String src=request.getParameter("from");
 String des=request.getParameter("to");
 String num=request.getParameter("tnum");
 String user=request.getParameter("user");
 
 PrintWriter out= response.getWriter();
 
Journey1 u=new Journey1();
 u.setId(1);
 u.setUser(Long.parseLong(user));
 u.setDate(date);
 u.setFroms(src);
 u.setTos(des);
 u.setNum(Long.parseLong(num));


	SessionFactory factory= HibernateUtil3.getSessionFactory();
		Session session= factory.openSession();	
		Transaction tx=session.beginTransaction();
		session.save(u);
		tx.commit();
				 out.print("Successfully!");
		
	}
}