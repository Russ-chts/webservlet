<%--
  Created by IntelliJ IDEA.
  User: 趙子升
  Date: 2023/7/5
  Time: 下午 02:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <%
    double jpn = 4.65;
    double usd = 0.03;
    double cny = 0.23;
    int amount = Integer.parseInt(request.getParameter("amount"));
  %>

  <h2>美金:<%= amount * usd %></h2>
  <h2>日幣:<%= amount * jpn %></h2>
  <h2>人民幣:<%= amount * cny %></h2>
  </body>
</html>
