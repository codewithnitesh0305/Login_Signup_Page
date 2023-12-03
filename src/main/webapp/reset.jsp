<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="css/s.css"/>
    <style>
        body{ font: 14px sans-serif;
        margin:auto; 
        margin-top: 120px;
        width:500px; 
        background-color: blueviolet;
        color: black;
        
        
        }
        .wrapper{  border-style: solid;
        border-color: blue;
        border-radius: 30px;
        padding: 20px;  background-color: white;
        }
    </style>
</head>
<body>   
    <header id="header" class="transparent-nav" style="position: fixed;background-color: rgb(120, 70, 167); top: 0;">
			<div class="container">

				<div class="navbar-header">
					
					<!-- <div class="navbar-brand">
						<a class="logo" href="#" style="padding-bottom: 10px;">Career.ly</a>
					</div> -->
					

				</div>
			</div>
		</header>
		

    <div class="wrapper">
        <h2>Reset Password</h2>
        <p>Please fill out this form to reset your password.</p>
         <form action="updateServlet" method="post">
            <div class="form-group">
                <label><b>Email</b></label>
                <input type="text" name="email" class="form-control">
                <span class="invalid-feedback"></span>
            </div>  
            <div class="form-group">
                <label><b>New Password</b></label>
                <input type="password" name="new_password" class="form-control">
                <span class="invalid-feedback"></span>
            </div>
 <!--            <div class="form-group">
                <label><b>Confirm Password</b></label>
                <input type="text" name="confirm_password" class="form-control">
                <span class="invalid-feedback"></span>
            </div> -->
            <div class="form-group">
                <input type="submit" class="btn btn-primary" value="Submit">
                <a class="btn btn-link ml-2" href="index.jsp">Cancel</a>
            </div>
        </form>
    </div>    
</body>
</html>