<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<h2>ssh注解版整合</h2>
<s:debug></s:debug>
<form  method="post" action="/add">
    姓名：<input type="text" name="studentSSH.name">
    <input type="submit" value="添加">
</form>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加成功</title>
</head>
<body>
<h2>add ok</h2>
</body>
</html>