package mod6;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Account.java
 *
 */

// 口座クラス
class Account {
	private String      id;		// 口座番号
	private int   balance;		// 残高

	// コンストラクタ
	public Account(String pId,int pBalance) {
		id = pId;
      	balance = pBalance;
    }

   // 口座情報の表示　メソッド
   public void print() {
       System.out.println("ID      : " + id);
       System.out.println("Balance : " + balance);
   }
}
