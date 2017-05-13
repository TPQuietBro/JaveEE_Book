<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="java.util.List" %>
<%@ page import="com.allen.Model.Book" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: allentang
  Date: 2017/5/11
  Time: 下午10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询成功</title>
</head>
<body>
<table border=10>
    <tr>
        <th>编号</th>
        <th>名称</th>
        <th>类型</th>
        <th>单价</th>
    </tr>
    <%
        //通过这种方式可以取出ActionContext中的map值
        List<Book> array =  (ArrayList<Book>)ActionContext.getContext().get("bookList");
        for (Book book:array) {
            %>
    <tr>
        <td height="30" width="100"><%=book.getId()%></td>
        <td height="30" width="100"><%=book.getName()%></td>
        <td height="30" width="100"><%=book.getPrice()%></td>
        <td height="30" width="100"><%=book.getType()%></td>

    </tr>

    <%
        }
    %>


</table>
</body>
</html>
