package Capsule;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

// アプリケーションクラス　データ隠ぺい（カプセル化）
class StartUp {
    public static void main(String[] args) {
        Account suzuki = new Account();

        suzuki.setName("鈴木一郎");
        suzuki.setBalance(1000);
        suzuki.display();

        // privateメンバ変数の参照（アクセスできない）
        // suzuki.name = "鈴木一郎";
        // suzuki.balance = 1000;

        // publicメソッドによるメンバ変数参照
        String name = suzuki.getName();
        System.out.println("getName()による口座名義 ：" + name);
        // 上記2行を1行にまとめる
        // System.out.println("getName()による口座名義 ：" + suzuki.getName());

        int balance = suzuki.getBalance();
        System.out.println("getBalance()による残高  ：" + balance);
        // 上記2行を1行にまとめる
        // System.out.println("getBalance()による残高  ：" + suzuki.getBalance());
    }
}