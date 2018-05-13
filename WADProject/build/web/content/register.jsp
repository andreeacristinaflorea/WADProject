<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <s:include value="assets.jsp"></s:include>
    <link rel="stylesheet" type="text/css" href="css/login.css"></link>
    <title>Signup - Class Scheduler</title>
</head>
<body>
	<s:include value="navbar.jsp"></s:include>
	<div class="container">
		<h2 id="login-heading" class="text-center">Sign up</h2>
		<div class="col-lg-8 col-lg-offset-2">
			<div class="col-lg-10 col-lg-offset-1">
				<div class="panel panel-default">
					<div class="panel-body form-panel">
						<s:if test="hasActionMessages()">
							<div class="alert alert-success alert-dismissible" role="alert">
								<button type="button" class="close" data-dismiss="alert">
									<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
								</button>
								<s:actionmessage cssStyle="list-style: none;" />
							</div>
						</s:if>
						<form action="RegisterController" method="post">
							<div class="form-group">
								<s:textfield name="name" key="global.name" placeholder="Name"
									cssClass="form-control"></s:textfield>
								<s:fielderror fieldName="name" cssClass="fieldError" />
							</div>
							<div class="form-group">
								<s:textfield name="email" key="global.email" placeholder="Email"
									cssClass="form-control"></s:textfield>
								<s:fielderror fieldName="email" cssClass="fieldError" />
							</div>
							
							<div class="form-group">
								<s:textfield name="school" key="global.school"
									placeholder="Faculty" cssClass="form-control"></s:textfield>
								<s:fielderror fieldName="school" cssClass="fieldError" />
							</div>
							<div class="form-group">
								<s:textfield name="username" key="global.username"
									placeholder="Username" cssClass="form-control"></s:textfield>
								<s:fielderror fieldName="username" cssClass="fieldError" />
							</div>
							<div class="form-group">
								<s:password name="password" key="global.password"
									placeholder="Password" cssClass="form-control"></s:password>
								<s:fielderror fieldName="password" cssClass="fieldError" />
							</div>
							<div class="form-group">
								<s:password name="password_confirmation"
									key="global.password_confirmation"
									placeholder="Repeat Password" cssClass="form-control"></s:password>
								<s:fielderror fieldName="password_confirmation" cssClass="fieldError" />
							</div>
							<s:submit method="execute" value="Register"
								cssClass="btn btn-success btn-block btn-login" />
						</form>
						
						
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>