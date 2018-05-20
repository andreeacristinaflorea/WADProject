<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Class Scheduler</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600,300' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
        
	<link rel="stylesheet" type="text/css" href="css/index.css" />
        <link rel="stylesheet" type="text/css" href="css/slideshow.css" />
    </head>
    <body>
        <%@include file="WEB-INF/jspf/navbarIndex.jspf" %>
	<div id="index-page" class="container">
		<div class="col-lg-8">
			<div id="about" class="panel panel-default">
				<div class="panel-body">
					<div class="slideshow-container">
                                            <div class="mySlides fade">
                                              <img src="img/1.jpg" style="width:100%">
                                            </div>
                                            <div class="mySlides fade">
                                              <img src="img/2.jpg" style="width:100%">
                                            </div>
                                            <div class="mySlides fade">
                                              <img src="img/3.jpg" style="width:100%">
                                            </div>
                                        </div>
                                        <br>
                                        <div style="text-align:center">
                                          <span class="dot"></span> 
                                          <span class="dot"></span> 
                                          <span class="dot"></span> 
                                        </div>
				</div>
			</div>
		</div>
		<div class="col-lg-4">
			<div class="jumbotron">
				<h2 class="text-center">To Get Started</h2><br>
				<div class="row">
					<div class="col-lg-6 col-lg-offset-3">
						<p>
							<a href="content/register.jsp" class="btn btn-primary btn-block btn-md">
							Sign up</a>
						</p>
						<p>
							Or <a href="content/login.jsp">Login</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
        <%@include file="WEB-INF/jspf/footerIndex.jspf" %>
        <script type="text/javascript" src="js/slideshow.js"></script>
</body>
</html>