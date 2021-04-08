<%--
  Created by IntelliJ IDEA.
  User: Virgeo
  Date: 2021/2/19
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新学生</title>
</head>
<body>
<div align="center">
    <h2>更新学生</h2>
    <br/><br/>
</div>
<div align="center">
    <form action="stu/updateStu.ctrl" method="post">
        学号&nbsp;&nbsp;<input type="text" name="id" value="${param.id}" readonly="readonly"/><br/><br/>
        姓名&nbsp;&nbsp;<input type="text" name="name" value="${param.name}"/><br/><br/>
        年龄&nbsp;&nbsp;<input type="text" name="age" value="${param.age}"/><br/><br/>
        <input type="submit" value="更新"/>
    </form>
</div>
<div align="center">
    <a href="stu/allStu.ctrl">返回全部学生</a>
</div>
</body>
</html>
