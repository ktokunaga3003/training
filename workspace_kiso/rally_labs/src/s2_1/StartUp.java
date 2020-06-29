package s2_1;

public class StartUp {

	public static void main(String[] args) {

		Shop1 tokyoShop = new Shop1("東京店","03-1234-5678");  // 東京店の生成
		tokyoShop.createGoodsList(5);                                                     // 配列5の商品配列を生成

		// 商品の生成
		tokyoShop.createGoods(0,"海洋深層水", 1200);
		tokyoShop.createGoods(1,"ビタミンABC", 350);
		tokyoShop.createGoods(2,"天然黒酢", 890);
		tokyoShop.createGoods(3,"アガリクス", 2000);
		tokyoShop.createGoods(4,"アロエはちみつ", 650);

		Customer yamada = new Customer("山田");                             // 山田さんを生成
		yamada.createBag(1000);                                                             // 買い物かごを生成


		tokyoShop.printShop();                                                              // 商店情報を表示

		yamada.printCustomer();                                                           // 顧客情報を表示（山田）

		yamada.buyGoods(tokyoShop, "海洋深層水");                     // 「東京店」で「海洋深層水」を購入

		yamada.buyGoods(tokyoShop,"青汁一杯");                         // 「東京店」で「青汁一杯」を購入

		yamada.buyGoods(tokyoShop,"ビタミンABC");                      // 「東京店」で「ビタミンABC」を購入

		yamada.printCustomer();                                                         // 山田さんの顧客情報を表示

	}

}
