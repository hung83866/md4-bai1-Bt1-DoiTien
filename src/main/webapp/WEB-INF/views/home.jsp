<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/27/2022
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Tỉ Giá Hôm Nay : 1USD = 23194 VND</h1>
<form method="post" action="/usd">
    <input type="text" name="usd" placeholder="USD">
    <button>result</button>
</form>
<h2>kết quá : ${usd} USD = ${vnd} VND</h2>
</body>
</html>
