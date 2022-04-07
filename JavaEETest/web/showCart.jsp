<%--
  Created by IntelliJ IDEA.
  User: TrueVlad
  Date: 22.03.2022
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--// применяем директиву для импорта класса--%>
    <%@ page import="somePackege.Cart" %>

    <% Cart cart = (Cart) session.getAttribute("cart"); %>
    <p> Quantity: <%= cart.getQuantity() %> </p>
    <p> Name: <%= cart.getName() %> </p>

</body>
</html>
