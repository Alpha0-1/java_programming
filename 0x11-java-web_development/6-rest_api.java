// File: 6-rest_api.java
// Description: Basic RESTful API endpoint using HttpServlet

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Simple REST-like servlet responding to /api/data
 */
public class DataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.print("{\"message\": \"Data fetched successfully\"}");
    }
}
