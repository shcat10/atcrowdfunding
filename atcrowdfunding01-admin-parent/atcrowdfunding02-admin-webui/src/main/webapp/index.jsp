<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试页面</title>
    <script type="text/javascript" src="jQuery/jquery-3.5.1.min.js"></script>
    <script type="text/javascript" src="layer/layer.js"></script>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
    <script type="text/javascript">
        $(function (){
            $("#btn01").click(function (){
                $.ajax({
                    "url": "send/array1.do",
                    "type": "post",
                    "data": {
                        "array":[5,8,12]
                    },
                    "dataType": "text",
                    "success": function (response){
                        alert(response);
                    },
                    "error": function (response){
                        alert(response);
                    }
                });
            });
            $("#btn02").click(function (){
                // 准备好要发送到服务端的数组
                var array = [5,8,12];

                // 将JSON数组转换为JSON字符串
                var requestBody = JSON.stringify(array);
                $.ajax({
                    "url": "send/array2.do",
                    "type": "post",
                    "data": requestBody,
                    contentType: "application/json;character=UTF-8",
                    "dataType": "text",
                    "success": function (response){
                        alert(response);
                    },
                    "error": function (response){
                        alert(response);
                    }
                });
            });
            $("#btn03").click(function () {
                // 准备要发送的数据
                var student = {
                    stuId: 5,
                    stuNmae: "tom",
                    address: {
                        province: "江苏",
                        city: "南京",
                        street: "秣陵街道"
                    },
                    subjectList: [
                        {
                            subName: "java",
                            subScore: 100
                        },
                        {
                            subName: "c++",
                            subScore: 98
                        }
                    ],
                    map: {
                        key1: "value1",
                        key2: "value2"
                    }
                };
                // 将JSON对象转换为JSON字符串
                var requestBody = JSON.stringify(student);

                // 发送Ajax请求
                $.ajax({
                    url: "send/compose/object.do",
                    type: "post",
                    data: requestBody,
                    contentType: "application/json;character=UTF-8",
                    dataType: "json",
                    success: function (resp){
                        console.log(resp)
                    },
                    error: function (resp) {
                        console.log(resp)
                    }
                })
            });
            $("#btn04").click(function (){
                layer.msg("layer的弹框");
            });
        })
    </script>

</head>
<body>
<button id="btn01">Send text 1</button>
<button id="btn02">Send text 2</button>
<button id="btn03">Send text 3</button>
<button id="btn04">layer</button>
</body>
</html>