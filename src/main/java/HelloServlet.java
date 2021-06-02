import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    Integer cnt = 0;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        cnt++;
        String name = request.getParameter("name");
        if (name == null || name.isEmpty()) {
            name = "Servlet";
        }
        String greeting = "Hello " + name;
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("  <meta charset='UTF-8'/>");
            out.println("  <title>Hello Servlet</title>");
            out.println("  <style>* { font-family: sans-serif }</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("  <h1>" + greeting + cnt + "</h1>");
            out.println("  <form action='hello' method='get'>");
            out.println("    Your Name: <input type='text' name='name'/>");
            out.println("    <br/><br/>");
            out.println("    <input type='submit' value='Say Hello'/>");
            out.println("  </form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
