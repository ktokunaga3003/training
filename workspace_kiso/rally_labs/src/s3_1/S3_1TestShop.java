package s3_1;

import java.util.*;
/*********************************************************************
 *	S3_1
 *	S3_1TestShop.java
 *
 *	S3_1のShopクラスの単体テスト用クラス
 *
 *	テスト内容：
 *		Test1:引数のないコンストラクタのテスト
 *		Test2:その他のコンストラクタとゲッターのテスト
 *		Test3:ゲッター・セッターのテスト
 *		Test4:業務ロジック addGoods()のテスト
 *		Test5:業務ロジック printShop()のテスト
 *		Test6:業務ロジック saleGoods()のテスト
 *
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 *********************************************************************/

public class S3_1TestShop{

	public static void main(String[] args){
		Shop shop;
		String shopName = "Ｂ＆Ｃ";
		String telNo = "03-1122-3344";
		int money = 2300;
		String id = "book";
		String goodsName = "これからのJava";
		String publisher = "大日本技術社";
		ArrayList<Goods> goodsList = new ArrayList<Goods>();

		String test;

		System.out.println();
		System.out.println("** S3_1のShopクラスの単体テスト **");

		// Test1:引数のないコンストラクタのテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop();
		if(shop != null){
			test = "OK";
		}
		System.out.println("Test1:引数のないコンストラクタのテスト = " + test);

		// Test2:その他のコンストラクタとゲッターのテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop(shopName, telNo);
		if(shop != null && shopName.equals(shop.getShopName()) && telNo.equals(shop.getTelNo())){
			test = "OK";
		}
		System.out.println("Test2:その他のコンストラクタとゲッターのテスト = " + test);

		// Test3:ゲッター・セッターのテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop();
		shop.setShopName(shopName);
		shop.setTelNo(telNo);
		shop.setGoodsList(goodsList);
		if(shopName.equals(shop.getShopName()) && telNo.equals(shop.getTelNo()) && goodsList.equals(shop.getGoodsList())){
			test = "OK";
		}
		System.out.println("Test3:ゲッター・セッターのテスト = " + test);

		// Test4:業務ロジック addGoods()のテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop(shopName, telNo);
		shop.addGoods("book", "これからのJava"  , 2300, "大日本技術社");
		shop.addGoods("cd"  , "B列車でいこう"   , 2820, "JAZZ");
		if(shop.getGoodsList().size() == 2){
			test = "OK";
		}
		System.out.println("Test4.1:業務ロジック addGoods()のテスト = " + test);

		System.out.println("---");
		System.out.println("Test4.2:業務ロジック addGoods()のテスト２");
		System.out.println("        フィールド値(id)に異常データを設定した時のテスト");
		System.out.println("↓次の行に「商品IDが不正です。」というエラーが表示されていればテストOK");
		shop.addGoods("abc" , "ﾛｯｸｵﾝﾛｯｸ"        , 1050, "ROCK" );

		// Test5:業務ロジック printShop()のテスト
		System.out.println("---");
		shop = new Shop("Ｂ＆Ｃ", "03-1122-3344");
		shop.addGoods(id, goodsName, money, publisher);
		shop.addGoods("cd"  , "B列車でいこう"   , 2820, "JAZZ");

		System.out.println("Test5:業務ロジック printShop()のテスト");
		System.out.println("↓次の行に「商品情報」が複数表示されていればテストOK");
		shop.printShop();

		// Test6:業務ロジック saleGoods()のテスト
		System.out.println("---");
		ShoppingBag bag  = new ShoppingBag(money);
		ShoppingBag bag1 = new ShoppingBag(money + 1);
		ShoppingBag bag2 = new ShoppingBag(money);
		ShoppingBag bag3 = new ShoppingBag(money - 1);

		shop = new Shop("Ｂ＆Ｃ", "03-1122-3344");
		shop.addGoods(id, goodsName  , money, publisher);
		shop.addGoods("cd"  , "B列車でいこう"   , 2820, "JAZZ");

		ArrayList<Goods> buyGoodsList;

		System.out.println("Test6:業務ロジック saleGoods()のテスト");

		test = "NG";
		shop.saleGoods("XXX", bag);
		buyGoodsList = bag.getBuyGoodsList();
		if(buyGoodsList.size() == 0 && bag.getMoney() == money){
			test = "OK";
		}
		System.out.println("「該当する商品がない場合のテスト」" + test);

		test = "NG";
		shop.saleGoods(goodsName, bag1);
		buyGoodsList = bag1.getBuyGoodsList();
		if(buyGoodsList.size() == 1 && ((Goods)buyGoodsList.get(0)).getGoodsName() == goodsName && bag1.getMoney() == 1){
			test = "OK";
		}
		System.out.println("「商品が販売できた場合のテスト(1)」" + test);

		test = "NG";
		shop.saleGoods(goodsName, bag2);
		buyGoodsList = bag2.getBuyGoodsList();
		if(buyGoodsList.size() == 1 && ((Goods)buyGoodsList.get(0)).getGoodsName() == goodsName && bag2.getMoney() == 0){
			test = "OK";
		}
		System.out.println("「商品が販売できた場合のテスト(2)」" + test);

		test = "NG";
		shop.saleGoods(goodsName, bag3);
		buyGoodsList = bag3.getBuyGoodsList();
		if(buyGoodsList.size() == 0 && bag3.getMoney() == money-1){
			test = "OK";
		}
		System.out.println("「限度額が足りなかった場合のテスト」" + test);
	}
}
