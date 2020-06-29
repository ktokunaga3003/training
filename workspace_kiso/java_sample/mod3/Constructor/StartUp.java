package Constructor;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

// アプリケーションクラス　コンストラクタの例題
class StartUp {
    public static void main(String[] args) {

        // 口座オブジェクトの生成 (1つの引数を持つコンストラクタ)
        Account suzuki = new Account("鈴木一郎");
        suzuki.display();

         // 口座オブジェクトの生成 (２つの引数を持つコンストラクタ)
        Account yamada = new Account("山田花子", 1000);
        yamada.display();
    }
}