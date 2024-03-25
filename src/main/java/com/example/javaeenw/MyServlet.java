package com.example.javaeenw;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet", value = "/my-servlet")
public class MyServlet extends HttpServlet {
    private String message;

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        HttpSession session = request.getSession();

        Integer count = (Integer)session.getAttribute("count");

        if(count == null){
            session.setAttribute("count", 1);
            count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }

//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Your count is: " + count + " </h1>");
//        out.println("<h1>Hello " + name + " " + surname + "</h1>");
        out.println("</body></html>");

//        response.sendRedirect("/my-jsp");

//        RequestDispatcher dispatcher = request.getRequestDispatcher("/my-jsp");
//        dispatcher.forward(request, response);

    }

    public void destroy() {
    }
}