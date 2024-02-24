<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>ADMIN</title>

    <!-- Custom fonts for this template -->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">

    <!-- Custom styles for this page -->
    <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
            <a style="color:white;"><img  style="border-radius: 50%; height: 70px; width: 70px;margin:1vmax;" src="assets/img/adminlogo.jpg"/><%=session.getAttribute("name")%>
            </a>

            <!-- Sidebar - Brand -->
            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item">
                <a class="nav-link" href="admin.jsp">
                    <i class="fas fa-fw fa-tachometer-alt"></i>
                    <span>Dashboard</span></a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <!-- Sidebar Toggler (Sidebar) -->
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div>

        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    
                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">

                        <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                        <li class="nav-item dropdown no-arrow d-sm-none">
                        </li>

                        <!-- Nav Item - Alerts -->
                        <li class="nav-item dropdown no-arrow mx-1">
                        </li>

                        <!-- Nav Item - Messages -->
                        <li class="nav-item dropdown no-arrow mx-1">
                        </li>

                        <div class="topbar-divider d-none d-sm-block"></div>

                        <!-- Nav Item - User Information -->
                        <li class="nav-item dropdown no-arrow">
                            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small"><%=session.getAttribute("name") %></span>
                                <img class="img-profile rounded-circle"
                                    src="img/undraw_profile.svg">
                            </a>
                            <!-- Dropdown - User Information -->
                            <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="userDropdown">
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Profile
                                </a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                    <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Logout
                                </a>
                            </div>
                        </li>

                    </ul>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->

                
                <div class="container-fluid">
                     <form method="post" action="TsblesUpadtedata"
                        class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                        <div class="input-group">
                            <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..."
                                 name="searchQuery" id ="searchQuery">
                            <div class="input-group-append">
                                <button class="btn btn-primary" type="button">
                                    <i class="fas fa-search fa-sm"></i>
                                </button>
                            </div>
                        </div>
                    </form>

                    <!-- Page Heading -->
                                        <form method="post" action="TsblesUpadtedata">
                        <!-- Your form fields go here -->
                        <!-- Example: -->
                        <input type="submit" value="Get All Data" style ="background-color:#4e73df; color:white; margin-right:2vmax;margin-top:2vmax;margin-bottom:2vmax; "class="form-control  border-0 small  "/>
                    </form>
                    
					
                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
                        </div>
                        <div class="card-body">
                        
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0" style="color:black;">
										<thead>
										  <tr>
												<th>Name</th>
												<th>Father</th>
												<th>Mother</th>
												<th>Admission No.</th>
												<th>Class</th>                                            
												<th>Grade</th>
												<th>Attendance %</th>
												<th>Academic %</th>
												<th>Activity %</th>
												<th>OverALL %</th>                                          
												<th>FA1</th>
												<th>FA1%</th>
												<th>FA2</th>
												<th>FA2%</th>
												<th>FA3</th>                                           
												<th>FA3%</th>
												<th>FA4</th>
												<th>FA4%</th>
												<th>SA1</th>
												<th>SA1%</th>                     
												<th>SA2</th>
												<th>SA2%</th>
												<th>FEE Due</th>
												<th>PWD</th>
												<th>EDIT</th>
												<th>DELETE</th>
										  </tr>
										</thead>
                                    <tbody>
                                    <%@ page import="java.util.List" %>
                                   <%@ page import="com.login.students.Student" %> <!-- Adjust the package path accordingly -->
                                      <%int totalFees = 0;int total = 0;int num = 1; HttpSession session1 = request.getSession();
                                      List<Student> studentList = (List<Student>) session.getAttribute("studentList");
                                      if (studentList != null) {
                                          for (Student student : studentList) {
							            %>
                        <tr>
                            <td><%= student.getSname() %></td>
                            <td><%= student.getFanme() %></td>
                            <td><%= student.getManme() %></td>
                            <td><%= student.getAddno() %></td>
                            <td><%= student.getSsalc() %></td>
                            <td><%= student.getGarde() %></td>
                            <td><%= student.getAttendence() %></td>
                            <td><%= student.getAcedemicper() %></td>
                            <td><%= student.getActivityper() %></td>
                            <td><%= student.getOverallper() %></td>                           
                            <td><%= student.getFao() %></td>
                            <td><%= student.getFaoper() %></td>
                            <td><%= student.getFat() %></td>
                            <td><%= student.getFatper() %></td>
                            <td><%= student.getFath() %></td>
                            <td><%= student.getFathper() %></td>
                            <td><%= student.getFafo() %></td>
                            <td><%= student.getFafoper() %></td>
                            <td><%= student.getSao() %></td>
                            <td><%= student.getSaoper() %></td>
                            <td><%= student.getSat() %></td>
                            <td><%= student.getSatper() %></td>
                            <td><%= student.getFees() %></td>
                            <td><%= student.getPwd() %></td>
							<td><a href="Edit?id=<%=student.getAddno()%>"
							>Edit</a></td>
                   			<td><a href="Delete?id=<%= student.getAddno() %>">Delete</a></td>
							<% totalFees += student.getFees(); %>
							<% total += num; %>                                                        
                        </tr>
            <%
                    }
                }
            %><p>Total amount of fee due in this academic <%= totalFees %></p>
            <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.login.students.Student" %>
            
<% String attributeName = "studentList";
   session1.removeAttribute(attributeName);
%>
                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

            <!-- Footer -->
            <footer class="sticky-footer bg-white">
                <div class="container my-auto">
                    <div class="copyright text-center my-auto">
                        <span>Copyright &copy; Your Website 2020</span>
                    </div>
                </div>
            </footer>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="logout">Logout</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="vendor/datatables/jquery.dataTables.min.js"></script>
    <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

    <!-- Page level custom scripts -->

</body>

</html>