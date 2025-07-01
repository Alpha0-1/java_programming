<%@ page import="com.example.UserModel" %>
<jsp:useBean id="user" class="com.example.UserModel" scope="request"/>
<html>
<head><title>User View</title></head>
<body>
    <h2>User Profile</h2>
    <p>Username: <%= user.getUserName() %></p>
</body>
</html>
