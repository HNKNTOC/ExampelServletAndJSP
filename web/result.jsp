<%@ page import="java.util.List" %>
<%@ page import="ru.kamyshenko.servlet.MainServlet" %><%--
  Created by IntelliJ IDEA.
  User: Nikita
  Date: 04.12.2016
  Time: 0:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
Beer selection:
<%
    List list = (List)request.getAttribute(MainServlet.BEER_BRANDS);
    for (Object aList : list) {
        out.print("<br> try: " + aList);
    }
%>
</body>
</html>
