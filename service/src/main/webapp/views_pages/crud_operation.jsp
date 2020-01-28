<%@ page import="create_obj.Model" %>
<%@ page import="describe_obj.Pets" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Page_crud_operation</title>
</head>
<body style="background-color: darkgray">
<br>
<div style="background-color: aliceblue"><br>
<header style="text-align: center">
    <h1>On this page we can do CRUD operation</h1>
    <h4>For now, you can only add. In the near future we will do delete and other operation</h4>
</header><br>
<form name="HardWorking" method="post" action="crud_operation">
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
</form><br>
</div>
<div style="background-color: antiquewhite">
    <ul><p>List objects</p>
    <%
        Model model = new Model();
        model.getListPets();
        ArrayList<String> petsName = new ArrayList<>();
        ArrayList<Integer> petsAge = new ArrayList<>();
        ArrayList<String> petsBreed = new ArrayList<>();
        for (Pets pets: model.getListPets()
        ) {
            petsName.add(pets.getName());
            petsAge.add(pets.getAge());
            petsBreed.add(pets.getBreed());
        }
        for (int i=0; i<petsName.size();i++){
            out.println("<li>Name your pets is: "+petsName.get(i)+";"+
                    "    Age your pets is: "+petsAge.get(i)+";"+
                    "    Breed your pets is: "+petsBreed.get(i)+";  </li>");
        }
    %>
    </ul>
</div><br>
<div style="text-align: right">
<% java.util.Date now = new java.util.Date(); String dateNow = "Date now is: "+now;%>
<%= dateNow %>
<br>
</div>
</body>
</html>
