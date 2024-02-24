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

@WebServlet("/stafflogin")
public class stafflogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uname = request.getParameter("username");
        String upwd = request.getParameter("password");
        Connection con = null;
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sartaj?useSSL=false", "root", "789353sar");
            PreparedStatement pst = con.prepareStatement("select * from user where name = ? and pwd = ?");
            pst.setString(1, uname);
            pst.setString(2, upwd);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                session.setAttribute("name", rs.getString("name"));

              /*  PreparedStatement pst1 = con.prepareStatement("select * from student");
                ResultSet rs1 = pst1.executeQuery();

                List<Student> studentList = new ArrayList<>();
                while (rs1.next()) {
                    // Assuming you have a 'Student' class with appropriate getters and setters
                	Student student = new Student(upwd, upwd,upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd, upwd);
                	student.setSname(rs1.getString("sname"));
                    student.setFanme(rs1.getString("fname"));
                    student.setManme(rs1.getString("mname"));
                    student.setAddno(rs1.getString("addno"));
                    student.setSsalc(rs1.getString("class"));
                    student.setGarde(rs1.getString("grade"));
                    student.setAttendence(rs1.getString("attendence"));
                    student.setOverallper(rs1.getString("overallper"));
                    student.setAcedemicper(rs1.getString("acdemicper"));
                    student.setActivityper(rs1.getString("activityper"));
                    student.setFao(rs1.getString("fao"));
                    student.setFat(rs1.getString("fat"));
                    student.setFath(rs1.getString("fath"));
                    student.setFafo(rs1.getString("fafo"));
                    student.setSao(rs1.getString("sao"));
                    student.setSat(rs1.getString("sat"));
                    student.setFaoper(rs1.getString("faoper"));
                    student.setFatper(rs1.getString("fatper"));
                    student.setFathper(rs1.getString("fathper"));
                    student.setFafoper(rs1.getString("fafoper"));
                    student.setSaoper(rs1.getString("saoper"));
                    student.setSatper(rs1.getString("satper"));
                    student.setPwd(rs1.getString("pwd"));
                    student.setFees(rs1.getString("fees"));
                    
                    // Set other properties as per your 'Student' class
                    studentList.add(student);
                }

                // Store the list in the session
                session.setAttribute("studentList", studentList);
*/
                response.sendRedirect("admin.jsp"); 
            } else {
                request.setAttribute("status", "failed");
                response.sendRedirect("StaffLogin.jsp"); 
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
