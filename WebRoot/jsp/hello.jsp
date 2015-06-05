<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title> | </title>
    <script type="text/javascript">
    	
    </script>
  </head>
  
  <body>
  
  <form action="sys/user" method="post">
    <input type="submit" value="我是添加方法">
  </form>
  <form action="sys/user" method="get">
    <input type="submit" value="我是查询方法">
  </form>
  <form action="sys/user" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="我是更新方法">
  </form>
  <form action="sys/user" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="我删除方法">
  </form>

  </body>
</html>
