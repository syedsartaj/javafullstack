package com.login.students;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class query
 */
@WebServlet("/query")
public class query extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name");
		String email = request.getParameter("email");
		String phno = request.getParameter("phno");
		String discribtion = request.getParameter("message");
   		Connection con = null;
   		HttpSession session = request.getSession();
   		String name = (String) session.getAttribute("sname");
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sartaj?useSSL=false", "root", "789353sar");
		    PreparedStatement pst = con.prepareStatement("INSERT INTO query (name, email, phno, message) VALUES (?, ?, ?, ?)");
		    pst.setString(1, uname);
		    pst.setString(2, email);
		    pst.setString(3, phno);
		    pst.setString(4, discribtion);
		    pst.executeUpdate(); // Execute the INSERT query
		    if(name !=null) {
		    	response.sendRedirect("index.jsp");
		    }
		    else {
		    	response.sendRedirect("home.html");		    	
		    }
		    response.sendRedirect("");

	    }catch(Exception e) {
	    	
	    }
	}

}
