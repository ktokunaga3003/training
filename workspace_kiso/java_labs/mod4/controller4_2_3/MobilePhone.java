package controller4_2_3;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * MobliePhone.java
 *
 */

class MobilePhone extends BasePhone{

	//コンストラクタ（引数１つ）
	public MobilePhone(String name){
		super(name);
		System.out.println(name + "さんの携帯電話です。");
	}

	//Phoneインタフェースからオーバーライドしたcall()メソッド
	public void call(){
		System.out.println(name + "さんの携帯電話が鳴ります。");
	}
}