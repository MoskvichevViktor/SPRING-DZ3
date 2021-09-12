<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html> xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Add</title>
</head>

<body>

    <form:form action="@{'/products/add'}" model.addAttribute="product" object="${product}" method="post">

        <p> ID: <form:input type="text" path="id" /></p>

        <p> NAME: <form:input type="text" path="title"  /></p>

        <p> PRICE: <form:input type="text" path="cost" /></p>

        <button type="submit">Save</button>

    </form>

</body>
</html>
