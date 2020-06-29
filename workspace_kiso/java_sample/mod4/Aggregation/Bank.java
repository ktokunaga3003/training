package Aggregation;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Bank.java
 *
 */

// 銀行クラス
class Bank {
    // メンバ変数
    private String  bankName;        // 銀行名
    private Account account;     	 // 口座（集約）

    // コンストラクタ  引数を持たない（デフォルトコンストラクタ）
    public Bank(){
    }
    // コンストラクタ  1つの引数を持つ
    public Bank(String bankName) {
    	this.bankName = bankName;
    }

    // 口座を追加する
    public void createAccount(String name, int balance) {
    	account = new Account(name, balance);	//口座オブジェクトの生成

    	//Account account = new Account(name,bakance);
    	//注意！上記のaccount変数はローカル変数
    }
    // 値（銀行名）の設定　メソッド
    public  void setBankName(String bankName) {
        this.bankName = bankName;
    }
	// 値（銀行名）の参照　メソッド
    public String getBankName() {
        return bankName;
    }
	// 銀行情報の表示　メソッド
    public void display() {
        System.out.println("銀行名  ：" + bankName);
    }
    // 口座情報の表示　メソッド
    public void accountDisplay() {
    	account.display();
    }
}