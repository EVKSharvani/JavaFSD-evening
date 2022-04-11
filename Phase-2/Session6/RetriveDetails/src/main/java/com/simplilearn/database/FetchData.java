package com.simplilearn.database;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class FetchData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		Properties props = new Properties();
		response.setContentType("text/html");
		
		
		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);

		Connection conn = DBConfig.getConnection(props);

		if (conn != null) {
			out.print("Connection is Established <br>");
			
			try {
				Statement stmt=conn.createStatement();
				ResultSet rs= stmt.executeQuery("select * from products");
				
				while(rs.next()) {
					 
					 int pid = rs.getInt("pid");
		                String pname = rs.getString("pname");
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
				
				  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			out.print("Error while connecting connection");
		}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}