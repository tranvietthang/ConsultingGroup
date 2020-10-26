<%-- /
    Document   : contact
    Created on : Oct 26, 2020, 5:18:01 PM
    Author     : ThangCoi
--%>

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
                        <div class="section4">
                            <p class="contact-name">Contact us</p>
                            <p class="contact-title">${contact.getTitle()}</p>
                            <p class="contact-description">${contact.getDescription()}</p>
                            <p class="address">Address:</p>
                            <p class="address">City:</p>
                            <p class="address">Country:</p>
                            <p class="address">Tel:123456</p>
                            <p class="address">Email: your-email@your-email.com</p>
                            <img src="${contact.getImage()}" class="contact-image">
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
