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
import javax.servlet.RequestDispatcher;
@WebServlet("/loguser")
public class LoginUser extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String id=request.getParameter("User");
		 
		 PrintWriter out= response.getWriter();
		 
		response.setContentType("text/html");
		 SessionFactory factory= HibernateUtil.getSessionFactory();
		 Session session= factory.openSession();
		 
		 List<UserReg>list =session.createQuery("from UserReg").list();
		 
		 
		 for (UserReg p:list) {
			 
			 if(p.getID()==Long.parseLong(id)) {
			 out.print(p.getID()+"is found");
			 request.setAttribute("User", p);
			 RequestDispatcher dispatcher = request.getServletContext()
						.getRequestDispatcher("/update.jsp");
				dispatcher.forward(request, response);
			
			 }
			 else {
				 out.print("Incorrect password or Username");
			 }
			
			
		 }
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
	