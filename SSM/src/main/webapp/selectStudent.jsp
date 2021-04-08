<%--
  Created by IntelliJ IDEA.
  User: Virgeo
  Date: 2021/2/19
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询学生</title>
</head>
<body>
<div align="center">
    <h2>查询学生</h2>
    <br/><br/>
</div>
<div align="center">
    学号&nbsp;&nbsp;<input type="text" name="id" value="${student.id}" disabled="disabled"/><br/><br/>
    姓名&nbsp;&nbsp;<input type="text" name="name" value="${student.name}" disabled="disabled"/><br/><br/>
    年龄&nbsp;&nbsp;<input type="text" name="age" value="${student.age}" disabled="disabled"/><br/><br/>
</div>
<div align="center">
    <a href="allStu.ctrl">返回全部学生</a>
</div>
</body>
</html>
