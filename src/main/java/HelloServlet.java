import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.PrintWriter;

@WebServlet("/see")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        HttpSession httpSession = request.getSession();
        String name = (String) httpSession.getAttribute("name");
        try(PrintWriter printWriter = response.getWriter()) {
            if(name == null) {
                // устанавливаем объект с ключом name
                httpSession.setAttribute("name", "Tom Soyer");
                printWriter.println("Session data are set");
            }
            else {
                printWriter.println("Name: " + name);
                // удаляем объект с ключом name
                httpSession.removeAttribute("name");
            }
        } catch (Exception e) {}

    }
}
