package useclass3_1_1;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Item.java
 *
 */

// 商品クラス
class Item {

	String code;		// 商品コード
	String name;		// 商品名
	int   price;		// 単価

	// 表示メソッド
	public void print() {
		System.out.println("商品コード	:" + code);
		System.out.println("商品名   	:" + name);
		System.out.println("単価	   	:" + price);
	}

}
