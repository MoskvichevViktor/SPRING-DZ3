<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Orders</title>
    </head>
    <body>
        <h1>Orders</h1>
        <ul>
            <li>
                <c:forEach items="${orders}" var="order">
                    <p>ID: ${order.id}</p>
                    <p>NAME: ${order.date}</p>
                    <p>PRICE: ${order.cost}</p>
                </c:forEach>
            </li>


        </ul>

    </body>
</html>