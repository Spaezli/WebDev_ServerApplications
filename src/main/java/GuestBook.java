import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class GuestBook  {



	private final List<GuestBookEntry> entries = new ArrayList<>();

	public List<GuestBookEntry> getEntries() {
		return entries;
	}

	public void addEntry(String guest, String comment) {
		entries.add(new GuestBookEntry(guest, comment));
	}
}
