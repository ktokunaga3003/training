package s2_3;

import java.util.*;           // ArrayListを使用するためにインポート

public class Shop2 extends Shop {

	private ArrayList<Goods> goodsList;  // 商品配列（ArrayList）

	// 引数のないコンストラクタ
	public Shop2() {

	}

	// 引数があるコンストラクタ
	public Shop2(String goodsName, String telNo) {
		super(goodsName, telNo);
		goodsList = new ArrayList<>();
	}

	// 商品の生成と追加
	public void addGoods(String goodsName, int price) {
		goodsList.add(new Goods(goodsName, price));
	}

	// 商店の情報を表示（Shopからのオーバーライド）
	public void printShop() {
		System.out.println("==============================");
		System.out.println("(Shop2) "+super.getShopName()+"です。 TEl："+super.getTelNo());
		for (Goods goods : goodsList) {
			goods.printGoods();
		}
		System.out.println("==============================");
	}

	// 商品を販売（Shopからのオーバーライド）
	public void saleGoods(String goodsName, ShoppingBag shoppingBag) {
		for (Goods goods : goodsList) {
			if(goodsName.equals(goods.getGoodsName())){
				super.setGoods(goods);
				break;
			}else {
				super.setGoods(goods);
			}
		}
		super.saleGoods(goodsName, shoppingBag);
	}

	// セッター（商品配列）
	public void setGoodsList(ArrayList<Goods> goodsList){
		this.goodsList = goodsList;
	}

	// ゲッター（商品配列）
	public ArrayList<Goods> getGoodsList(){
		return goodsList;
	}

}
