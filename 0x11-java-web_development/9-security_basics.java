// File: 9-security_basics.java
// Description: Basic authentication using servlet filters

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String username = httpRequest.getParameter("user");
        String password = httpRequest.getParameter("pass");

        if ("admin".equals(username) && "secret".equals(password)) {
            chain.doFilter(request, response);
        } else {
            httpResponse.sendRedirect("login.html");
        }
    }

    @Override
    public void init(FilterConfig filterConfig) {}

    @Override
    public void destroy() {}
}
