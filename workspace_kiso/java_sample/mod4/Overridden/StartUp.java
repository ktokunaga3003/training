package Overridden;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

// アプリケーションクラス　オーバーライド
class StartUp {
    public static void main(String[] args) {
        // サブクラスのオブジェクトの生成
        SavingsAccount suzuki = new SavingsAccount("鈴木一郎", 1000, 5000);

        // オーバーライドメソッド呼び出し
        suzuki.display();
    }
}
