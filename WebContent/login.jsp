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
    <title>��¼ҳ��</title>
  </head>
  <body>
   <center>
   <s:form action="login" namespace="/user" method="post">
   <s:textfield label="�û���" name="username"></s:textfield>
   <s:password label="����" name="password"></s:password>
   <s:checkbox label="�Զ���¼" name="userCookie" value="true"></s:checkbox>
   <s:submit value="�ύ"></s:submit>
   </s:form>
   </center>
  </body>
</html>
