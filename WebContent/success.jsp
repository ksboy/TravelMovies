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
    <title>��¼�ɹ���</title>
  </head>
  <body>
    <h1>��ӭ���ĵ�����</h1><br>
    <s:a action="login!logout.action" namespace="/user"> ��ȫ�˳�</s:a>
  </body>
</html>
