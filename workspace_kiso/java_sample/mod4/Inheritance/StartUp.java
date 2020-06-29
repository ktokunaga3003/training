package Inheritance;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

// アプリケーションクラス　継承
class StartUp {
    public static void main(String[] args) {
        // サブクラスのオブジェクトの生成
        SavingsAccount suzuki = new SavingsAccount(5000);

        // スーパークラスのメソッド呼び出し
        suzuki.setName("鈴木一郎");
        suzuki.setBalance(1000);
        suzuki.display();

    	System.out.println();

        // サブクラスのメソッド呼び出し
        suzuki.savingDisplay();
    }
}
