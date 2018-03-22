package com.hjl.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 *
 * @author 何九龙
 * @date 2018/3/21
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    /*  
     *
     * @date 2018/3/21
     * @param [req, resp]  
     * @return void  
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("home");
    }
}
