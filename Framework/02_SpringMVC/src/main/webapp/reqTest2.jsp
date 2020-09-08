<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/7
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script>
        var userList=new Array();
        userList.push({name:"zhangsan",age:23});
        userList.push({name:"lisi",age:24});
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/save11",
            data:JSON.stringify(userList),
            contentType:"application/json"
        })
    </script>
</head>
<body>

</body>
</html>
