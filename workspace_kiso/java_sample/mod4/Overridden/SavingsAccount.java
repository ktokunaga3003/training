package Overridden;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SavingsAccount.java
 *
 */

// 定期預金クラス （サブクラス）
class SavingsAccount extends Account {
    // 追加メンバ変数
    private int     timeBalance;     // 定期預金残高

    //コンストラクタ 3つの引数持つ
    public SavingsAccount(String name, int balance, int timeBalance) {
       super(name, balance);		// スーパークラスのコンストラクタ呼び出し
       this.timeBalance = timeBalance;
    }

    // 値（定期預金残高）の設定　メソッド
    public void setTimebalance(int timeBalance) {
    	this.timeBalance = timeBalance;
    }
    // 値（定期預金残高）の取得　メソッド
   	public int getTimeBalance() {
   		return timeBalance;
   	}

    // 定期預金情報の表示　メソッド(オーバーライド)
    public  void display() {
        //super.display();			// スーパークラスのdisplay()メソッド呼び出し
        System.out.println("定期預金残高：" + timeBalance );

    }
}
