<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>结果</title>
</head>
<body>
<h2>欢迎:${user.username } </h2>
<h2>欢迎您,${sessionScope.user.username }</h2>
<a href="test">跳转</a>
</body>
</html>