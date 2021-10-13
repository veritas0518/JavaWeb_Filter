<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/9/12
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    System.out.println("a.jsp页面执行了");
    Object user = session.getAttribute("user");
    //如果等与null,说明还没有登入
    if (user == null) {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        //一般请求转发后就不允许有任何代码了，所以这里return
        return;
    }

%>
我是a.jsp文件
</body>
</html>
