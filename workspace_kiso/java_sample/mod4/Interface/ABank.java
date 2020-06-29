package Interface;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * ABank.java
 *
 */

// ABank ATMインタフェース実装クラス
class ABank implements ATM{
	private String    no;		// 口座番号
	private int    balance;		// 残高

	// コンストラクタ
	public ABank() {}
	// コンストラクタ
	public ABank(String no, int balance) {
		this.no       = no;
		this.balance  = balance;
	}

	// 預け入れ メソッド オーバーライド
	public void deposit(int pMoney) {
		balance += pMoney;
		System.out.println("A銀行 預け入れ処理");
		System.out.println("残高    :" + balance);
	}
	// 払い出し メソッド オーバーライド
	public void withdraw(int pMoney) {
		balance -= pMoney;
		System.out.println("A銀行 払い出し処理");
		System.out.println("残高    :" + balance);
	}
}