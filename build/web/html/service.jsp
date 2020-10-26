<%-- 
    Document   : service
    Created on : Oct 26, 2020, 2:43:15 PM
    Author     : ThangCoi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="./css/style.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="wrap">
            <%@include file="header.jsp" %>
            <div class="content">
                <table>
                    <td class="left">
                        <c:forEach var="a" items="${service}">
                            <div class="section3">
                                <p class="service-title">${a.getTitle()}</p>
                                <img src="${a.getImage()}" class="${a.getImage() != "null" ? "service-image" : "service-imageNull"}">
                                <p class="service-content">${a.getContent()}</p>
                            </div>
                        </c:forEach>
                    </td>
                    <td class="right">
                        <%@include file="box.jsp" %>
                    </td>
                </table>
            </div>
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
