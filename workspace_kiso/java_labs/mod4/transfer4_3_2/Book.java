package transfer4_3_2;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Book.java
 *
 */

public class Book{

	//メンバ変数
	private String title;	//タイトル
	private String author;	//著者名

	//コンストラクタ
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}

	//タイトルと著者を表示
	public void display(){
		System.out.println("タイトル：" + title);
		System.out.println("著者名：" + author);
	}

	//タイトルをセットする
	public void setTitle(String title){
		this.title = title;
	}

	//タイトルを取得する
	public String getTitle(){
		return title;
	}

	//著者名をセットする
	public void setAuthor(String author){
		this.author = author;
	}

	//著者名を取得する
	public String getAuthor(){
		return author;
	}

}