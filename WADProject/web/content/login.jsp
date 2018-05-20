<%@page import="java.util.Collection"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Login to Class Scheduler</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="../WEB-INF/jspf/assets.jspf" %>
        <link rel="stylesheet" type="text/css" href="../css/login.css"></link>
    </head>
    <body>
            <%@include file="../WEB-INF/jspf/navbar.jspf" %>
            <div class="container">
                    <h2 id="login-heading" class="text-center">Login</h2>
                    <div class="col-lg-8 col-lg-offset-2">
                            <div class="col-lg-8 col-lg-offset-2">
                                    <div class="panel panel-default">
                                            <div class="panel-body form-panel">
                                                    <form action="LoginController" role="form" method="post">
                                                            <div class="form-group">
                                                                    <label for="username">Username</label>
                                                                    <input type="text" name="username" id="username"
                                                                            placeholder="Username" class="form-control" required>
																
                                                            </div>
                                                            <div class="form-group">
                                                                    <label for=\"password"\>Password</label>
                                                                    <input type="password" name="password" id="password"
                                                                            placeholder="Password" class="form-control" required>
                                                            </div>
                                                            <c:if test ="${not empty requestScope.errors}" >
                                                                <c:forEach items="${requestScope.errors}" var="error">  
                                                                    ${error} 
                                                                    </br>
                                                                </c:forEach>
                                                            </c:if> 
                                                            <div class="form-group">
                                                                    <button type="button" method="execute" value="Login" class="btn btn-success btn-block btn-login">
                                                                            Login
                                                                    </button>
                                                            </div>

                                                            <div class="form-links">
                                                                    <a href="register.jsp">Sign up</a>
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