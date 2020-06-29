package Create;

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

        //メンバ変数に値を代入
        suzuki.name = "鈴木一郎";

        // メッセージ送信（メソッド呼び出し）
        suzuki.display();

    }

}
