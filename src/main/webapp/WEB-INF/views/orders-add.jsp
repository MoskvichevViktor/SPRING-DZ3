<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html> xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Order</title>
</head>

<body>



        <form:form action="@{'/orders/add'}" model.addAttribute="orger" object="${order}" method="post">

            <p> ID: <form:input type="text" path="id" /></p>

            <p> NAME: <form:input type="text" path="title"  /></p>

            <p> PRICE: <form:input type="text" path="cost" /></p>

            <button type="submit">Save</button>

    </form:>

</body>
</html>
