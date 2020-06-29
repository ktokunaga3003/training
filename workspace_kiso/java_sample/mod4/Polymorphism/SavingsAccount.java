package Polymorphism;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SavingsAccount.java
 *
 */

// 定期預金クラス （サブクラス）
class SavingsAccount extends Account {
    // 追加メンバ変数
    private int     time;     // 定期預金期間

    // コンストラクタ 3つの引数を持つ
    public SavingsAccount(String name, int balance, int time) {
       super(name, balance);        // スーパークラスのコンストラクタ呼び出し
       this.time = time;
    }

    // 値（定期預金期間）の設定 メソッド
    public void setTime(int time) {
    	this.time = time;
    }
    // 値（定期預金期間）の取得 メソッド
   	public int getTime() {
   		return time;
   	}

    // 定期預金情報の表示 メソッド
    public  void display() {
    	System.out.println("口座名義:" + getName());
    	System.out.println("残高    :" + getBalance());
        System.out.println("預金期間:" + time + "年");
    }
}
