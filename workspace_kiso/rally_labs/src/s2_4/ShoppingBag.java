package s2_4;

import java.util.*;

public class ShoppingBag {

	private int money;                                          // 限度額
	private ArrayList<Goods> buyGoodsList;  // 購入品リスト

	// 引数のないコンストラクタ
	public ShoppingBag() {

	}

	// 引数があるコンストラクタ
	public ShoppingBag(int money) {
		this.money = money;
		buyGoodsList = new ArrayList<>();
	}

	// 買い物かご情報を表示
	public void printShoppingBag() throws MyException {
		System.out.println("    (ShoppingBag)  限度額 "+money+"円");
		for(Goods goods : buyGoodsList) {
			if(goods != null) {
				goods.printGoods();
			}else {
				throw new MyException("    (ShoppingBag)  商品は入っていません。");
			}
		}
	}

	// 購入品リストに商品を追加
	public void setGoods(Goods goods) {
		buyGoodsList.add(goods);
	}

	// セッター（限度額）
	public void setMoney(int money) {
		this.money = money;
	}

	// ゲッター（限度額）
	public int getMoney() {
		return money;
	}

	// セッター（商品リスト）
	public void setBuyGoodsList(ArrayList<Goods> buyGoodsList) {
		this.buyGoodsList = buyGoodsList;
	}

	// ゲッター（商品リスト）
	public ArrayList<Goods> getBuyGoodsList(){
		return buyGoodsList;
	}

}
