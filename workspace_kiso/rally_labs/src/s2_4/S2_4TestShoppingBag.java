package s2_4;

import java.util.*;
/*********************************************************************
 *	S2_4
 *	S2_4TestShoppingBag.java
 *
 *	S2_4のShoppingBagクラスの単体テスト用クラス
 *	テスト内容：
 *		Test1:引数のないコンストラクタのテスト
 *		Test2:その他のコンストラクタとゲッターのテスト
 *		Test3:ゲッター・セッターのテスト
 *		Test4:業務ロジック printShoppingBag()のテスト
 *		Test5:業務ロジック setGoods()のテスト
 *
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 *********************************************************************/

public class S2_4TestShoppingBag{

	public static void main(String[] args){
		ShoppingBag shoppingBag;
		int money  = 2000;
		ArrayList<Goods> goodsList = new ArrayList<Goods>();
		goodsList.add(new Goods("海洋深層水", 1200));		// 商品リストに、商品を登録する。
		goodsList.add(new Goods("ビタミンＡＢＣ", 350));

		String test;

		System.out.println();
		System.out.println("** S2_4のShoppingBagクラスの単体テスト **");

		// Test1:引数のないコンストラクタのテスト
		System.out.println("---");
		test = "NG";
		shoppingBag = new ShoppingBag();
		if(shoppingBag != null){
			test = "OK";
		}
		System.out.println("Test1:引数のないコンストラクタのテスト = " + test);

		// Test2:その他のコンストラクタとゲッターのテスト
		System.out.println("---");
		test = "NG";
		shoppingBag = new ShoppingBag(money);
		if(shoppingBag != null && shoppingBag.getMoney() == money && shoppingBag.getBuyGoodsList() != null ){
			test = "OK";
		}
		System.out.println("Test2:その他のコンストラクタとゲッターのテスト = " + test);

		// Test3:ゲッター・セッターのテスト
		System.out.println("---");
		test = "NG";
		shoppingBag = new ShoppingBag();
		shoppingBag.setMoney(money);
		shoppingBag.setBuyGoodsList(goodsList);
		if(money == shoppingBag.getMoney() && goodsList.equals(shoppingBag.getBuyGoodsList())){
			test = "OK";
		}
		System.out.println("Test3:ゲッター・セッターのテスト = " + test);

		// Test4:業務ロジック printShoppingBag()のテスト
		System.out.println("---");
		test = "NG";
		shoppingBag = new ShoppingBag(money);
		shoppingBag.setBuyGoodsList(goodsList);
		System.out.println("Test4:業務ロジック printShoppingBag()のテスト");
		System.out.println("↓次の行の「買物かご情報」に複数の「商品情報」が表示されていればテストOK");
		try{
			shoppingBag.printShoppingBag();
		}catch(MyException e){
			System.out.println(e.getMessage());
		}

		// Test5:業務ロジック setGoods()のテスト
		System.out.println("---");
		test = "NG";
		int num1 = shoppingBag.getBuyGoodsList().size();

		shoppingBag.setGoods(new Goods("天然黒酢", 890));
		shoppingBag.setGoods(new Goods("アガリクス", 2000));
		int num2 = shoppingBag.getBuyGoodsList().size();
		if(num2-num1 == 2){
			test = "OK";
		}
		System.out.println("Test5:業務ロジック setGoods()のテスト = " + test);
		try{
			shoppingBag.printShoppingBag();
		}catch(MyException e){
			System.out.println(e.getMessage());
		}

	}
}
