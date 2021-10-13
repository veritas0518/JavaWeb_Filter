package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: LoginServlet
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/9/12 20:41
 **/

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("xtx0518".equalsIgnoreCase(username) && "123456".equalsIgnoreCase(password)) {
            req.getSession().setAttribute("user", username);
            resp.getWriter().write("登入成功");
        } else {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
