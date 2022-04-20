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

import com.simplillearn.UserReg;
import com.simplillearn.HibernateUtil;


import java.util.List; 

@WebServlet("/change")
public class ChangePass extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("Id"); 
		String email=request.getParameter("Uname");
		 String pwd=request.getParameter("Pass");
		 PrintWriter out= response.getWriter();
		 
		response.setContentType("text/html");
		 SessionFactory factory= HibernateUtil.getSessionFactory();
		 Session session= factory.openSession();
		 
		 List<UserReg>list =session.createQuery("from UserReg").list();
		 
		 
		
		 
		
		 
		 for (UserReg p:list) {
			 
			 if((p.getID()==Long.parseLong(id)) && (p.getEmail()).equals(email)  ) {
				 p.setPwd(pwd);
				
					Transaction tx=session.beginTransaction();
					session.save(p);
					tx.commit();
			 System.out.println("Password Updated... ");
			response.sendRedirect("log_user.html");
			 
			 }
			
			
		 }
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
	