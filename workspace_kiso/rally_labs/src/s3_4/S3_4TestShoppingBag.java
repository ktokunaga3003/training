package s3_4;

/*********************************************************************
 *	S3_4
 *	S3_4TestShoppingBag.java
 *
 *	S3_4のShoppingBagクラスの単体テスト用クラス
 *	テスト内容：
 *		Test1:引数のないコンストラクタのテスト
 *		Test2:その他のコンストラクタとゲッターのテスト
 *		Test3:ゲッター・セッターのテスト
 *		Test4:業務ロジック printShoppingBag()のテスト
 *		Test5:業務ロジック setGoods()のテスト
 *		Test6:業務ロジック removeGoods()のテスト
 *		Test7:業務ロジック clearGoods()のテスト
 *
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 *********************************************************************/
import java.util.*;

public class S3_4TestShoppingBag{

	public static void main(String[] args){
		ShoppingBag shoppingBag;
		int money  = 2000;
		ArrayList<Goods> goodsList	= new ArrayList<Goods>();
		goodsList.add(new Book("book", "これからのJava"  , 2300, "大日本技術社"));		// 商品リストに商品を追加する
		goodsList.add(new Book("book", "UML技術完成"     , 3500, "ﾃｯｸﾌﾟﾗｽ"));

		String test;

		System.out.println();
		System.out.println("** S3_4のShoppingBagクラスの単体テスト **");

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
		if( money == shoppingBag.getMoney() && goodsList.equals(shoppingBag.getBuyGoodsList())){
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
		shoppingBag = new ShoppingBag(money);
		shoppingBag.setBuyGoodsList(goodsList);
		int num1 = shoppingBag.getBuyGoodsList().size();
		shoppingBag.setGoods(new Book("book", "これからのJava"  , 2300, "大日本技術社"));		// 商品リストに商品を追加する
		shoppingBag.setGoods(new Book("book", "UML技術完成"     , 3500, "ﾃｯｸﾌﾟﾗｽ"));
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

		// Test6:業務ロジック removeGoods()のテスト
		System.out.println("---");
		test = "NG";
		num1 = shoppingBag.getBuyGoodsList().size();
		shoppingBag.removeGoods("これからのJava");
		num2 = shoppingBag.getBuyGoodsList().size();
		if(num1-num2 == 1){
			test = "OK";
		}
		System.out.println("Test6:業務ロジック removeGoods()のテスト = " + test);
		try{
			shoppingBag.printShoppingBag();
		}catch(MyException e){
			System.out.println(e.getMessage());
		}

		// Test7:業務ロジック clearGoods()のテスト
		System.out.println("---");
		test = "NG";
		shoppingBag.clearGoods();
		num2 = shoppingBag.getBuyGoodsList().size();
		if(num2 == 0){
			test = "OK";
		}
		System.out.println("Test7:業務ロジック clearGoods()のテスト = " + test);
		try{
			shoppingBag.printShoppingBag();
		}catch(MyException e){
			System.out.println(e.getMessage());
		}
	}
}
