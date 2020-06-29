package mod4;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SavingsAccount.java
 *
 */

// 定期預金クラス
class SavingsAccount extends Account {
    // 追加メンバ変数 定期預金残高
	private int timeBalance;
	
	public SavingsAccount() {}
	
	public SavingsAccount(String name, int balance, int timeBalance) {
		super(name, balance);
		this.timeBalance = timeBalance;
	}
	
	public void setTimeBalance(int timeBalance) {
		this.timeBalance = timeBalance;
	}
	
	public int getTimeBalance() {
		return timeBalance;
	}

    // 定期預金情報の表示 メソッド
	public void display() {
		super.display();
		System.out.println("定期預金残高："+timeBalance);
	}
	/*public void savingDisplay(){
		System.out.println("定期預金残高："+timeBalance);
	}*/
	
}
