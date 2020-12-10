var http=require("http");
var url=require("url");

http.createServer(function (request,response) {
    response.writeHead(200,{"Content-Type":"text/plain"});

    //获取请求参数
    var params=url.parse(request.url,true).query;
    for (var key in params){
        response.write(key+"="+params[key]+"\n");
    }

    response.write("Hello world\n");
    response.end("end\n");
}).listen(8888);
console.log("服务器运行在 http://127.0.0.1:8888");