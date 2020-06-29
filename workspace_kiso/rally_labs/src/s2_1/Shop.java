package s2_1;

public class Shop {

	private String shopName;  // 店名
	private String telNo;           // 電話番号
	private Goods goods;        // 商品情報

	// 引数のないコンストラクタ
	public Shop() {

	}

	// 引数のあるコンストラクタ
	public Shop(String shopName, String telNo) {
		this.shopName = shopName;
		this.telNo = telNo;
	}

	// 商品の生成
	public void createGoods(String goodsName, int price) {
		goods = new Goods(goodsName,price);
	}

	// 商店の情報を表示
	public void printShop() {
		System.out.println("(Shop)："+shopName+"です。 TEL："+telNo);
		goods.printGoods();
	}

	// 商品を販売
	public void saleGoods(String goodsName, ShoppingBag shoppingBag) {
		if(goodsName.equals(goods.getGoodsName())) {
			if(shoppingBag.getMoney() >= goods.getPrice()) {
				int change = shoppingBag.getMoney() - goods.getPrice();
				System.out.println("    (Shop) "+shopName+"「"+goodsName+"は"+goods.getPrice()+"円です。まいどありっ！ おつりは"+change+"円です。」");
				shoppingBag.setGoods(goods);
				shoppingBag.setMoney(change);
			}else {
				System.out.println("    (Shop) "+shopName+"「"+goodsName+"は"+goods.getPrice()+"円です。お金が足りません。」");
			}
		}else {
			System.out.println("    (Shop) "+shopName+"「"+goodsName+"は取り扱っていません。申し訳ありません。」");
		}
	}

	// セッター（店名）
	public void setShopName(String shopName) {
		this.shopName =shopName;
	}

	// ゲッター（店名）
	public String getShopName() {
		return shopName;
	}

	// セッター（電話番号）
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	// ゲッター（電話番号）
	public String getTelNo() {
		return telNo;
	}

	// セッター（商品情報）
	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	// ゲッター（商品情報）
	public Goods getGoods() {
		return goods;
	}

}
