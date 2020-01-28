package com.multiModuleApplication;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/FuckServlet")
public class FuckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String breed = request.getParameter("breed");
        PrintWriter writer = response.getWriter();
        String htmlRespone = "<html>";
        htmlRespone += "Fuck your name: " + name + "<br/>";
        htmlRespone += "Fuck your age: " + age + "<br/>";
        htmlRespone += "Fuck your breed: " + breed + "<br/>";
        htmlRespone += "</html>";
        writer.println(htmlRespone);
    }
}
