package controller4_2_3;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * BasePhone.java
 *
 */

abstract class BasePhone implements Phone{

	//メンバ変数
	protected String name;

	//コンストラクタ（引数1つ）
	public BasePhone(String name){
		this.name = name;
	}

	//Phoneインターフェースからオーバーライドしたstop()メソッド
	public void stop(){
		System.out.println(name + "さんの電話が切れます。");
	}
}