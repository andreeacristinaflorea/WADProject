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
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assignment</title>
        <%@include file="../WEB-INF/jspf/assets.jspf" %>
        <link rel="stylesheet" type="text/css" href="../css/login.css"> 
    </head>
    <body>
        <%@include file="../WEB-INF/jspf/navbar.jspf" %>
        <h2 id="login-heading" class="text-center">Assignment</h2>
		<div class="col-lg-8 col-lg-offset-2">
			<div class="col-lg-10 col-lg-offset-1">
				<div class="panel panel-default">
                                    <div class="panel-body form-panel">
                                        <form action="/WADProject/AssignmentController" method="post">
							<div class="form-group">
                                                            <c:if test="${courses != null && not empty courses}"> 
                                                                <label for="title">Choose course</label>
                                                                <select name="crs" class="form-control choice">
                                                                    <c:forEach var="course" items="${courses}">
                                                                        <option>${course}</option>
                                                                    </c:forEach>
                                                                </select><br>
                                                            </c:if>
                                                           </div>
                                                           <div class="form-group">
                                                            <label for="title">Title</label>
								<input type="text" name="title" id="title" class="form-control" required>
                                                            </div>
                                            
                                                            <div class="form-group">
                                                            <label>Description of the assignment</label><br>
                                                            <textarea name="txt" rows="7" cols="50" class="form-control" ></textarea><br>
                                                            </div>
                                            
                                                            <div class="form-group">
                                                            Due Date: <input type="date" id="dd" name="duedate" class="form-control" required><br>
                                                            </div>
                                                            
                                                            <div class="form-group">
                                                            Notify on: <input type="date" name="notifydate" class="form-control" required><br>
                                                            </div>
                                                            
                                                            <div class="form-group">
                                                            Type: 
                                                            <select name="tp" class="form-control choice">
                                                                <option id="hw">Homework</option>
                                                                <option id="prj">Project</option>
                                                                <option id="test">Test</option>
                                                                <option id="mdtrm">Midterm</option>
                                                                <option id="exm">Exam</option>
                                                            </select><br>
                                                            </div>
                                                            <div class="form-group">
                                                            Priority:
                                                            <select name="pr" class="form-control choice">
                                                                <option id="h">High</option>
                                                                <option id="m">Medium</option>
                                                                <option id="l">Unworthy</option>
                                                            </select><br>
                                                            </div>
                                                            <div class="form-group">
                                                            <button type="submit" name="ok" class="btn btn-success btn-block btn-login">OK</button>
                                                            </div>
						</form>
					</div>
				</div>
			</div>
		</div>
    </body>
</html>
