package s3_3;

/*********************************************************************
 *	S3_3
 *	S3_3TestCoffee_Shop.java
 *
 *	S3_3のCoffee_Shopクラスの単体テスト用クラス
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
import java.util.*;

public class S3_3TestCoffee_Shop{

	public static void main(String[] args){
		Coffee_Shop shop;
		String shopName = "珈琲館";
		String telNo = "06-6666-8888";
		String hours = "11:00～23:00";
		String holiday = "Sunday";
		int money = 750;
		String id = "bean";
		String goodsName = "ﾓｶ";
		String taste = "酸味・コク";
		ArrayList<Goods> goodsList	= new ArrayList<Goods>();

		String test;

		System.out.println();
		System.out.println("** S3_3のCoffee_Shopクラスの単体テスト **");

		// Test1:引数のないコンストラクタのテスト
		System.out.println("---");
		test = "NG";
		shop = new Coffee_Shop();
		if(shop != null){
			test = "OK";
		}
		System.out.println("Test1:引数のないコンストラクタのテスト = " + test);

		// Test2:その他のコンストラクタとゲッターのテスト
		System.out.println("---");
		test = "NG";
		shop = new Coffee_Shop(shopName, telNo, hours, holiday);
		if(shop != null && shopName.equals(shop.getShopName()) && telNo.equals(shop.getTelNo()) && hours.equals(shop.getHours()) && holiday.equals(shop.getHoliday())){
			test = "OK";
		}
		System.out.println("Test2:その他のコンストラクタとゲッターのテスト = " + test);

		// Test3:ゲッター・セッターのテスト
		System.out.println("---");
		test = "NG";
		shop = new Coffee_Shop();
		shop.setShopName(shopName);
		shop.setTelNo(telNo);
		shop.setHours(hours);
		shop.setHoliday(holiday);
		shop.setGoodsList(goodsList);
		if(shopName.equals(shop.getShopName()) && telNo.equals(shop.getTelNo()) && hours.equals(shop.getHours())
		   && holiday.equals(shop.getHoliday()) && goodsList.equals(shop.getGoodsList())){
			test = "OK";
		}
		System.out.println("Test3:ゲッター・セッターのテスト = " + test);

		// Test4:業務ロジック addGoods()のテスト
		System.out.println("---");
		test = "NG";
		shop = new Coffee_Shop(shopName, telNo, hours, holiday);
		shop.addGoods("bean", "ﾓｶ"         ,  750, "酸味・コク");
		shop.addGoods("bean", "ｷﾘﾏﾝｼﾞｪﾛ"   ,  900, "苦味・酸味");
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
		shop = new Coffee_Shop(shopName, telNo, hours, holiday);
		shop.addGoods("bean", "ﾓｶ"         ,  750, "酸味・コク");
		shop.addGoods("bean", "ｷﾘﾏﾝｼﾞｪﾛ"   ,  900, "苦味・酸味");

		System.out.println("Test5:業務ロジック printShop()のテスト");
		System.out.println("↓次の行に「商品情報」が複数表示されていればテストOK");
		shop.printShop();

		// Test6:業務ロジック saleGoods()のテスト
		System.out.println("---");
		ShoppingBag bag  = new ShoppingBag(money);
		ShoppingBag bag1 = new ShoppingBag(money + 1);
		ShoppingBag bag2 = new ShoppingBag(money);
		ShoppingBag bag3 = new ShoppingBag(money - 1);

		shop = new Coffee_Shop(shopName, telNo, hours, holiday);
		shop.addGoods(id, goodsName,  money, taste);
		shop.addGoods("bean", "ｷﾘﾏﾝｼﾞｪﾛ"   ,  900, "苦味・酸味");

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
