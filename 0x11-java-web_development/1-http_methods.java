// File: 1-http_methods.java
// Description: Handling GET and POST requests in a single servlet

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * MethodHandlingServlet handles both GET and POST requests.
 */
public class MethodHandlingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>This is a GET request.</h2>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        out.println("<h2>Hello, " + name + "! This is a POST request.</h2>");
    }
}
