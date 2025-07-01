// File: 3-cookie_handling.java
// Description: Working with cookies in Java servlets

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * CookieServlet sets and retrieves cookies from client browser.
 */
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Check if cookie already exists
        Cookie[] cookies = request.getCookies();
        boolean found = false;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("userVisited")) {
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            Cookie cookie = new Cookie("userVisited", "true");
            cookie.setMaxAge(60 * 60 * 24); // 1 day
            response.addCookie(cookie);
            out.println("<h2>Welcome! First visit recorded.</h2>");
        } else {
            out.println("<h2>Welcome back! We remember your previous visit.</h2>");
        }
    }
}
