package s2_4;

public class StartUp {

	public static void main(String[] args) {

		Shop tokyoShop = new Shop("東京店","03-1234-5678");  // 東京店の生成

		// 商品の生成とリストへの追加
		tokyoShop.addGoods("海洋深層水", 1200);
		tokyoShop.addGoods("ビタミンABC", 350);
		tokyoShop.addGoods("天然黒酢", 890);
		tokyoShop.addGoods("アガリクス", 2000);
		tokyoShop.addGoods("アロエはちみつ", 650);
		tokyoShop.addGoods("青汁一杯", 120);

		Customer yamada = new Customer("山田");                             // 山田さんを生成
		yamada.createBag(2000);                                                             // 買い物かごを生成

		System.out.println("==============================");
		tokyoShop.printShop();                                                              // 商店情報を表示
		System.out.println("==============================");

		yamada.buyGoods(tokyoShop,"青汁一杯");                          // 「東京店」で「青汁一杯」を購入
		yamada.buyGoods(tokyoShop,"ビタミンABC");                          // 「東京店」で「ビタミンABC」を購入
		yamada.buyGoods(tokyoShop,"アロエはちみつ");                          // 「東京店」で「アロエはちみつ」を購入

		yamada.printCustomer();                                                           // 顧客情報を表示（山田）
	}

}
