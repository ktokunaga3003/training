package s1_3;

public class StartUp {

	public static void main(String[] args) {

		Shop tokyoShop = new Shop("東京店","03-1234-5678"); // 東京店の生成

		tokyoShop.createGoods("海洋深層水",1200);  // 東京店の商品の生成
		Customer yamada = new Customer("山田");    // 山田さんを生成
		yamada.createBag(1000);                                    // 買い物かごの生成

		yamada.printCustomer();                // 顧客情報の表示

		yamada.queryShop(tokyoShop);  // 商店情報の問い合わせ

	}

}
