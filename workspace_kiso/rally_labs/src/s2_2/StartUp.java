package s2_2;

public class StartUp {

	public static void main(String[] args) {

		Shop2 tokyoShop = new Shop2("東京店","03-1234-5678");  // 東京店の生成

		// 商品の生成とリストへの追加
		tokyoShop.addGoods("海洋深層水", 1200);
		tokyoShop.addGoods("ビタミンABC", 350);
		tokyoShop.addGoods("天然黒酢", 890);
		tokyoShop.addGoods("アガリクス", 2000);
		tokyoShop.addGoods("アロエはちみつ", 650);

		Customer yamada = new Customer("山田");                             // 山田さんを生成
		yamada.createBag(1000);                                                             // 買い物かごを生成

		tokyoShop.printShop();                                                              // 商店情報を表示

		yamada.printCustomer();                                                           // 顧客情報を表示（山田）

		yamada.buyGoods(tokyoShop, "海洋深層水");                     // 「東京店」で「海洋深層水」を購入

		yamada.buyGoods(tokyoShop,"青汁一杯");                          // 「東京店」で「青汁一杯」を購入

		tokyoShop.addGoods("青汁一杯", 120);                                // 「東京店」に「青汁一杯」を生成し、リストへ追加

		tokyoShop.printShop();                                                            // 商店情報を表示

		yamada.buyGoods(tokyoShop,"青汁一杯");                          // 「東京店」で「青汁一杯」を購入

		yamada.printCustomer();                                                          // 山田さんの顧客情報を表示

	}

}
