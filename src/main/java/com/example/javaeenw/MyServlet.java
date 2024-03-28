package com.example.javaeenw;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import logic.Cart;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet", value = "/my-servlet")
public class MyServlet extends HttpServlet {
    private String message;

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        String user = (String)session.getAttribute("current_user");

        if(user == null){

        } else{

        }
//        Cart cart = (Cart)session.getAttribute("cart");
//
//        String name = request.getParameter("name");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//
//        if(cart == null){
//            cart = new Cart();
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }
//
//        session.setAttribute("cart", cart);

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
    }

    public void destroy() {
    }
}