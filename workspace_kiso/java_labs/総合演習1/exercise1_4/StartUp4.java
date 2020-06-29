package exercise1_4;

public class StartUp4 {

	public static void main(String[] args) {
		
		Library library = new Library("A市立図書館");
		
		library.addBook("吾輩は猫である","吾輩は猫である。名前はまだない。・・・");
		library.addBook("セロ弾きのゴーシュ","ゴーシュは町の活動写真館でセロを弾く係でした。・・・");	
		library.addBook("羅生門","ある日の暮れ方のことである。一人の下人が・・・");	
		library.addBook("走れメロス","メロスは激怒した。必ず、かの邪知暴虐の王を・・・");	
		library.addBook("こころ","私はその人を先生と呼んでいた。・・・");
		
		library.showName();
		library.showBookList();

	}

}
