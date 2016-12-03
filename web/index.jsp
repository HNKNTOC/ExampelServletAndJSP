<%--
  Created by IntelliJ IDEA.
  User: Nikita
  Date: 20.11.2016
  Time: 1:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main page</title>
</head>
<body>
<form method="post" action="/BeerExpert">
    Select beer by color<p>
    <label>
        Color:
        <select name="color" size="1">
            <option value="Light">Light</option>
            <option value="Amber">Amber</option>
            <option value="Brown">Brown</option>
            <option value="Dark">Dark</option>
        </select>
    </label>
    <input type="submit">
</form>
</body>
</html>
