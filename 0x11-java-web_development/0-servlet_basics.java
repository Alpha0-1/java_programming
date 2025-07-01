// File: 0-servlet_basics.java
// Description: A basic servlet example to respond with "Hello from Servlet!"

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * HelloServlet responds with a simple text message when accessed via HTTP.
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello from Servlet!</h1>");
    }
}
