<%@page import="com.DB.DBConnection" %>
<%@page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<style>
        body{
         font: 14px sans-serif;
        margin:auto; 
        margin-top: 120px;
        width:500px; 
        background-color: blueviolet;
        color: black;
        
        
        }
        .wrapper{ 
         border-style: solid;
        border-color: blue;
        border-radius: 30px;
        padding: 20px;  background-color: white;
        }
    </style>

</head>
<body>
<%-- <%
Connection conn = DBConnection.getConnection();
System.out.println(conn);
%> --%>
    <!--Header-->
    <header id="header" class="transparent-nav" style="position: fixed;background-color: rgb(120, 70, 167); top: 0;">
			<div class="container">

				<div class="navbar-header">
					<!-- Logo -->
				<!-- 	<div class="navbar-brand">
						<a class="logo" href="#" style="padding-bottom: 10px;">Careerguide.com</a>
					</div> -->
					<!-- /Logo -->

				</div>
			</div>
		</header>
		<!-- /Header -->

    <div class="wrapper">
        <h2>Sign Up</h2>
        <p>Please fill this form to create an account.</p>
        <form method="post" action="registerServlet">
            <div class="form-group">
                <label><b>Username</b></label>
                <input type="text" name="username" class="form-control">
                <span class="invalid-feedback"></span>
            </div>    
            <div class="form-group">
                <label><b>Email</b></label>
                <input type="text" name="email" class="form-control">
                <span class="invalid-feedback"></span>
            </div>
             <div class="form-group">
                <label><b>Password</b></label>
                <input type="password" name="password" class="form-control">
                <span class="invalid-feedback"></span>
            </div> 
            <div class="form-group">
                <input type="submit" class="btn btn-primary" value="Submit">
                <input type="reset" class="btn btn-secondary ml-2" value="Reset">
            </div>
            <p style="font-size: 16px;">Already have an account? <a href="login.jsp" style="color: blue;">Login here</a>.</p>
        </form>
    </div>    
</body>
</html>
</body>
</html>