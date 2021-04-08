<%--
  Created by IntelliJ IDEA.
  User: Virgeo
  Date: 2021/2/19
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<div align="center">
    <h2>添加学生</h2>
    <br/><br/>
</div>
<div align="center">
    <form action="stu/insertStu.ctrl" method="post">
        学号&nbsp;&nbsp;<input type="text" name="id"/><br/><br/>
        姓名&nbsp;&nbsp;<input type="text" name="name"/><br/><br/>
        年龄&nbsp;&nbsp;<input type="text" name="age"/><br/><br/>
        <input type="submit" value="添加"/>
    </form>
</div>
<div align="center">
    <a href="stu/allStu.ctrl">返回全部学生</a>
</div>
</body>
</html>
