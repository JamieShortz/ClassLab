package murach.email;

import java.io.*;

import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
import murach.data.UserIO;
import murach.business.User;
import murach.data.UserDB;

public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/login.jsp";

        ServletContext sc = getServletContext();

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/login.jsp";    // the "join" page
        } else if (action.equals("login")) {
            // get parameters from the request
            String userName = request.getParameter("userName");
            String passWord = request.getParameter("passWord");

            if (userName.equals("userName") && passWord.equals("passWord")) {
                HttpSession session = request.getSession();
                session.setAttribute("userName", userName);
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("login.jsp");
            }
            // store data in User object

            String path = sc.getRealPath("/WEB-INF/login_credentials.txt");
            // validate the parameters
            String message;
            if (userName == null || passWord == null
                    || userName.isEmpty() || passWord.isEmpty()) {
                message = "Please fill out both text boxes.";
                url = "/login.jsp";
            } else if (UserIO.getUser(userName, path) == null) {
                message = "Username or Password is incorrect, try again.";
                url = "/login.jsp";
            } else {
                message = null;
                User user = new User(userName, passWord);
                HttpSession session;
                HttpSession HttpSession = session = request.getSession();
                session.setAttribute("userName", userName);
                url = "index.jsp";
            }

            request.setAttribute("message", message);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
