package together4_3_1;

public class StartUp {

	public static void main(String[] args) {
		
		Book book = new Book("Javaプログラミング基礎","Java太郎");
		
		Library library = new Library("東京都港区","03-1234-5678",book);
		
		library.display();

	}

}
