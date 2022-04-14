package com.simplilearn;

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

@WebServlet("/save")
public class SaveServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		
 String name=request.getParameter("pname");
 String price=request.getParameter("pprice");
 String hdd=request.getParameter("hdd");
 String cpu=request.getParameter("cpu");
 String ram=request.getParameter("ram");
 Timestamp ts=new Timestamp(System.currentTimeMillis());  
 Date date=new Date(ts.getTime());  
 ProductParts parts= new ProductParts();
 parts.setHdd(hdd);
 parts.setCpu(cpu);
 parts.setRam(ram);
 EProduct p=new EProduct();
 p.setID(4);
 p.setName(name);
 p.setPrice(new BigDecimal(price));
 p.setDateAdded(date);
 p.setParts(parts);

		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session= factory.openSession();	
		Transaction tx=session.beginTransaction();
		session.save(p);
		tx.commit();
		response.sendRedirect("list");
		
	}
}