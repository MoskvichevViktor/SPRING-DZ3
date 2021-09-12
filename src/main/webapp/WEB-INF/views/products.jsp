
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Products</title>
    </head>
    <body>
        <h1>Products</h1>
        <ul>
            <c:forEach items="${products}" var="product">
                <li>
                    <p>ID: ${product.id}</p>
                    <p>NAME: ${product.title}</p>
                    <p>PRICE: ${product.cost}</p>
                </li>

            </c:forEach>

        </ul>

    </body>
</html>
