<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!2</h2>
<button onclick="clickButton1()">开启Websocket</button>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="application/javascript">
    function clickButton1() {
        var connection = new WebSocket("ws://localhost:8080/wsTest");
        connection.onopen=function(event){
            alert("已建立连接");
        }
        connection.onclose=function(event){
            if (!event.wasClean)
                alert(event.code+':'+event.reason);
        }
        connection.onerror=function(event){
            alert("错误");
        }
        connection.onmessage=function(event){
            alert(event.data);
        }
    }
    
</script>
</body>
</html>
