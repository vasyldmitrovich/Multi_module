<%--
  Created by IntelliJ IDEA.
  User: vasyl
  Date: 27.01.20
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Page_crud_operation</title>
</head>
<body>
This is page crud operation where we will show operation with pets<br>
We should add form, filed, button and other.

<form method="post" action="crud_operation.jsp">
    <label>Name:
        <input type="text" name="name">
    </label>
    <label>Age:
        <input type="number" name="age">
    </label>
    <label>Breed:
        <input type="text" name="breed">
    </label>
    <button type="submit">Click this button, you are add pets</button>
</form>
</body>
</html>
