package s2_4;

import java.util.*;

public class Shop {

	private String shopName;                     // 店名
	private String telNo;                              // 電話番号
	private ArrayList<Goods> goodsList; // 商品配列

	// 引数のないコンストラクタ
	public Shop() {

	}

	// 引数があるコンストラクタ
	public Shop(String shopName, String telNo) {
		this.shopName = shopName;
		this.telNo = telNo;
		goodsList = new ArrayList<>();
	}

	// 商品の生成と追加
	public void addGoods(String shopName, int price) {
		goodsList.add(new Goods(shopName, price));
	}

	// 商品情報を表示
	public void printShop(){
		System.out.println("(Shop) "+shopName+"です。 TEl："+telNo);
		for (Goods goods : goodsList) {
			goods.printGoods();
		}
	}

	public void saleGoods(String goodsName, ShoppingBag shoppingBag) {
		Goods g = null;
		for (Goods goods : goodsList) {
			if(goodsName.equals(goods.getGoodsName())){
				g = goods;
				if(shoppingBag.getMoney() >= goods.getPrice()) {
					int change = shoppingBag.getMoney() - goods.getPrice();
					System.out.println("    (Shop) "+shopName+"「"+goodsName+"は"+goods.getPrice()+"円です。まいどありっ！ おつりは"+change+"円です。」");
					shoppingBag.setGoods(goods);
					shoppingBag.setMoney(change);
					break;
				}else {
					System.out.println("    (Shop) "+shopName+"「"+goodsName+"は"+goods.getPrice()+"円です。お金が足りません。」");
					break;
				}
			}
		}
		if(g == null){
			System.out.println("    (Shop) "+shopName+"「"+goodsName+"は取り扱っていません。申し訳ありません。」");
		}
	}


	// セッター（店名）
	public void setShopName(String shopName) {
		this.shopName = shopName;
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

	// セッター（商品配列）
	public void setGoodsList(ArrayList<Goods> goodsList) {
		this.goodsList = goodsList;
	}

	// ゲッター（商品配列）
	public ArrayList<Goods> getGoodsList(){
		return goodsList;
	}

}
