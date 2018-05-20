<%@page import="java.util.Collection"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Signup - Class Scheduler</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="../WEB-INF/jspf/assets.jspf" %>
        <link rel="stylesheet" type="text/css" href="../css/login.css"></link>
    </head>
    <body>
         <%@include file="../WEB-INF/jspf/navbar.jspf" %>
	<div class="container">
		<h2 id="login-heading" class="text-center">Sign up</h2>
		<div class="col-lg-8 col-lg-offset-2">
			<div class="col-lg-10 col-lg-offset-1">
				<div class="panel panel-default">
					<div class="panel-body form-panel">
						
					
						<form action="RegisterController" method="post">
							<div class="form-group">
								<label for="name">Name</label>
								<input type="text" name="name" id="name"
											placeholder="Name" class="form-control" required>
							</div>
							<div class="form-group">
								<label for="email">Email</label>
								<input type="email" name="email" id="email"
											placeholder="Email" class="form-control" required>
							</div>
							
							<div class="form-group">
								<label for="faculty">Faculty</label>
								<select name="faculty" class="form-control choice">
								  <option value="cti">Computer science</option>
								  <option value="etti">Electronics</option>
								  <option value="mechanics">Mechanics</option>
								  <option value="chemistry">Chemistry</option>
								</select>
							</div>
							<div class="form-group">
								<label for="username">Username</label>
								<input type="text" name="username" id="username"
											placeholder="Username" class="form-control" required>
							</div>
							
							<div class="form-group">
								<label for="password">Password</label>
								<input type="password" name="password" id="password"
											placeholder="Password" class="form-control" required>
							</div>
							<div class="form-group">
								<label for="repeatPassword">Repeat password</label>
								<input type="password" name="repeatPassword" id="repeatPassword"
											placeholder="Password" class="form-control" required>
							</div>
							<div class="form-group">
								<button type="button" method="execute" value="Register" class="btn btn-success btn-block btn-login">
									Register
								</button>
							</div>
					
						</form>
						
						
					</div>
				</div>
			</div>
		</div>
	</div>
        <%@include file="/WEB-INF/jspf/footer.jspf" %>
</body>
</html>