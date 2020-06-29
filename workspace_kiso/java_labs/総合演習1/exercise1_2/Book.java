package exercise1_2;

public class Book {
	
	private String title;
	private String contents;
	
	public Book(String title, String contents) {
		this.title = title;
		this.contents = contents;
	}
	
	public void showTitle() {
		System.out.println("(Book)："+title);
	}

}
