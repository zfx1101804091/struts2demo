<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<h2>ssh注解版整合</h2>
<s:debug></s:debug>
<h2>添加成功 登陆认证</h2>
<h3>
    <%--数据回显--%>
    用户名：<s:textfield name="count" value="%{#request.count}"></s:textfield><br/>
</h3>
</body>
</html>