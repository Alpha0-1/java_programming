// File: 2-session_management.java
// Description: Managing sessions using HttpSession

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * SessionServlet demonstrates session management using HttpSession.
 */
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get session object; create if not exists
        HttpSession session = request.getSession(true);

        // Store user data in session
        Integer count = (Integer) session.getAttribute("visitCount");
        if (count == null) {
            count = 0;
        }
        count++;
        session.setAttribute("visitCount", count);

        out.println("<h2>Welcome! You've visited this page " + count + " times.</h2>");
    }
}
