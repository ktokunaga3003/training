package exercise1_4;

import java.util.*;

public class Library {
	
	private String name;
	private ArrayList<Book> bookList;
	
	public Library(String name) {
		this.name = name;
		bookList = new ArrayList<>();
	}
	
	public void showName() {
		System.out.println("(Library)：この図書館は「"+name+"」です。");
	}
	
	public void addBook(String title, String contents) {
		bookList.add(new Book(title,contents));
	}
	
	public void showBookList() {
		for(Book book : bookList) {
			book.showTitle();
		}
		
	}

}
