<%--
  Created by IntelliJ IDEA.
  User: sh
  Date: 2022.11.3
  Time: 16:14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
  <title>出错了....</title>
</head>
<body>

<h1>出错了！</h1>
<!-- 从请求域取出Exception对象，再进一步访问message属性就能显示错误消息 -->
${ requestScope.exception.message }
</body>
