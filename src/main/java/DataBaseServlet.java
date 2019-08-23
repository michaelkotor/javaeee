import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/db")
public class DataBaseServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try(PrintWriter printWriter = response.getWriter()) {
            MysqlConnect mysqlConnect = new MysqlConnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
