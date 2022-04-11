package com.simplilearn.database;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/retrive")
public class RetriveProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String pname= request.getParameter("pname");
		
		
		 
		
		PrintWriter out = response.getWriter();
		Properties props = new Properties();
		response.setContentType("text/html");
		
		
		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);

		Connection conn = DBConfig.getConnection(props);
		
		if(conn!=null) {
			
			try {
				 
				PreparedStatement stmt=conn.prepareStatement("select * from products where pname=?");
						stmt.setString(1, pname);
	
						
						ResultSet rs= stmt.executeQuery();
						
		if(rs.next()) {
	                     int pid = rs.getInt("pid");
    
     String pdetails = rs.getString("pdetails");
     String price = rs.getString("price");
     String pdate = rs.getString("date_added");
     
		out.print("<br><br>Product ID: <b>"+pid+
				"</b><br> Product Name: <b>"+pname+
				"</b><br> Product Details: <b>"+pdetails+
				" </b><br> Price:  <b>"+price+
				" </b><br> Date Added: <b>"+pdate+
				" </b><br> ");
				}
			}
				
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			
		}
		
		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}