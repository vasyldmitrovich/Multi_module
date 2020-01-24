import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="myservlet", urlPatterns = "/FirstInformation", loadOnStartup = 1)
public class FirstInformation extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter printWriter = response.getWriter();
        CreatePets createPets = new CreatePets();
        createPets.showPets();
        String informationAboutPets = createPets.getInfoAboutPets();
        String htmlRespone = "<html>";
        htmlRespone += "<h2>You are: "+ "<br/>";
        htmlRespone += informationAboutPets;
        htmlRespone += "</html>";
        printWriter.println(htmlRespone);
    }
}
