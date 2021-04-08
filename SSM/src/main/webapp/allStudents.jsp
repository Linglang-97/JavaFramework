<%--
  Created by IntelliJ IDEA.
  User: Virgeo
  Date: 2021/2/19
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>学生管理系统</title>
    <script src="https://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="https://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="https://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>
<body>
<div align="center">
    <h1>学生管理系统</h1>
    <br/>
    <h3>一共有&nbsp;<b style="color: red">${count}</b>&nbsp;名学生</h3>
    <h4><p style="color: blueviolet">${param.queryMsg}</p></h4>
    <h4><p style="color: blueviolet">${param.insertMsg}</p></h4>
    <h4><p style="color: blueviolet">${param.updateMsg}</p></h4>
    <h4><p style="color: blueviolet">${param.deleteMsg}</p></h4>
</div>
<table style="width:500px; margin:44px auto" class="table table-striped table-bordered table-hover  table-condensed"
       align='center' border='1' cellspacing='0'>
    <tr align="center">
        <td>学号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>详情</td>
        <td>更新</td>
        <td>删除</td>
    </tr>
    <c:forEach items="${students}" var="student" varStatus="st">
        <tr align="center">
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td><a href="selectStu.ctrl?id=${student.id}">详情</a></td>
            <td><a href="../updateStudent.jsp?id=${student.id}&name=${student.name}&age=${student.age}">更新</a></td>
            <td><a href="deleteStu.ctrl?id=${student.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
<div align="center">
    <a href="../insertStudent.jsp" style="font-size: medium">添加学生</a>
</div>
</body>
</html>
