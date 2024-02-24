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

@WebServlet("/loginpage")
public class loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<String> user = new ArrayList<>();
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		String uname = request.getParameter("username");
   		String fname = request.getParameter("fathername");
   		String pwd = request.getParameter("password");
   		Connection con = null;
   		HttpSession session = request.getSession();
   		RequestDispatcher dispatcher =null;
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sartaj?useSSL=false", "root", "789353sar");
		    PreparedStatement pst = con.prepareStatement("select * from student where sname = ? and fname = ? and pwd = ?");
		    pst.setString(1, uname);
		    pst.setString(2, fname);
		    pst.setString(3, pwd);

		    
		    ResultSet rs = pst.executeQuery();
		    if(rs.next()) {
		    	session.setAttribute("faoper",rs.getInt("faoper"));
		    	session.setAttribute("fatper",rs.getInt("fatper"));
		    	session.setAttribute("fathper",rs.getInt("fathper"));
		    	session.setAttribute("fafoper",rs.getInt("fafoper"));
		    	session.setAttribute("saoper",rs.getInt("saoper"));
		    	session.setAttribute("satper",rs.getInt("satper"));
		    	session.setAttribute("addno",rs.getString("addno"));
		    	session.setAttribute("sname",rs.getString("sname"));
		    	session.setAttribute("fname",rs.getString("fname"));
		    	session.setAttribute("mname",rs.getString("mname"));
		    	session.setAttribute("class",rs.getString("class"));
		    	session.setAttribute("grade",rs.getString("grade"));
		    	session.setAttribute("attandence",rs.getInt("attendence"));
		    	session.setAttribute("overallper",rs.getInt("overallper"));
		    	session.setAttribute("acedemicper",rs.getInt("acdemicper"));
		    	session.setAttribute("activityper",rs.getInt("activityper"));
		    	session.setAttribute("fao",rs.getString("fao"));
		    	session.setAttribute("fat",rs.getString("fat"));
		    	session.setAttribute("fath",rs.getString("fath"));
		    	session.setAttribute("fafo",rs.getString("fafo"));
		    	session.setAttribute("sao",rs.getString("sao"));
		    	session.setAttribute("sat",rs.getString("sat"));



		    	dispatcher = request.getRequestDispatcher("index.jsp");
		    }else {
		    	request.setAttribute("status","failed");
		    	dispatcher = request.getRequestDispatcher("loginpage.jsp");
		    }


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		    // Use the dispatcher object to forward the request
		    if (dispatcher != null) {
		        dispatcher.forward(request, response);
		    }
   	}

   	}}
