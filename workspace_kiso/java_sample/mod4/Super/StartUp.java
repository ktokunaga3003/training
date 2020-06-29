package Super;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

// アプリケーションクラス　スーパークラスのコンストラクタ呼び出し
class StartUp {
    public static void main(String[] args) {
        // サブクラスのオブジェクトの生成 （引数3つ持つコンストラクタの呼び出し）
        SavingsAccount suzuki = new SavingsAccount("鈴木一郎", 1000, 5000);

        // スーパークラスのメソッド呼び出し
        suzuki.display();

    	System.out.println();

        // サブクラスのメソッド呼び出し
        suzuki.savingDisplay();
    }
}
