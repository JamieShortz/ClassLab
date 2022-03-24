package murach.email;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import murach.business.User;
import murach.data.UserDB;

public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/login.html";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/login.html";    // the "join" page
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String passWord = request.getParameter("passWord");
            String userName = request.getParameter("userName");

            // store data in User object
            User user = new User(passWord, userName);

            // validate the parameters
            String message;
            if (passWord == null || userName == null ||
                passWord.isEmpty() || userName.isEmpty()) {
                message = "Please fill out all three text boxes.";
                url = "/login.html";
            } 
            else {
                message = "";
                url = "/index.html";
                UserDB.insert(user);
            }
            request.setAttribute("user", user);
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
