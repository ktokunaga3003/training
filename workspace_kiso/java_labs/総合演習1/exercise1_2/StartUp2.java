package exercise1_2;

public class StartUp2 {

	public static void main(String[] args) {
		
		Library library = new Library("A市立図書館");
		library.addBook("吾輩は猫である", "吾輩は猫である。名前はまだない。・・・");
		library.showName();
		library.showBookList();

	}

}
