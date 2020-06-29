package s2_1;

public class Goods {

	private String goodsName;  // 商品名
	private int price;                    // 値段

	// 引数のないコンストラクタ
	public Goods() {
	}

	// 引数のあるコンストラクタ
	public Goods(String goodsName, int price) {
		this.goodsName = goodsName;
		this.price = price;
	}

	// 商品情報を表示
	public void printGoods() {
		System.out.println("    (Goods) "+goodsName+"  "+price+"円");
	}

	// セッター（商品名）
	public void setGoodsName(String goodsName){
		this.goodsName = goodsName;
	}

	// ゲッター（商品名）
	public String getGoodsName() {
		return goodsName;
	}

	// セッター（値段）
	public void setPrice(int price) {
		this.price = price;
	}

	// ゲッター（値段）
	public int getPrice() {
		return price;
	}

}
