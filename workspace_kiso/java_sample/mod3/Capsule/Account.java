package Capsule;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Account.java
 *
 */

// 口座クラス
class Account {
    // メンバ変数
    private String  name;         // 口座名義 (private指定)
    private int     balance;      // 残高     (private指定)

    // 値（口座名義）の設定　メソッド
    public  void setName(String pName) {
        name = pName;
    }
    // 値（残高）の設定　メソッド
    public  void setBalance(int pBalance) {
    	if(pBalance >= 0) {
    		 balance = pBalance;
    	}else {
    		balance = 0;
    	}
    }
    // 値（口座名義）の参照　メソッド
    public String getName() {
        return name;
    }
    // 値（残高）の参照　メソッド
    public int getBalance() {
        return balance;
    }
    // 口座情報の表示　メソッド
    public void display() {
        System.out.println("口座名義：" + name);
        System.out.println("残高    ：" + balance );
    }
}