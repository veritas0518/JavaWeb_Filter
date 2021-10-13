<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/9/12
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是登入页面，login.jsp页面<br>
<form action="http://localhost:8080/Filter/loginServlet" method="get">
    用户名：<input type="text" name="username"><br>
    密 码：<input type="password" name="password"><br>
    <input type="submit">
</form>
</body>
</html>
