package UseHashMap;

/**
 * All Rights Reserved, Copyright(c)Fujitsu Learning Media Limited
 *
 * ItemInfo.java
 *
 */

// 商品クラス
class ItemInfo {

    private String name;	// 商品名
    private int price;		// 価格

    public ItemInfo(String name, int price) {
		this.name = name;
		this.price = price;
    }

	// 商品情報表示
    public void print() {
        System.out.println("商品名：" + name + "\t価格：" + price + "円");
    }
}
