package com.simplilearn.fetchdata;

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
		
		
		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/application.properities");
		props.load(in);

		Connection conn = DBConfig.getConnection(props);

		if (conn != null) {
			out.print("Connection is Established <br>");
			
			try {
				Statement stmt=conn.createStatement();
				ResultSet rs= stmt.executeQuery("select * from eproduct");
				
				while(rs.next()) {
					
					out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getBigDecimal(3)+
							" "+rs.getTimestamp(4)+"<br>");
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