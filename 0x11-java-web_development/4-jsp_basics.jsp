<%-- File: 4-jsp_basics.jsp --%>
<%-- Description: Basic JSP page demonstrating dynamic HTML generation --%>

<html>
<head><title>JSP Basics</title></head>
<body>
    <h1>Hello from JSP!</h1>
    <p>This page was generated at <%= new java.util.Date() %></p>
    
    <% 
        String name = request.getParameter("name"); 
        if (name != null && !name.isEmpty()) {
    %>
        <h2>Hello, <%= name %>!</h2>
    <% } else { %>
        <h2>Please provide a name via URL parameter like ?name=John</h2>
    <% } %>
</body>
</html>
