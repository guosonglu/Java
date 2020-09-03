<%@ page import="java.util.List" %>
<%@ page import="cn.com.lgs.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/5
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>

<%--引入JSTL标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" errorPage="500.jsp" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%
    System.out.println(request.getContextPath());
    request.setAttribute("name", "zhangsan");
    session.setAttribute("name", "lisi");
    session.setAttribute("age", 18);
    session.setAttribute("num", 3);
    //插入对象
    User user = new User();
    user.setName("张三");
    user.setAge(22);
    user.setDate(new Date());
    session.setAttribute("user", user);
    //插入集合
    ArrayList<String> strings = new ArrayList<>();
    strings.add("111");
    strings.add("222");
    strings.add("333");
    session.setAttribute("list", strings);
%>
<%@ include file="zi.jsp" %>
<br>
<%--  EL表达式--%>
${3+4}<br>
${3>4}<br>
<%--  获取域中值--%>
${name}<br>
${age}<br>
${sessionScope.name}<br>
<%--EL表达式获取对象--%>
${user.age}<br>
<%--El表达式获得集合--%>
${list[1]}<br>

<%--JSTL标签使用--%>
<%--if标签--%>
<c:if test="true">
    显示
</c:if>
<c:if test="false">
    不显示
</c:if>
<c:if test="${not empty list}">
    strings集合不为空
</c:if>
<c:if test="${empty list}">
    strings集合为空
</c:if>
<%--choose标签--%>
<c:choose>
    <c:when test="${num==1}">星期一</c:when>
    <c:when test="${num==2}">星期二</c:when>
    <c:when test="${num==3}">星期三</c:when>
    <c:when test="${num==4}">星期四</c:when>
    <c:when test="${num==5}">星期五</c:when>
    <c:when test="${num==6}">星期六</c:when>
    <c:when test="${num==7}">星期日</c:when>
    <c:otherwise>输入数字有误</c:otherwise>
</c:choose><br>
<%--foreach标签--%>
<c:forEach begin="1" end="10" var="i" step="2" varStatus="s">
    ${i} ${s.index} ${s.count}<br>
</c:forEach>
<c:forEach items="${list}" var="string">
    ${string}<br>
</c:forEach>
</body>
</html>
