import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

@WebServlet("/guestbook")
public class GuestBookServlet extends HttpServlet {
    private GuestBook guestBook = new GuestBook();
    private String entryForm = Files.readString(Paths.get("C:\\Users\\seven\\IdeaProjects\\WebDev_ServerApplications\\src\\main\\webapp\\pages\\entry.html"));
    public GuestBookServlet() throws IOException {
        guestBook.addEntry("Dimi", "I loved it here");
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String comment = request.getParameter("comment");

        guestBook.addEntry(name,comment);

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("  <meta charset='UTF-8'/>");
            out.println("  <title>GuestBook Servlet</title>");
            out.println("  <style>* { font-family: sans-serif }</style>");
            out.println("</head>");
            out.println("<body>");
            out.println(entryForm);
            out.println("<ul>");
            out.println("    <li>first entry</li>");
            guestBook.getEntries().forEach(entry -> {
                out.println("<li>" + entry.getGuest() + " commented: " + entry.getComment() + "</li>");
            });
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("  <meta charset='UTF-8'/>");
            out.println("  <title>GuestBook Servlet</title>");
            out.println("  <style>* { font-family: sans-serif }</style>");
            out.println("</head>");
            out.println("<body>");
            out.println(entryForm);
            out.println("<ul>");
            out.println("    <li>first entry</li>");
            guestBook.getEntries().forEach(entry -> {
                out.println("<li>" + entry.getGuest() + " commented: " + entry.getComment() + "</li>");
            });
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
