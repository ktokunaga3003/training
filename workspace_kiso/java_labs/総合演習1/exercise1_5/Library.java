package exercise1_5;

import java.util.*;

public class Library {

	private String name;
	private ArrayList<Book> bookList;
	private User user;

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

	public void createUser(String userName) {
		this.user = new User(userName);
		System.out.println(userName+"さん、ようこそ。");
	}

	public void showContents(String title) {

		for(Book book : bookList) {
			if(title.equals(book.getTitle())) {
				System.out.println("(Library)："+title+"の内容を表示します。");
				book.showContents();
				break;
			}
		}
	}

	public void lendBook(String title) {

		for(Book book : bookList) {
			if(title.equals(book.getTitle())) {
				System.out.println("(Library)："+title+"をお貸しします。");
				user.setBook(book);
				break;
			}
		}
	}

}
