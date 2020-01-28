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
<body style="background-color: darkgray">
This is page crud operation where we will show operation with pets<br>
We should add form, filed, button and other.
<br>
<br>
<form method="post">
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
<% java.util.Date now = new java.util.Date(); String dateNow = "Date now is: "+now;%>
<%= dateNow %>
<br>

</body>
</html>
