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


@WebServlet("/addfare")
public class SaveFare extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		
 String fno=request.getParameter("fno");
 String tclass=request.getParameter("Tclass");
 String fare=request.getParameter("fare");

 FlightFare u=new FlightFare();
 u.setId(1);
 u.setFno(Long.parseLong(fno));
 if(tclass.equals("economy"))
 {
 u.setEfare(Long.parseLong(fare));
 }else if(tclass.equals("first"))
 {
 u.setFfare(Long.parseLong(fare));
 }

		SessionFactory factory= HibernateUtil2.getSessionFactory();
		Session session= factory.openSession();	
		Transaction tx=session.beginTransaction();
		session.save(u);
		tx.commit();
		PrintWriter out= response.getWriter();
		 out.print("Flight Details added Successfully!");
		
	}
}