package phone4_2_1;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

class StartUp {

	public static void main(String[] args) {

		//MobilePhoneクラスのオブジェクト生成
		MobilePhone mp =new MobilePhone();

		//call()メソッドの呼び出し
		System.out.println("-callメソッドの呼び出し-");
		mp.call("03-1234-5678");

		System.out.println();

		//shot()メソッドの呼び出し
		System.out.println("-shotメソッドの呼び出し-");
		mp.shot();
	}

}
