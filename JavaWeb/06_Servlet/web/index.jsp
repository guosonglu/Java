<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/28
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="./demo4" method="post">
      <label>/demo4</label>
      <input type="text" name="name">
      <input type="submit" value="提交">
    </form>
    <form action="./request" method="post">
      <label>/request</label>
      <input type="text" name="name">
      <input type="password" name="password">
      <input type="submit" value="提交">
    </form>
    <form action="./request2" method="post">
      <label>转发</label>
      <input type="text" name="name">
      <input type="password" name="password">
      <input type="submit" value="提交">
    </form>
  </body>
</html>
