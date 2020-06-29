package Create;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Acount.java
 *
 */

// 口座クラス
class Account {

    // メンバ変数
    String  name;       // 口座名義
    int     balance;    // 残高

    // 値の表示 メソッド
    void display() {
        System.out.println("口座名義：" + name);
        System.out.println("残高    ：" + balance);
    }

}
