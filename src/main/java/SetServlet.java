import sun.applet.AppletResourceLoader;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/set")
public class SetServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.addCookie(new Cookie("user", "Tom"));
        try(PrintWriter printWriter = response.getWriter()) {
            printWriter.println("Cookie is set");
        } catch (Exception e) {};
    }
}