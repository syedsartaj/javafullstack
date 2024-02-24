package com.login.students;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentId = request.getParameter("id");
        Connection con = null;
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;

    
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sartaj?useSSL=false", "root", "789353sar");

	            // Prepare the SQL query for updating student data
	            PreparedStatement pst1 = con.prepareStatement("DELETE FROM student WHERE addno =?");
	            pst1.setString(1, "sds");
	            int rowsAffected = pst1.executeUpdate();
	            if (rowsAffected > 0) {
	                response.sendRedirect("table.jsp");
	            }else {
	                response.sendRedirect("edit.jsp");

	            }



			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle GET requests here if needed
        // For example, you can redirect to an error page or display a message
        String studentId = request.getParameter("id");
        Connection con = null;
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;

    
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sartaj?useSSL=false", "root", "789353sar");

	            // Prepare the SQL query for updating student data
	            PreparedStatement pst1 = con.prepareStatement("DELETE FROM student WHERE addno =?");
	            pst1.setString(1, studentId);
	            int rowsAffected = pst1.executeUpdate();
	            if (rowsAffected > 0) {
	                response.sendRedirect("table.jsp");
	            }else {
	                response.sendRedirect("edit.jsp");

	            }



			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				session.removeAttribute("id");
	            try {
	                if (con != null) {
	                    con.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace(); // Log the exception for debugging
	            }

			}



}
}