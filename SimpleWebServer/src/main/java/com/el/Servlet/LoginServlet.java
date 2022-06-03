package com.el.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/6/2
 * @ Description:
 * Life is short, I use Java
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("name");
        String password=req.getParameter("password");
        String[] parameters=req.getParameterValues(null);
        System.out.println("username");
        System.out.println("password");
        resp.setCharacterEncoding("UTF-8");
//        req.getRequestDispatcher("/r/index.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
