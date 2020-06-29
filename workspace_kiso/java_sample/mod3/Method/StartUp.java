package Method;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

// アプリケーションクラス　オブジェクトの生成とメッセージ送信
class StartUp {

    public static void main(String[] args) {

        // 口座オブジェクトの生成
        Account suzuki;				//1行で記述
        suzuki = new Account();		//Account suzuki = new Account();

        // メンバ変数に値を代入
        suzuki.name = "鈴木一郎";
        suzuki.balance = 1000;

        // 口座情報の表示メソッド呼び出し
        suzuki.display();

		// 預け入れメソッド呼び出し
        suzuki.deposit(3000);

        // 口座情報の表示メソッド呼び出し
        suzuki.display();

    	// 払い出しメソッド呼び出し
        int money = suzuki.withdraw(3000);

        // 引き出し金額の表示
    	System.out.println("引き出した金額は" + money + "円です。");

    	// 口座情報の表示メソッド呼び出し
        suzuki.display();

    }

}
