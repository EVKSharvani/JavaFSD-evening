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

import com.simplillearn.FlightDetails;
import com.simplillearn.HibernateUtil1;


import java.util.List; 
import javax.servlet.RequestDispatcher;
@WebServlet("/detail")
public class Details extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String flight=request.getParameter("flight");
		
		 PrintWriter out= response.getWriter();
		 
		 response.setContentType("text/html");
		 SessionFactory factory1= HibernateUtil1.getSessionFactory();
		 Session session1= factory1.openSession();
		 
		 List<FlightDetails>list =session1.createQuery("from FlightDetails").list();
		 
		 
		
		 
		
		 
		 for (FlightDetails p:list) {
			 
			 if(p.getFno()==Long.parseLong(flight)) {
			
			 request.setAttribute("p", p);
			 RequestDispatcher dispatcher = request.getServletContext()
						.getRequestDispatcher("/bookflight.jsp");
				dispatcher.forward(request, response);
			
			 }
		 }
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
	