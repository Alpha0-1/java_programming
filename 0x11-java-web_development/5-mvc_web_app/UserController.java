// File: 5-mvc_web_app/UserController.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "Welcome to the User Page!");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/userView.jsp");
        dispatcher.forward(request, response);
    }
}
