package Aggregation;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

// アプリケーションクラス　集約
class StartUp {
    public static void main(String[] args) {
       Bank bank = new Bank("FLM銀行");		// 銀行オブジェクトを生成する
       bank.display();

       bank.createAccount("鈴木一郎", 1000);
       bank.accountDisplay();
    }
}