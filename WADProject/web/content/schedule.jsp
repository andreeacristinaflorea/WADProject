<%@page import="java.util.Calendar"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.util.Locale"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="dao.CourseDAO"%>
<%@page import="Classes.Course"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Today's schedule</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="../WEB-INF/jspf/assets.jspf" %>
        <link rel="stylesheet" type="text/css" href="../css/login.css"></link>
    </head>
    <body>
            <%@include file="../WEB-INF/jspf/navbar.jspf" %>

        <%--
        <%
        String action=request.getParameter("act");
        if (action != null && action.compareTo("ok") == 0)
        {
        Date d = new Date(05,05,2018);
        Date nd= new Date(d.getYear(),d.getMonth(),d.getDay());
        course.insertAssignment(request.getParameter("txt"), nd, "s", "saa", "asda", nd, "asac");
        }
        %>
        --%>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
	<div class="row">
		<div class="col-md-4" class="alert alert-success alert-dismissable" >
                     <c:if test="${courseSchedule != null && not empty courseSchedule}"> 

                            <c:forEach var="course" items="${courseSchedule}">
                                <c:set var = "string0" value = "${course}" />
                                <c:set var = "string1" value = "${fn:split(string0, ',')}"/>
                                <c:set var="string2" value="${string1[0]}" />
                                <c:set var = "string3" value = "${string1[1]}" />
                                <c:set var = "string4" value = "${string1[2]}" />
                                <c:set var = "string5" value = "${string1[3]}" />
                                <c:set var = "string6" value = "${string1[4]}" />
                                <c:set var = "string7" value = "${string1[5]}" />

                                
                            <div  >
                                <div class="col-md-6" class="h-100 d-inline-block">
                                     <ul style="list-style-type:none">
                                        <li>${string6}</li>
                                        <li>${string7}</li>
                                     </ul> 
                                </div>
                                     
                                <div class="col-md-6" class="h-100 d-inline-block">
                                     <ul style="list-style-type:none">
                                        <li >${string3}</li>
                                        <li><strong>${string2}</strong></li>
                                        <li>${string4} ${string5}</li>
                                     </ul> 
                                </div>
                                    
                            </div>
                            </c:forEach>
                    </c:if>
            
            
        </div>
	</div>
</div>
</body>
</html>
