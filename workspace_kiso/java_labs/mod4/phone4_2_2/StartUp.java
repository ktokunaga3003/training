package phone4_2_2;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

public class StartUp{
	public static void main(String[] args){

		//MobilePhoneクラスのオブジェクト生成
		MobilePhone mp = new MobilePhone("吉田");

		//call()メソッドの呼び出し
		System.out.println("-callメソッドの呼び出し-");
		mp.call();

		//stop()メソッドの呼び出し
		System.out.println("-stopメソッドの呼び出し-");
		mp.stop();
	}

}
