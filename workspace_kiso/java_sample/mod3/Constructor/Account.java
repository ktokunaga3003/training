package Constructor;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Account.java
 *
 */

// 口座クラス
class Account {
 // メンバ変数
    private String  name;         // 口座名義
    private int     balance;      // 残高

   	// コンストラクタ 引数を持たない
    public Account() {
    	name = "無記名";
    }
   	// コンストラクタ 1つの引数を持つ
    public Account(String pName) {
        name = pName;
    }
    // コンストラクタ 2つの引数を持つ
    public Account(String pName, int pBalance) {
        name = pName;
        balance = pBalance;
    }

    // 口座情報の表示 メソッド
    public void display() {
        System.out.println("口座名義：" + name);
        System.out.println("残高    ：" + balance );
    }

}
