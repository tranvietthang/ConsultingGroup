<%-- /
    Document   : contact
    Created on : Oct 26, 2020, 5:18:01 PM
    Author     : ThangCoi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                        <div class="section5">
                            <c:if test="${arlet!=null}">
                                <input placeholder="${arlet}" class="${status == true ? 'success' : 'error'}" id="notice" readonly>
                            </c:if>
                            <p>Write your message here. Fill out the form:</p>

                            <form action="contact">
                                <input type="text" name="name" placeholder="Write your name here"
                                       id="name" value="${name}" required
                                       class="${status == true ? 'sent' : ''}">
                                <input type="text" name="email" placeholder="Write your email here"
                                       id="email" value="${email}" required
                                       class="${status == true ? 'sent' : ''}">
                                <textarea name="mess" placeholder="Write your message here"
                                          id="textarea" required class="${status == true ? 'sent-mess' : ''}">${mess}</textarea>
                                <button type="submit" id="button" 
                                        class="${status == true ? 'clicked' : ''}">
                                    ${status == true ? 'Sent - Click Here' : 'Sent'}
                                </button>
                            </form>
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
