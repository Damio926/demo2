<%--
  Created by IntelliJ IDEA.
  User: 20835
  Date: 2020/9/13
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/login" method="post">
    name:<input type="text" name="username" placeholder="请输入用户名"><br/>
    password:<input type="password" name="password" placeholder="请输入密码"><br/>
    <button type="submit">登录</button>
</form>
</body>
</html>
