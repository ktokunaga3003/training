package mod5;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * ErrorSample.java
 *
 */

public class ErrorSample{
	public static void main(String[] args){
		try {
			//変数の定義
			int a = 100;
			//ゼロ除算を行う
			int b = a / 0;

			//存在しないオブジェクトのメソッドを実行する
			Account ac = null;
			ac.display();
		}catch(ArithmeticException e) {
			System.out.println("ゼロ徐算はできません");
		}catch(NullPointerException e) {
			System.out.println("存在しないオブジェクトのメソッドは実行できません");
		}

	}
}