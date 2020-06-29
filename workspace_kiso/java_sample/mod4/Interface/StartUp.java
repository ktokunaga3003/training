package Interface;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

// アプリケーションクラス　インタフェース
class StartUp {
    public static void main(String[] args) {
    	// A銀行オブジェクトを生成する
        ATM atm = new ABank("123456",5000);
        atm.deposit(1000);									// ポリモフィズム

    	// B銀行オブジェクトを生成する
        atm = new BBank("678912",7000);
        atm.deposit(1000);									// ポリモフィズム

        // インタフェース型の配列
        // ATM[] atm  = new ATM[2];
        // atm[0]     = new ABank("123456",5000);
        // atm[1]     = new BBank("678912",7000);
        // atm[0].deposit(1000);                              	// ポリモフィズム
        // atm[1].deposit(1000);								// ポリモフィズム
    }
}