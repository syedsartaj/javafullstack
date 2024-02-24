package com.login.students;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentId = request.getParameter("id");
        Connection con = null;
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;
        String name = (String) session.getAttribute("name");
		String name1 = "mustafa";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sartaj?useSSL=false", "root", "789353sar");

        if(name != null) {
            PreparedStatement pst1 = con.prepareStatement("select * from student where addno =?");
            pst1.setString(1,studentId);
            ResultSet rs1 = pst1.executeQuery();
            List<Student> studentList = new ArrayList<>();
            while (rs1.next()) {
                String upwd = null;
                int pwd = 0 ;
				// Assuming you have a 'Student' class with appropriate getters and setters
                Student student = new Student(upwd, upwd,upwd, upwd, upwd, upwd, pwd, pwd, pwd, pwd, upwd, upwd, upwd, upwd, upwd, upwd, pwd, pwd, pwd, pwd, pwd, pwd, upwd, pwd);
            	student.setSname(rs1.getString("sname"));
                student.setFanme(rs1.getString("fname"));
                student.setManme(rs1.getString("mname"));
                student.setAddno(rs1.getString("addno"));
                student.setSsalc(rs1.getString("class"));
                student.setGarde(rs1.getString("grade"));
                student.setAttendence(rs1.getInt("attendence"));
                student.setOverallper(rs1.getInt("overallper"));
                student.setAcedemicper(rs1.getInt("acdemicper"));
                student.setActivityper(rs1.getInt("activityper"));
                student.setFao(rs1.getString("fao"));
                student.setFat(rs1.getString("fat"));
                student.setFath(rs1.getString("fath"));
                student.setFafo(rs1.getString("fafo"));
                student.setSao(rs1.getString("sao"));
                student.setSat(rs1.getString("sat"));
                student.setFaoper(rs1.getInt("faoper"));
                student.setFatper(rs1.getInt("fatper"));
                student.setFathper(rs1.getInt("fathper"));
                student.setFafoper(rs1.getInt("fafoper"));
                student.setSaoper(rs1.getInt("saoper"));
                student.setSatper(rs1.getInt("satper"));
                student.setFees(rs1.getInt("fees"));
                student.setPwd(rs1.getString("pwd"));
                
                // Set other properties as per your 'Student' class
                studentList.add(student);
            }
            session.setAttribute("id", studentId);

            session.setAttribute("studentList", studentList);
            response.sendRedirect("edit.jsp"); 

 //           dispatcher = request.getRequestDispatcher("table.jsp");
        } else {
            request.setAttribute("status", "failed");
            dispatcher = request.getRequestDispatcher("loginpage.jsp");
        }con.close();
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } finally {
        // Use the dispatcher object to forward the request
        if (dispatcher != null) {
            dispatcher.forward(request, response);
        }
    }
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentId = request.getParameter("id");
        Connection con = null;
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;
        String name = (String) session.getAttribute("name");
		String name1 = "mustafa";
		
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sartaj?useSSL=false", "root", "789353sar");

        if(name != null) {
            PreparedStatement pst1 = con.prepareStatement("select * from student where addno =?");
            pst1.setString(1,studentId);
            ResultSet rs1 = pst1.executeQuery();
            List<Student> studentList = new ArrayList<>();
            while (rs1.next()) {
                String upwd = null;
                int pwd = 0 ;
				// Assuming you have a 'Student' class with appropriate getters and setters
                Student student = new Student(upwd, upwd,upwd, upwd, upwd, upwd, pwd, pwd, pwd, pwd, upwd, upwd, upwd, upwd, upwd, upwd, pwd, pwd, pwd, pwd, pwd, pwd, upwd, pwd);
            	student.setSname(rs1.getString("sname"));
                student.setFanme(rs1.getString("fname"));
                student.setManme(rs1.getString("mname"));
                student.setAddno(rs1.getString("addno"));
                student.setSsalc(rs1.getString("class"));
                student.setGarde(rs1.getString("grade"));
                student.setAttendence(rs1.getInt("attendence"));
                student.setOverallper(rs1.getInt("overallper"));
                student.setAcedemicper(rs1.getInt("acdemicper"));
                student.setActivityper(rs1.getInt("activityper"));
                student.setFao(rs1.getString("fao"));
                student.setFat(rs1.getString("fat"));
                student.setFath(rs1.getString("fath"));
                student.setFafo(rs1.getString("fafo"));
                student.setSao(rs1.getString("sao"));
                student.setSat(rs1.getString("sat"));
                student.setFaoper(rs1.getInt("faoper"));
                student.setFatper(rs1.getInt("fatper"));
                student.setFathper(rs1.getInt("fathper"));
                student.setFafoper(rs1.getInt("fafoper"));
                student.setSaoper(rs1.getInt("saoper"));
                student.setSatper(rs1.getInt("satper"));
                student.setFees(rs1.getInt("fees"));
                student.setPwd(rs1.getString("pwd"));
                
                // Set other properties as per your 'Student' class
                studentList.add(student);
            }
            session.setAttribute("id", "studentId");

            session.setAttribute("studentList", studentList);
            response.sendRedirect("edit.jsp"); 

 //           dispatcher = request.getRequestDispatcher("table.jsp");
        } else {
            request.setAttribute("status", "failed");
            dispatcher = request.getRequestDispatcher("loginpage.jsp");
        }con.close();
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } finally {
        // Use the dispatcher object to forward the request
        if (dispatcher != null) {
            dispatcher.forward(request, response);
        }
    }
}
}
