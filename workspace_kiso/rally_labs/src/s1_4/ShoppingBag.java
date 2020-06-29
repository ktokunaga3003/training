package s1_4;

public class ShoppingBag {

	private int money;       // 限度額
	private Goods goods; // 商品情報

	// 引数のないコンストラクタ
	public ShoppingBag() {

	}

	// 引数のあるコンストラクタ
	public ShoppingBag(int money) {
		this.money = money;
	}

	// 買い物かごの情報を表示（限度額と商品情報）
	public void printShoppingBag() throws MyException {
		System.out.println("    (ShoppingBag)  限度額 "+money+"円");

		if(goods != null) {
			goods.printGoods();
		}else {
			throw new MyException("    (ShoppingBag)  商品は入っていません。");
		}
	}

	// セッター（限度額）
	public void setMoney(int money) {
		this.money = money;
	}

	// ゲッター（限度額）
	public int getMoney() {
		return money;
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
