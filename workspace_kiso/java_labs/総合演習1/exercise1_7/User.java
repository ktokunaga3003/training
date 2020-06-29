package exercise1_7;

public class User {

	private String userName;
	private Book book;

	public User(String userName) {
		this.userName = userName;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

}
