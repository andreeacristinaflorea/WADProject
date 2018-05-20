<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Overview</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="../WEB-INF/jspf/assets.jspf" %>
        <link rel="stylesheet" type="text/css" href="../css/login.css"></link>
    </head>
    <body>
        <nav  class="navbar navbar-default navbar-custom navbar-fixed-top" role="navigation">
            <div class="col-lg-8">
                    <a href="overview.jsp" class="navbar-brand">Class Scheduler</a>
            </div>
            <div class="col-lg-4">
                    <ul class="nav navbar-nav navbar-right">
                         <li><a href="../content/logout.jsp">Logout</a></li>
                    </ul>
            </div>
        </nav>
        <div class="container-fluid">
            <div class="col-lg-4">
                <%@include file="../content/schedule.jsp" %>
            </div>
            <div class="col-lg-4" onclick="../index.jsp">
                <%@include file="calendar.jsp" %>
                <div class="form-group">
                    <a href="../content/assignment.jsp" class="btn btn-primary btn-block btn-md"><b style="color: white;">Add assignment</b></a>
                </div>
            </div>
            <div class="col-lg-4">
                <%@include file="../content/assignmentView.jsp" %>
            </div>
            
        </div>
        <%@include file="/WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
