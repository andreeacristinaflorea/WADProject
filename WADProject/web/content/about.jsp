<%@page import="java.util.Collection"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>About us</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="../WEB-INF/jspf/assets.jspf" %>
        <link rel="stylesheet" type="text/css" href="../css/login.css"></link>
    </head>
    <body>
            <%@include file="../WEB-INF/jspf/navbar.jspf" %>
            	<div class="container">
		<div class="col-lg-10 col-lg-offset-1 ">
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
                    </div>
            <%@include file="/WEB-INF/jspf/footer.jspf" %>
    </body>
</html>