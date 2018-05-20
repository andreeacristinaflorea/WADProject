<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${assignms != null && not empty assignms}"> 

            <c:forEach var="assig" items="${assignms}">
                <c:set var = "string0" value = "${assig}" />
                <c:set var = "string1" value = "${fn:split(string0, ',')}"/>
                <c:set var = "string2" value = "${string1[0]}" />
                <c:set var = "string3" value = "${string1[1]}" />
                <c:set var = "string4" value = "${string1[2]}" />
            </c:forEach>
        </c:if>   
        
        <ul>
            <li>${string2}</li>
            <li>${string3}</li>
            <li>${string4}</li>
        </ul>
    </body>
</html>
