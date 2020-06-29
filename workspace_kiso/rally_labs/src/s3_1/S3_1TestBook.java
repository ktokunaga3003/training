package s3_1;

/*********************************************************************
 *	S3_1
 *	S3_1TestBook.java
 *
 *	S3_1のBookクラスの単体テスト用クラス
 *	テスト内容：
 *		Test1:引数のないコンストラクタのテスト
 *		Test2:その他のコンストラクタとゲッターのテスト
 *		Test3:ゲッター・セッターのテスト
 *		Test4:業務ロジック printGoods()のテスト
 *
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 *********************************************************************/

public class S3_1TestBook{

	public static void main(String[] args){
		Book book;
		String id = "book";
		String goodsName = "これからのJava";
		int price  = 2300;
		String publisher = "大日本技術社";

		String test;

		System.out.println();
		System.out.println("** S3_1のBookクラスの単体テスト **");

		// Test1:引数のないコンストラクタのテスト
		System.out.println("---");
		test = "NG";
		book = new Book();
		if(book != null){
			test = "OK";
		}
		System.out.println("Test1:引数のないコンストラクタのテスト = " + test);

		// Test2:その他のコンストラクタとゲッターのテスト
		System.out.println("---");
		test = "NG";
		book = new Book(id, goodsName, price, publisher);
		if(book != null && id.equals(book.getId()) && goodsName.equals(book.getGoodsName()) && price == book.getPrice() && publisher.equals(book.getPublisher()) ){
			test = "OK";
		}
		System.out.println("Test2:その他のコンストラクタとゲッターのテスト = " + test);

		// Test3:ゲッター・セッターのテスト
		System.out.println("---");
		test = "NG";
		book = new Book();
		book.setId(id);
		book.setGoodsName(goodsName);
		book.setPrice(price);
		book.setPublisher(publisher);
		if(id.equals(book.getId()) && goodsName.equals(book.getGoodsName()) && price == book.getPrice() && publisher.equals(book.getPublisher()) ){
			test = "OK";
		}
		System.out.println("Test3:ゲッター・セッターのテスト = " + test);

		// Test4:業務ロジック printGoods()のテスト
		System.out.println("---");
		book = new Book(id, goodsName, price, publisher);
		System.out.println("Test4:業務ロジック printGoods()のテスト");
		System.out.println("↓次の行に、「(Book)情報」が表示されていればテストOK");
		book.printGoods();
	}
}
