<%--
  Created by IntelliJ IDEA.
  User: TrueVlad
  Date: 10.03.2022
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>


        <%@page import="logic.TestClass, java.util.Date" %>>  // применяем директиву для импорта класса

        <%
            for (int i =0; i<10; i++){
                out.println("<p>" + "Привет : " + i + "</p>");
            }

            TestClass testClass = new TestClass();

            String name = request.getParameter("name");
        %>

        <%=
        new Date()
        %>

        <%=
        "<p>" + testClass.getInfo() + "</p>"
        %>

        <%=
        "<p>" + "Hello " + name + "</p>"
        %>



    </p>
</body>
</html>


