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

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       		int attendence = 0;
       		int academicper = 0;
       		int activityper = 0;
       		int overallper = 0;
       		int faoper = 0;
       		int fatper = 0;
       		int fathper = 0;
       		int fafoper = 0;
       		int saoper = 0;
       		int satper = 0;
       		int fees = 0;

       		String sname = request.getParameter("sname");
       		String fname = request.getParameter("fname");
       		String mname = request.getParameter("mname");
       		String addno = request.getParameter("mname");
       		String grade = request.getParameter("grade");
       		String ssalc = request.getParameter("ssalc");
       		attendence = Integer.parseInt(request.getParameter("attendence"));
       		academicper = Integer.parseInt(request.getParameter("academicper"));
       		activityper = Integer.parseInt(request.getParameter("activityper"));
       		overallper = Integer.parseInt(request.getParameter("overallper"));
       		String fao = request.getParameter("fao");
       		faoper = Integer.parseInt(request.getParameter("faoper"));
       		String fat = request.getParameter("fat");
       		fatper = Integer.parseInt(request.getParameter("fatper"));
       		String fath = request.getParameter("fath");
       		fathper = Integer.parseInt(request.getParameter("fathper"));
       		String fafo = request.getParameter("fafo");
       		fafoper = Integer.parseInt(request.getParameter("fafoper"));
       		String sao = request.getParameter("sao");
       		saoper = Integer.parseInt(request.getParameter("saoper"));
       		String sat = request.getParameter("sat");
       		satper = Integer.parseInt(request.getParameter("satper"));
       		fees = Integer.parseInt(request.getParameter("fees"));
       		String pwd = request.getParameter("pwd");

            Connection con = null;
            RequestDispatcher dispatcher = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sartaj?useSSL=false", "root", "789353sar");
                PreparedStatement pst = con.prepareStatement("INSERT INTO student (sname,fname,mname,addno,class,grade,attendence,overallper,acdemicper,activityper,fao,fat,fath,fafo,sao,sat,faoper,fatper,fathper,fafoper,saoper,satper,fees,pwd) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, sname);
                pst.setString(2, fname);
                pst.setString(3, mname);
                pst.setString(4, addno);
                pst.setString(5, ssalc);
                pst.setString(6, grade);
                pst.setInt(7, attendence);
                pst.setInt(8, overallper);
                pst.setInt(9, academicper);
                pst.setInt(10, activityper);
                pst.setString(11, fao);
                pst.setString(12, fat);
                pst.setString(13, fath);
                pst.setString(14, fafo);
                pst.setString(15, sao);
                pst.setString(16, sat);
                pst.setInt(17, faoper);
                pst.setInt(18, fatper);
                pst.setInt(19, fathper);
                pst.setInt(20, fafoper);
                pst.setInt(21, saoper);
                pst.setInt(22, satper);
                pst.setInt(23, fees);
                pst.setString(24, pwd);
                
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    response.sendRedirect("admin.jsp"); 
                } else {
                    response.sendRedirect("index.jsp"); 
                }


            } catch (NumberFormatException | SQLException | ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                response.sendRedirect("index.jsp"); 
            } finally {
                // Use the dispatcher object to forward the request
                if (dispatcher != null) {
                    dispatcher.forward(request, response);
                }
            }
        }
    }
