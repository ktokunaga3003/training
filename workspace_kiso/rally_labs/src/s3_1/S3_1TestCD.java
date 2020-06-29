package s3_1;

/*********************************************************************
 *	S3_1
 *	S3_1TestCD.java
 *
 *	S3_1のCDクラスの単体テスト用クラス
 *	テスト内容：
 *		Test1:引数のないコンストラクタのテスト
 *		Test2:その他のコンストラクタとゲッターのテスト
 *		Test3:ゲッター・セッターのテスト
 *		Test4:業務ロジック printGoods()のテスト
 *
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 *********************************************************************/

public class S3_1TestCD{

	public static void main(String[] args){
		CD cd;
		String id = "cd";
		String goodsName = "B列車でいこう";
		int price  = 2820;
		String category = "JAZZ";

		String test;

		System.out.println();
		System.out.println("** S3_1のCDクラスの単体テスト **");

		// Test1:引数のないコンストラクタのテスト
		System.out.println("---");
		test = "NG";
		cd = new CD();
		if(cd != null){
			test = "OK";
		}
		System.out.println("Test1:引数のないコンストラクタのテスト = " + test);

		// Test2:その他のコンストラクタとゲッターのテスト
		System.out.println("---");
		test = "NG";
		cd = new CD(id, goodsName, price, category);
		if(cd != null && id.equals(cd.getId()) && goodsName.equals(cd.getGoodsName()) && price == cd.getPrice() && category.equals(cd.getCategory()) ){
			test = "OK";
		}
		System.out.println("Test2:その他のコンストラクタとゲッターのテスト = " + test);

		// Test3:ゲッター・セッターのテスト
		System.out.println("---");
		test = "NG";
		cd = new CD();
		cd.setId(id);
		cd.setGoodsName(goodsName);
		cd.setPrice(price);
		cd.setCategory(category);
		if(id.equals(cd.getId()) && goodsName.equals(cd.getGoodsName()) && price == cd.getPrice() && category.equals(cd.getCategory()) ){
			test = "OK";
		}
		System.out.println("Test3:ゲッター・セッターのテスト = " + test);

		// Test4:業務ロジック printGoods()のテスト
		System.out.println("---");
		cd = new CD(id, goodsName, price, category);
		System.out.println("Test4:業務ロジック printGoods()のテスト");
		System.out.println("↓次の行に、「(CD)情報」が表示されていればテストOK");
		cd.printGoods();
	}
}
