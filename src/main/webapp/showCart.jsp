<%@ page import="logic.Cart" %><%--
  Created by IntelliJ IDEA.
  User: artem
  Date: 28.03.2024
  Time: 09:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@page import="logic.Cart" %>

<% Cart cart =  (Cart)session.getAttribute("cart"); %>

<p> Наименование: <%= cart.getName() %></p>
<p> Количество: <%= cart.getQuantity() %></p>

</body>
</html>
