package s1_2;

public class StartUp {

	public static void main(String[] args) {

		Shop tokyoShop = new Shop("東京店","03-1234-5678"); // 東京店の生成
		Shop osakaShop = new Shop("大阪店","06-2222-7777");  // 大阪店の生成

		// 商品の生成依頼
		tokyoShop.createGoods("海洋深層水", 1200);
		osakaShop.createGoods("ビタミンABC",350);

		// 商店情報表示
		tokyoShop.printShop();
		osakaShop.printShop();


	}

}
