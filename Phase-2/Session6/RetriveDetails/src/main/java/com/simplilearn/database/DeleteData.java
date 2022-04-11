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

 
@WebServlet("/delete")
public class DeleteData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String param=request.getParameter("pname");
		
		//int id= Integer.parseInt(param);
		
		PrintWriter out = response.getWriter();
		Properties props = new Properties();
		response.setContentType("text/html");
		
		
		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);

		Connection conn = DBConfig.getConnection(props);
		
		if(conn!=null) {
			
			try {
				PreparedStatement stmt= conn.prepareStatement("delete from products where pname=?");
				stmt.setString(1, param);
				
				 
				
				int rs= stmt.executeUpdate();
				
				if(rs>0) {
					out.print(rs+ " deleted from database");
	
				}
				else {
					out.print("Error while deleting a data");
					
				}
				
			} catch (SQLException e) {
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