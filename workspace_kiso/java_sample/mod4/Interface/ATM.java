package Interface;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * ATM.java
 *
 */

// ATM インタフェース
interface ATM {
	// 預け入れる メソッドのシグニチャのみ定義
    void deposit(int pMoney) ;
    // 払い出す メソッドのシグニチャのみ定義
    void withdraw(int pMoney);
}

