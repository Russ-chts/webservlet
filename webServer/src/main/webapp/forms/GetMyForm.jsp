<%--
  Created by IntelliJ IDEA.
  User: 趙子升
  Date: 2023/7/4
  Time: 下午 02:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <form action="http://localhost:8080/formHandling" method="get">
        <lable>Book Name:</lable>
        <input type="text" name="name">
        <br>
        <lable>Price:</lable>
        <input type="number" name="price">
        <br>
        <lable>Author:</lable>
        <input type="text" name="author">
        <br>
        <input type="submit" value="Submit">
  </form>
  </body>
</html>
