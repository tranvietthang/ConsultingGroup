<%-- 
    Document   : home
    Created on : Oct 26, 2020, 9:50:18 AM
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
                        <div class="section1">
                            <p class="home-welcome-title">${welcome.getTitle()}</p>
                            <img src="${welcome.getImage()}" class="home-welcome-image">
                            <p class="home-welcome-description">${welcome.getDescription()}</p>
                        </div>
                        <div class="section2">
                            <table>
                                <td class="home-service">
                                    <img src="${service.getImage()}" class="home-service-image">
                                    <a href="service" class="home-service-title">${service.getTitle()}</a>
                                    <p class="home-service-description">${service.getDescription()}</p>
                                </td>
                                <td class="home-contact">
                                    <img src="${contact.getImage()}" class="home-contact-image">
                                    <a href="contact" class="home-contact-title">${contact.getTitle()}</a>
                                    <p class="home-contact-description">${contact.getDescription()}</p>
                                </td>
                            </table>
                        </div>
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
