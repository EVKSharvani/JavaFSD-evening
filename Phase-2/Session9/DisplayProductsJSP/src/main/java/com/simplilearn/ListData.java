package com.simplilearn;

import java.io.IOException;import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
@WebServlet("/list")
public class ListData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 SessionFactory factory= HibernateUtil.getSessionFactory();
		 Session session= factory.openSession();
		 
		 List<EProduct>list =session.createQuery("from EProduct").list();
		 
		 request.setAttribute("productList", list);
		 RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/viewlist.jsp");
			dispatcher.forward(request, response);
		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}