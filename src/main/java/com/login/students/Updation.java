package com.login.students;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Updation
 */
@WebServlet("/Updation")
public class Updation extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
         String studentId = (String) session.getAttribute("id");
        Connection con = null;
        RequestDispatcher dispatcher = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sartaj?useSSL=false", "root", "789353sar");

            // Prepare the SQL query for updating student data
            PreparedStatement pst1 = con.prepareStatement("UPDATE student SET sname=?, fname=?, mname=?, addno=?, class=?, grade=?, attendence=?, overallper=?, acdemicper=?, activityper=?, fao=?, fat=?, fath=?, fafo=?, sao=?, sat=?, faoper=?, fatper=?, fathper=?, fafoper=?, saoper=?, satper=?, fees=?, pwd=? WHERE addno=?");

            // Set parameter values for the update query based on form inputs or session attributes
         // Set parameter values for the update query based on form inputs or session attributes
            pst1.setString(1, request.getParameter("sname"));
            pst1.setString(2, request.getParameter("fname"));
            pst1.setString(3, request.getParameter("mname"));
            pst1.setString(4, request.getParameter("addno"));
            pst1.setString(5, request.getParameter("ssalc"));
            pst1.setString(6, request.getParameter("grade"));

            // Handle null values for integer parameters
            int attendence = (request.getParameter("attendence") != null && !request.getParameter("attendence").isEmpty()) ? Integer.parseInt(request.getParameter("attendence")) : 0;
            int overallper = (request.getParameter("overallper") != null && !request.getParameter("overallper").isEmpty()) ? Integer.parseInt(request.getParameter("overallper")) : 0;
            int acdemicper = (request.getParameter("acdemicper") != null && !request.getParameter("acdemicper").isEmpty()) ? Integer.parseInt(request.getParameter("acdemicper")) : 0;
            int activityper = (request.getParameter("activityper") != null && !request.getParameter("activityper").isEmpty()) ? Integer.parseInt(request.getParameter("activityper")) : 0;

            pst1.setInt(7, attendence);
            pst1.setInt(8, overallper);
            pst1.setInt(9, acdemicper);
            pst1.setInt(10, activityper);

            pst1.setString(11, request.getParameter("fao"));
            pst1.setString(12, request.getParameter("fat"));
            pst1.setString(13, request.getParameter("fath"));
            pst1.setString(14, request.getParameter("fafo"));
            pst1.setString(15, request.getParameter("sao"));
            pst1.setString(16, request.getParameter("sat"));

            // Handle null values for integer parameters
            int faoper = (request.getParameter("faoper") != null && !request.getParameter("faoper").isEmpty()) ? Integer.parseInt(request.getParameter("faoper")) : 0;
            int fatper = (request.getParameter("fatper") != null && !request.getParameter("fatper").isEmpty()) ? Integer.parseInt(request.getParameter("fatper")) : 0;
            int fathper = (request.getParameter("fathper") != null && !request.getParameter("fathper").isEmpty()) ? Integer.parseInt(request.getParameter("fathper")) : 0;
            int fafoper = (request.getParameter("fafoper") != null && !request.getParameter("fafoper").isEmpty()) ? Integer.parseInt(request.getParameter("fafoper")) : 0;
            int saoper = (request.getParameter("saoper") != null && !request.getParameter("saoper").isEmpty()) ? Integer.parseInt(request.getParameter("saoper")) : 0;
            int satper = (request.getParameter("satper") != null && !request.getParameter("satper").isEmpty()) ? Integer.parseInt(request.getParameter("satper")) : 0;
            int fees = (request.getParameter("fees") != null && !request.getParameter("fees").isEmpty()) ? Integer.parseInt(request.getParameter("fees")) : 0;

            pst1.setInt(17, faoper);
            pst1.setInt(18, fatper);
            pst1.setInt(19, fathper);
            pst1.setInt(20, fafoper);
            pst1.setInt(21, saoper);
            pst1.setInt(22, satper);
            pst1.setInt(23, fees);

            pst1.setString(24, request.getParameter("pwd"));
            pst1.setString(25, studentId); // Assuming addno is the primary key for identifying the record to update

            // Execute the update query
            int rowsAffected = pst1.executeUpdate();

            // Check if the update was successful and redirect accordingly
            if (rowsAffected > 0) {
            	session.removeAttribute("id");
                response.sendRedirect("edit.jsp");
            } else {
                request.setAttribute("status", "failed");
                dispatcher = request.getRequestDispatcher("loginpage.jsp");
                dispatcher.forward(request, response);
            }
        } catch (Exception e) {
            // Handle exceptions more gracefully, e.g., redirect to an error page
            e.printStackTrace(); // Log the exception for debugging
            request.setAttribute("status", "failed");
            dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
        } finally {
            // Close the database connection in a finally block to ensure proper resource management
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Log the exception for debugging
            }
        }
    }  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
         String studentId = (String) session.getAttribute("id");
        Connection con = null;
        RequestDispatcher dispatcher = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sartaj?useSSL=false", "root", "789353sar");

            // Prepare the SQL query for updating student data
            PreparedStatement pst1 = con.prepareStatement("UPDATE student SET sname=?, fname=?, mname=?, addno=?, class=?, grade=?, attendence=?, overallper=?, acdemicper=?, activityper=?, fao=?, fat=?, fath=?, fafo=?, sao=?, sat=?, faoper=?, fatper=?, fathper=?, fafoper=?, saoper=?, satper=?, fees=?, pwd=? WHERE addno=?");

            // Set parameter values for the update query based on form inputs or session attributes
         // Set parameter values for the update query based on form inputs or session attributes
            pst1.setString(1, request.getParameter("sname"));
            pst1.setString(2, request.getParameter("fname"));
            pst1.setString(3, request.getParameter("mname"));
            pst1.setString(4, request.getParameter("addno"));
            pst1.setString(5, request.getParameter("ssalc"));
            pst1.setString(6, request.getParameter("grade"));

            // Handle null values for integer parameters
            int attendence = (request.getParameter("attendence") != null && !request.getParameter("attendence").isEmpty()) ? Integer.parseInt(request.getParameter("attendence")) : 0;
            int overallper = (request.getParameter("overallper") != null && !request.getParameter("overallper").isEmpty()) ? Integer.parseInt(request.getParameter("overallper")) : 0;
            int acdemicper = (request.getParameter("acdemicper") != null && !request.getParameter("acdemicper").isEmpty()) ? Integer.parseInt(request.getParameter("acdemicper")) : 0;
            int activityper = (request.getParameter("activityper") != null && !request.getParameter("activityper").isEmpty()) ? Integer.parseInt(request.getParameter("activityper")) : 0;

            pst1.setInt(7, attendence);
            pst1.setInt(8, overallper);
            pst1.setInt(9, acdemicper);
            pst1.setInt(10, activityper);

            pst1.setString(11, request.getParameter("fao"));
            pst1.setString(12, request.getParameter("fat"));
            pst1.setString(13, request.getParameter("fath"));
            pst1.setString(14, request.getParameter("fafo"));
            pst1.setString(15, request.getParameter("sao"));
            pst1.setString(16, request.getParameter("sat"));

            // Handle null values for integer parameters
            int faoper = (request.getParameter("faoper") != null && !request.getParameter("faoper").isEmpty()) ? Integer.parseInt(request.getParameter("faoper")) : 0;
            int fatper = (request.getParameter("fatper") != null && !request.getParameter("fatper").isEmpty()) ? Integer.parseInt(request.getParameter("fatper")) : 0;
            int fathper = (request.getParameter("fathper") != null && !request.getParameter("fathper").isEmpty()) ? Integer.parseInt(request.getParameter("fathper")) : 0;
            int fafoper = (request.getParameter("fafoper") != null && !request.getParameter("fafoper").isEmpty()) ? Integer.parseInt(request.getParameter("fafoper")) : 0;
            int saoper = (request.getParameter("saoper") != null && !request.getParameter("saoper").isEmpty()) ? Integer.parseInt(request.getParameter("saoper")) : 0;
            int satper = (request.getParameter("satper") != null && !request.getParameter("satper").isEmpty()) ? Integer.parseInt(request.getParameter("satper")) : 0;
            int fees = (request.getParameter("fees") != null && !request.getParameter("fees").isEmpty()) ? Integer.parseInt(request.getParameter("fees")) : 0;

            pst1.setInt(17, faoper);
            pst1.setInt(18, fatper);
            pst1.setInt(19, fathper);
            pst1.setInt(20, fafoper);
            pst1.setInt(21, saoper);
            pst1.setInt(22, satper);
            pst1.setInt(23, fees);

            pst1.setString(24, request.getParameter("pwd"));
            pst1.setString(25, studentId); // Assuming addno is the primary key for identifying the record to update

            // Execute the update query
            int rowsAffected = pst1.executeUpdate();

            // Check if the update was successful and redirect accordingly
            if (rowsAffected > 0) {
            	session.removeAttribute("id");
                response.sendRedirect("edit.jsp");
            } else {
                request.setAttribute("status", "failed");
                dispatcher = request.getRequestDispatcher("loginpage.jsp");
                dispatcher.forward(request, response);
            }
        } catch (Exception e) {
            // Handle exceptions more gracefully, e.g., redirect to an error page
            e.printStackTrace(); // Log the exception for debugging
            request.setAttribute("status", "failed");
            dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
        } finally {
            // Close the database connection in a finally block to ensure proper resource management
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
