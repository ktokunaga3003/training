package exercise1_3;

public class Library {
	
	private String name;
	private Book[] bookList;
	
	public Library(String name) {
		this.name = name;
		bookList = new Book[5];
	}
	
	public void showName() {
		System.out.println("(Library)：この図書館は「"+name+"」です。");
	}
	
	public void addBook(int nn, String title, String contents) {
		bookList[nn] = new Book(title,contents);
	}
	
	public void showBookList() {
		for(Book book : bookList) {
			book.showTitle();
		}
		
	}

}
