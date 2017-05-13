<%--
  Created by IntelliJ IDEA.
  User: allentang
  Date: 2017/5/11
  Time: 下午9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>查询书籍</title>
  </head>
  <body>
  <h1>按类别查找</h1>
  <form action="book.action" method="post">
    书籍类型:<input type="text" name="type">
    <input type="submit" value="查询">
  </form>
  </body>
</html>
