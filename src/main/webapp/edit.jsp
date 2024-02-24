<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Log In Form </title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<input type = "hidden" id = "status" value = "<%= request.getAttribute("status")%>">

	<div class="main">

		<!-- Sing in  Form -->
		<section class="sign-in">
			<div class="container">
				<div class="signin-content">
					<div class="signin-image">
						<figure>
							<img src="images/signin-image.jpg" alt="sing up image">
						</figure>						
					</div>

					<div class="signin-form">
    						<h2 class="form-title">Registration Form</h2>
						<form method="get" action="Updation" class="register-form"
							id="login-form">
                                    <%@ page import="java.util.List" %>
                                   <%@ page import="com.login.students.Student" %> <!-- Adjust the package path accordingly -->
                                      <%int totalFees = 0;List<Student> studentList = (List<Student>) session.getAttribute("studentList");
                                      if (studentList != null) {
                                          for (Student student : studentList) {
							            %>
							 
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="sname" id="sname"
                                    value="<%= student.getSname() %>">									
                                     
									
							</div>
						    <div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fname" id="fname" 
                                    value="<%= student.getFanme() %>">									
 
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="mname" id="mname"
									value="<%= student.getManme() %>">								
									
							</div>
													<div>		<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="addno" id="addno"
                                    value="<%= student.getAddno() %>">									
                                     
									
							</div>
							
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="ssalc" id="ssalc"
									value="<%= student.getSsalc() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="grade" id="grade"
									value="<%= student.getGarde() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="attendence" id="attendence"
									value="<%= student.getAttendence() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="activityper" id="activityper"
									value="<%= student.getActivityper() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="academicper" id="academicper"
									value="<%= student.getAcedemicper() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="overallper" id="overallper"
									value="<%= student.getOverallper() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fao" id=fao
									placeholder="FA1 Grade"
									value="<%= student.getFao() %>">
									
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="faoper" id="faoper"
									value="<%= student.getFaoper() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fat" id="fat"
									value="<%= student.getFat() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fatper" id="fatper"
									value="<%= student.getFatper() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fath" id="fath"
									value="<%= student.getFath() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fathper" id="fathper"
									value="<%= student.getFathper() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fafo" id="fafo"
									value="<%= student.getFafo() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fafoper" id="fafoper"
									value="<%= student.getFafoper() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="sao" id="sao"
									value="<%= student.getSao() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="saoper" id="saoper"
									value="<%= student.getSaoper() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="sat" id="sat"
									value="<%= student.getSat() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="satper" id="satper"
									value="<%= student.getSatper() %>">
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fees" id="fees"
									value="<%= student.getFees() %>">
							</div>
							<div class="form-group">
								<label for="password"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="pwd" id="pwd"
									value="<%= student.getPwd() %>">
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit" value="Register" />
							</div>            <%
                    }
                }session.removeAttribute("studentList");%>
						</form>
																</div>
				</div>
			</div>
		</section>

	</div>

	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	<script type="text/javascript">
	var status = document.getElementById("status").value;
	if(status == "failed"){
		swal("sorry","Wrong username or password","error");
	}
	</script>
	
 <%@ page import="java.util.List" %>
<%@ page import="com.login.students.Student" %>
            
<% HttpSession session1 = request.getSession();
   String attributeName = "studentList";
   session1.removeAttribute(attributeName);
%>
    
</body>

</html>
