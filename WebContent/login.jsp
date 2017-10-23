<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>登录页面</title>
  </head>
  <body>
   <center>
   <s:form action="login" namespace="/user" method="post">
   <s:textfield label="用户名" name="username"></s:textfield>
   <s:password label="密码" name="password"></s:password>
   <s:checkbox label="自动登录" name="userCookie" value="true"></s:checkbox>
   <s:submit value="提交"></s:submit>
   </s:form>
   </center>
  </body>
</html>
