package s2_1;

public class Shop1 extends Shop{

	private Goods[] goodsList;  // 商品配列

	// 引数のないコンストラクタ
	public Shop1(){

	}

	// 引数があるコンストラクタ
	public Shop1(String shopName, String telNo) {
		super(shopName,telNo);
	}

	// 商品配列の生成
	public void createGoodsList(int nn) {
		goodsList = new Goods[nn];
	}

	//  商品の生成（Shopからのオーバーライド、商品配列に格納）
	public void createGoods(int nn, String goodsName, int price) {
		goodsList[nn] = new Goods(goodsName, price);
	}

	// 商店の情報を表示（Shopからのオーバーライド）
	public void printShop() {
		System.out.println("==============================");
		System.out.println("(Shop1)："+super.getShopName()+"です。 TEL："+super.getTelNo());
		for(Goods goods : goodsList) {
			goods.printGoods();
		}
		System.out.println("==============================");
	}

	// 商品を販売（Shopからのオーバーライド）
	public void saleGoods(String goodsName, ShoppingBag shoppingBag) {
		for(Goods goods : goodsList) {
			if(goodsName.equals(goods.getGoodsName())) {
				super.setGoods(goods);
				break;
			}else {
				super.setGoods(goods);
			}
		}
		super.saleGoods(goodsName, shoppingBag);
	}


	/*
	// セッター（店名）
	public void setShopName(String shopName){
		super.setShopName(shopName);
	}

	// ゲッター（店名）
	public String getShopName() {
		return super.getShopName();
	}

	// セッター（電話番号）
	public void setTelNo(String telNo) {
		super.setTelNo(telNo);
	}

	// ゲッター（電話番号）
	public String getTelNo() {
		return super.getTelNo();
	}

	// セッター（商品情報）
	public void setGoods(Goods goods) {
		super.setGoods(goods);
	}

	// ゲッター（商品情報）
	public Goods getGoods() {
		return super.getGoods();
	}
	*/

	// セッター（商品配列）
	public void setGoodsList(Goods[] goodsList) {
		this.goodsList = goodsList;
	}

	// ゲッター（商品配列）
	public Goods[] getGoodsList() {
		return goodsList;
	}




}
