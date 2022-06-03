package com.el.Servlet;

import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with Intellij IDEA
 *
 * @ Author: MarcWebber
 * @ Date: 2022/6/1
 * @ Description:
 * Life is short, I use Java
 */
@WebServlet(name = "NewsServlet", value = "/NewsServlet")
public class NewsServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //this.getInitParameter(); 获取初始属性
        //this.getServletConfig(); 获取配置
        //error-page
        //filter
        //filter mapping
        //listener
        //email config
        ServletContext servletContext=this.getServletContext();//Servlet上下文
//        servletContext.setAttribute("username",);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
