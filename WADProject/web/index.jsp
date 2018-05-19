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
    </head>
    <body>
        <%@include file="WEB-INF/jspf/navbar.jspf" %>
	<div id="index-page" class="container">
		<div class="col-lg-6">
			<div id="about" class="panel panel-default">
				<div class="panel-body">
					<h3>About</h3>
					<hr>
					<p>The Product is designed to be used by the Students at
						Different Universities in the World. Students often needs to keep
						a track of schedule of their classes and to know if a class is
						cancelled or rescheduled. The Class Scheduler Application is
						designed to provide Students with the functionality to have a
						mobile application that stores the entire schedule of the Student
						and providing Notifications some time before a class is actually
						scheduled to start. Also the Product will provide instant
						notification when a class is cancelled or rescheduled on their
						phone itself.</p>
				</div>
			</div>
		</div>
		<div class="col-lg-6">
			<div class="jumbotron">
				<h2 class="text-center">To Get Started</h2><br>
				<div class="row">
					<div class="col-lg-6 col-lg-offset-3">
						<p>
							<a href="register" class="btn btn-primary btn-block btn-md">
							Sign up</a>
						</p>
						<p>
							Or <a href="content/login.html">Login</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>