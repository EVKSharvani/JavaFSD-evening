package com.simplilearn.database;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class CreateData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// create table inside database named products
	// use below code in mysqli client under the database ecommerce
	// create table products(pid bigint primary key auto_increment,
	// pname varchar(100),pdetails varchar(100),price decimal(10,2),date_added timestamp default now());

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		Properties props = new Properties();

		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);

		Connection conn = DBConfig.getConnection(props);
		
		String pname= request.getParameter("pname");
		String pdetails= request.getParameter("pdetails");
		String price= request.getParameter("price");

		
		
		if(conn!=null) {
			
			try {
				
				
				PreparedStatement stmt=conn.prepareStatement
						("insert into products (pname,pdetails,price)values(?,?,?)");
				stmt.setString(1, pname);
				stmt.setString(2, pdetails);
				stmt.setString(3, price);
				
				
				int rs= stmt.executeUpdate();
				
				if(rs>0) {
					out.print(rs+ "row updated successfully");
					
				}
				else {
					out.print("error while inserting data");
					response.sendRedirect("index.html");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}