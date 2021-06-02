import java.time.LocalDate;

public class GuestBookEntry {

	private LocalDate date;
	private String guest;
	private String comment;

	public GuestBookEntry(String guest, String comment) {
		this.date = LocalDate.now();
		this.guest = guest;
		this.comment = comment;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getGuest() {
		return guest;
	}

	public String getComment() {
		return comment;
	}
}
