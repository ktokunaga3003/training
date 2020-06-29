package mod3;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Acount.java
 *
 */

// 口座クラス
class Account {
	
		 // メンバ変数
    private String  name;       // 口座名義
    private int     balance;    // 残高
	
    // コンストラクタ（p115~）
	public Account() {}
	
	public Account(String name) {
		this.name = name;
	}
	
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	

   

	/*　コンストラクタ以前のコード
    public void setName(String pName) {
    	name = pName;
    }
    
    public void setBalance(int pBalance) {
    	balance = pBalance;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getBalance(){
    	return balance;
    }
    
    void deposit(int pMoney) {
    	balance = balance + pMoney; 
    }
    
    int withdraw(int pMoney) {
    	if(balance >= pMoney) {
    		balance = balance - pMoney;
    		return pMoney;
    	}else {
    		return 0;
    	}
    }
    
    // 値の表示 メソッド
    void display() {
        System.out.println("口座名義：" + name);
        System.out.println("残高    ：" + balance);
     
    }
    */

}
