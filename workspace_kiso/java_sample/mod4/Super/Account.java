package Super;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Account.java
 *
 */

// 口座クラス （スーパークラス）
class Account {
    // メンバ変数
    private String  name;         // 口座名義
    private int     balance;      // 残高

    // コンストラクタ  引数を持たない
    public Account() {
    	this.name = "なし";
    	this.balance = 0;
    }
    // コンストラクタ  ２つの引数を持つ
    public Account(String name, int balance) {
    	this.name = name;
    	this.balance = balance;
    }

    // 口座情報の表示　メソッド
    public void display() {
        System.out.println("口座名義：" + name);
        System.out.println("残高    ：" + balance );
    }
}