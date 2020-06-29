package controller4_2_3;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * DeskPhone.java
 *
 */

class DeskPhone extends BasePhone{

	//コンストラクタ（引数1つ）
	public DeskPhone(String name){
		super(name);
		System.out.println(name + "さんの卓上電話です。");
	}

	//Phoneインタフェースからオーバーライドしたcall()メソッド
	public void call(){
		System.out.println(name + "さんの卓上電話が鳴ります。");
	}

}