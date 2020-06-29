package exercise1_2;

public class Library {
	
	private String name;
	private Book book;
	
	public Library(String name) {
		this.name = name;
	}
	
	public void showName() {
		System.out.println("(Library)：この図書館は「"+name+"」です。");
	}
	
	public void addBook(String title, String contents) {
		book = new Book(title,contents);
	}
	
	public void showBookList() {
		book.showTitle();
	}

}
