<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/5
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" errorPage="500.jsp" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    System.out.println(request.getContextPath());
    request.setAttribute("name","zhangsan");
    session.setAttribute("name","lisi");
    session.setAttribute("age",18);
  %>
  <%@ include file="zi.jsp"%><br>
<%--  EL表达式--%>
  ${3+4}<br>
  ${3>4}<br>
<%--  获取域中值--%>
  ${name}<br>
  ${age}<br>
  ${sessionScope.name}<br>
  $END$12
  </body>
</html>
