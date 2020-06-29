package exercise1_5;

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
	
	public void showContents() {
		System.out.println("(Book)："+contents);
	}
	
	public String getTitle() {
		return title;
	}

}
