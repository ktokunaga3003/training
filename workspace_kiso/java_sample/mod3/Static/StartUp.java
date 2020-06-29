package Static;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

// アプリケーションクラス　static変数とstaticメソッド
class StartUp {
    public static void main(String[] args) {

        // staticメソッドの呼び出し
        Account.staticDisplay();
        System.out.println();

        // 口座オブジェクトの生成
        Account suzuki = new Account("鈴木一郎",1000);
        // インスタンスメソッドの呼び出し
        suzuki.instanceDisplay();
    }
}
