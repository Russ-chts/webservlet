<%--
  Created by IntelliJ IDEA.
  User: 趙子升
  Date: 2023/7/5
  Time: 下午 02:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Obj.Currency" %>
<%@ page errorPage="error.jsp" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <%
    int amount = Integer.parseInt(request.getParameter("amount"));
    Currency currency = new Currency(amount);
  %>

  <h2>美金:<%= currency.getUsd() %></h2>
  <h2>日幣:<%= currency.getJpn() %></h2>
  <h2>人民幣:<%= currency.getCny() %></h2>
  </body>
</html>
