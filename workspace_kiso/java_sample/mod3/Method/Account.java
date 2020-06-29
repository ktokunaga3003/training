package Method;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Acount.java
 *
 */

// 口座クラス
class Account {

    // メンバ変数
    String  name;       // 口座名義
    int     balance;    // 残高

	// 預け入れ メソッド
    void deposit(int pMoney) {
        balance = balance + pMoney;
    }

	// 払い出し メソッド
    int withdraw(int pMoney) {
    	if( balance >= pMoney){
        	balance = balance - pMoney;
    		return pMoney;
    	} else {
    		return 0;
    	}
    }

    // 口座情報の表示 メソッド
    void display() {
        System.out.println("口座名義：" + name);
        System.out.println("残高    ：" + balance);
    }

}
