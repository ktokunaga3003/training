package Polymorphism;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

// アプリケーションクラス  ポリモフィズム
class StartUp {
    public static void main(String[] args) {
    	// 定期預金オブジェクトを生成する
    	SavingsAccount savings = new SavingsAccount("鈴木一郎",1000,5);
    	Account  account = savings;                              // スーパークラスへサブクラスの参照代入
    	account.display();									     // ポリモフィズム

    	System.out.println();

    	// 外貨預金オブジェクトを生成する
    	ForeignAccount foreign = new ForeignAccount("山田花子",3000,"ドル");
    	account  =  foreign;                                    // スーパークラスへサブクラスの参照代入
        account.display();									    // ポリモフィズム



    	 // オブジェクト型の配列
         // Account[] accounts  = new Account[2];
         // accounts[0]     = new SavingsAccount("鈴木一郎",1000,5);
         // accounts[1]     = new ForeignAccount("山田花子",3000,"ドル");
    	 // for(int i = 0; i < accounts.length; i++ ) {
    	  //     accounts[i].display();                         	// ポリモフィズム
         // }

    }
}