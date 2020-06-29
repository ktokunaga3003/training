package mod3;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleAccount.java
 *
 */

// 口座クラス
class SampleAccount {
 // メンバ変数
    String  name;         // 口座名義
    int     balance;      // 残高

    // 口座情報の表示　メソッド
    public void display() {
        System.out.println("口座名義：" + name);
        System.out.println("残高    ：" + balance );
    }

}
