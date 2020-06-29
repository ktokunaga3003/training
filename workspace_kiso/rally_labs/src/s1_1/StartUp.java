package s1_1;

public class StartUp {

	public static void main(String[] args) {

		Shop tokyoShop = new Shop("東京店","03-1234-5678"); //東京店の生成
		Shop osakaShop = new Shop("大阪店","06-2222-7777"); // 大阪店の生成

		// 商店情報表示
		tokyoShop.printShop();
		osakaShop.printShop();

	}

}
