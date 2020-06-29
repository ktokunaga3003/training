package s1_2;

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

	// 商店の情報を表示
	public void printShop() {
		System.out.println("(Shop)  "+shopName+"です。 TEL："+telNo);
		goods.printGoods();
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

	// 商品の生成
	public void createGoods(String goodsName, int price) {
		goods = new Goods(goodsName,price);
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
