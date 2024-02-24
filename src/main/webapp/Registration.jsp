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
						<form method="post" action="Registration" class="register-form"
							id="login-form">
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="sname" id="sname"
									placeholder="Student Name" />
							</div>
						    <div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fname" id="fname"
									placeholder="Student's Father Name" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="mname" id="mname"
									placeholder="Student's Mother Name" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="ssalc" id="ssalc"
									placeholder="Class" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="grade" id="grade"
									placeholder="Grade" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="attendence" id="attendence"
									placeholder="Attendence %" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="activityper" id="activityper"
									placeholder="Activity %" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="academicper" id="academicper"
									placeholder="Academic %" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="overallper" id="overallper"
									placeholder="OverAll %" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fao" id=fao
									placeholder="FA1 Grade" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="faoper" id="faoper"
									placeholder="FA1 %" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fat" id="fat"
									placeholder="FA2 Grade" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fatper" id="fatper"
									placeholder="FA2%" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fath" id="fath"
									placeholder="FA3 Grade" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fathper" id="fathper"
									placeholder="FA3 %" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fafo" id="fafo"
									placeholder="FA4 Grade" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fafoper" id="fafoper"
									placeholder="FA %" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="sao" id="sao"
									placeholder="SA1 Grade" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="saoper" id="saoper"
									placeholder="SA1 %" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="sat" id="sat"
									placeholder="SA2 Grade" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="satper" id="satper"
									placeholder="SA2 %" />
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="fees" id="fees"
									placeholder="Fee Due" />
							</div>
							<div class="form-group">
								<label for="password"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="pwd" id="pwd"
									placeholder="Password" />
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit" value="Register" />
							</div>
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
	
</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>