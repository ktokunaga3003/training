package exercise1_1;

public class StartUp {

	public static void main(String[] args) {
		
		Book wagahai = new Book("吾輩は猫である","吾輩は猫である。名前はまだない。・・・");
		Book cello = new Book("セロ弾きのゴーシュ","ゴーシュは町の");
		
		wagahai.showTitle();
		cello.showTitle();
		

	}

}
