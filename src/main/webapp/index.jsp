<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/28
  Time: 23:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/TestServlet?op=test" method="post">
    <input type="text" name="name" ><br>
    <button type="submit">submit</button>
</form>

</body>
</html>
