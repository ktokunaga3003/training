package s1_4;

public class StartUp {

	public static void main(String[] args) {

		Shop tokyoShop = new Shop("東京店","03-1234-5678"); // 東京店の生成
		tokyoShop.createGoods("海洋深層水", 1200);                     // 東京店の商品の生成
		Customer yamada = new Customer("山田");                        // 山田さんを生成
		yamada.createBag(2000);                                                        // 買い物かごを生成

		// 顧客情報の表示
		yamada.printCustomer();

		// 商品購入
		yamada.buyGoods(tokyoShop, "アロエはちみつ");
		yamada.buyGoods(tokyoShop,"海洋深層水");
		yamada.buyGoods(tokyoShop,"海洋深層水");

		// 顧客情報の表示
		yamada.printCustomer();

	}

}
