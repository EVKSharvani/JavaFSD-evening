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

@WebServlet("/addfly")
public class SaveFlight extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		

 String airline=request.getParameter("airline");
 String[] days = request.getParameterValues("day");
 String src=request.getParameter("src");
 String des=request.getParameter("dest");
 
FlightDetails u=new FlightDetails();
 u.setFno(1);
 u.setAirline(airline);
 u.setSrc(src);
 u.setDes(des);
 //u.setDays(days);


	SessionFactory factory= HibernateUtil1.getSessionFactory();
		Session session= factory.openSession();	
		Transaction tx=session.beginTransaction();
		session.save(u);
		tx.commit();
		PrintWriter out= response.getWriter();
		 out.print("Flight Added Successfully!");
		
	}
}