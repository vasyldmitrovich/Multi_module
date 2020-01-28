package servlets;

import create_obj.Model;
import describe_obj.Pets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CrudServlet")
public class CrudServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        int resultAge = Integer.parseInt(age);
        String breed = request.getParameter("breed");
        System.out.println("name is: "+name+" age is:"+age+" breed is: "+breed);
        Pets pets = new Pets(name,resultAge,breed);
        Model model = new Model();
        model.setArrayList(pets);
        doGet(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views_pages/crud_operation.jsp");
        requestDispatcher.forward(request, response);

    }
}
