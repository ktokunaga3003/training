package s3_3;

/*********************************************************************
 *	S3_3
 *	S3_3TestBean.java
 *
 *	S3_3のBeanクラスの単体テスト用クラス
 *	テスト内容：
 *		Test1:引数のないコンストラクタのテスト
 *		Test2:その他のコンストラクタとゲッターのテスト
 *		Test3:ゲッター・セッターのテスト
 *		Test4:業務ロジック printGoods()のテスト
 *
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 *********************************************************************/

public class S3_3TestBean{

	public static void main(String[] args){
		Bean bean;
		String id = "bean";
		String goodsName = "ｷﾘﾏﾝｼﾞｪﾛ";
		int price  = 900;
		String taste = "苦味・酸味";

		String test;

		System.out.println();
		System.out.println("** S3_3のBeanクラスの単体テスト **");

		// Test1:引数のないコンストラクタのテスト
		System.out.println("---");
		test = "NG";
		bean = new Bean();
		if(bean != null){
			test = "OK";
		}
		System.out.println("Test1:引数のないコンストラクタのテスト = " + test);

		// Test2:その他のコンストラクタとゲッターのテスト
		System.out.println("---");
		test = "NG";
		bean = new Bean(id, goodsName, price, taste);
		if(bean != null && id.equals(bean.getId()) && goodsName.equals(bean.getGoodsName()) && price == bean.getPrice() && taste.equals(bean.getTaste()) ){
			test = "OK";
		}
		System.out.println("Test2:その他のコンストラクタとゲッターのテスト = " + test);

		// Test3:ゲッター・セッターのテスト
		System.out.println("---");
		test = "NG";
		bean = new Bean();
		bean.setId(id);
		bean.setGoodsName(goodsName);
		bean.setPrice(price);
		bean.setTaste(taste);
		if(id.equals(bean.getId()) && goodsName.equals(bean.getGoodsName()) && price == bean.getPrice() && taste.equals(bean.getTaste()) ){
			test = "OK";
		}
		System.out.println("Test3:ゲッター・セッターのテスト = " + test);

		// Test4:業務ロジック printGoods()のテスト
		System.out.println("---");
		bean = new Bean();
		bean.setId(id);
		bean.setGoodsName(goodsName);
		bean.setPrice(price);
		bean.setTaste(taste);
		System.out.println("Test4:業務ロジック printGoods()のテスト");
		System.out.println("↓次の行に、「(Bean)情報」が表示されていればテストOK");
		bean.printGoods();
	}
}
