package s2_3;

import java.util.*;           // ArrayListを使用するためにインポート

public class ShoppingBag2 extends ShoppingBag {

	private ArrayList<Goods> buyGoodsList;   // 購入品リスト

	// 引数のないコンストラクタ
	public ShoppingBag2() {

	}

	// 引数があるコンストラクタ
	public ShoppingBag2(int money) {
		super(money);
		buyGoodsList = new ArrayList<>();
	}

	// 買い物かごの情報を表示（限度額と商品情報、ShoppingBagからのオーバーライド）
	public void printShoppingBag() throws MyException {
		System.out.println("    (ShoppingBag)  限度額 "+super.getMoney()+"円");
		for(Goods goods : buyGoodsList) {
			if(goods != null) {
				goods.printGoods();
			}else {
				throw new MyException("    (ShoppingBag)  商品は入っていません。");
			}
		}
	}

	// セッター（商品情報）、購入品リストに商品を追加（ShoppingBagからのオーバーライド）
	public void setGoods(Goods goods) {
		buyGoodsList.add(goods);
	}

	// セッター（購入品リスト）
	public void setBuyGoodsList(ArrayList<Goods> buyGoodsList) {
		this.buyGoodsList = buyGoodsList;
	}

	// ゲッター（購入品リスト）
	public ArrayList<Goods> getBuyGoodsList(){
		return buyGoodsList;
	}

	// セッター（商品情報）

}
