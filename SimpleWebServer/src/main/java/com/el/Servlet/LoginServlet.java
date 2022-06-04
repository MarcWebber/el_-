package com.el.Servlet;

import com.el.Login.LoginController;
import com.el.utils.Login.LoginDAOUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


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
//        req.getRequestDispatcher("/r/index.jsp").forward(req,resp);
        doLoginIn(Integer.parseInt(req.getParameter("name")),req.getParameter("pwd"),resp);
    }

    protected void doLoginIn(int Id, String password, HttpServletResponse resp) {
        try {
            if (new LoginController(Id, password).check()) {
                resp.getWriter().print(true);
                Initializer.init(Id);
                System.out.println(Id);
                resp.sendRedirect("main.jsp");
            } else {
                resp.getWriter().print(false);
                resp.sendRedirect("index.jsp");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
