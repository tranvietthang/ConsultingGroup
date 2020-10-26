<%-- 
    Document   : header
    Created on : Oct 25, 2020, 1:18:47 AM
    Author     : ThangCoi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="./css/header.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="title-wrap">
            <p class="title">Gray Consulting Group</p>
            <p class="subtitle">Welcome to our Website</p>
        </div>
        <div class="menu">
            <a href="home" class="${page == "Home" ? 'active' : ''}">Home</a>
            <a href="service" class="${page == "Service" ? 'active' : ''}">Services</a>
            <a href="contact" class="${page == "Contact" ? 'active' : ''}">Contact</a>
        </div>
    </body>
</html>
