package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PagesServlet", urlPatterns = "/simpl")
public class PagesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println(PageParts.getPageTop());
            out.write("<h1>Hello I connected to project bootstrap</h1>");
            out.write("<p>I added files css and js from getbootstrap.com</p>");
            out.write("<p>I created own myStile.css</p>");
            out.write("<p>Added classes where created methods with include code html</p>");
            out.println(PageParts.getPageBottom());
        } finally {
            out.close();
        }
    }
}
