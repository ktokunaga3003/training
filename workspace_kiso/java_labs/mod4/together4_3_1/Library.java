package together4_3_1;

public class Library {
	
	private String address;
	private String phone;
	private Book book;
	
	public Library(String address, String phone, Book book) {
		this.address = address;
		this.phone = phone;
		this.book = book;
	}
	
	public void display() {
		System.out.println("---図書館の情報---");
		System.out.println("住所："+address);
		System.out.println("電話番号："+phone);
		
		System.out.println("---本の情報---");
		book.display();
	}

}
