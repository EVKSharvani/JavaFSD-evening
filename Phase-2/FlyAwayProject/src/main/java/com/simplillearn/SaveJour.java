package com.simplillearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.RequestDispatcher;
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
import java.util.List; 

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
		 response.setContentType("text/html");
		 SessionFactory factory1= HibernateUtil1.getSessionFactory();
		 Session session1= factory1.openSession();
		 
		 List<FlightDetails>list =session1.createQuery("from FlightDetails").list();
		 
		 
		
		 
		
		 
		 for (FlightDetails p:list) {
			 
			 if((p.getSrc()).equals(src) && (p.getDes()).equals(des)) {
			
			 request.setAttribute("p", p);
			 RequestDispatcher dispatcher = request.getServletContext()
						.getRequestDispatcher("/avaflights.jsp");
				dispatcher.forward(request, response);
			
			 }
		 }
		
				 
	}
}