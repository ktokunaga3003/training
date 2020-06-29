package mod5;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Account.java
 *
 */

// 口座クラス
class Account {
    // メンバ変数
    private String  name;         // 口座名義
    private int     balance;      // 残高

    //コンストラクタ  引数を持たない（デフォルトコンストラクタ）
    public Account(){
    }
    //コンストラクタ  ２つの引数を持つ
    public Account(String name , int balance){
    	this.name = name;
    	this.balance = balance;
    }

    // 値（口座名義）の設定　メソッド
    public  void setName(String name) {
        this.name = name;
    }
    // 値（残高）の設定　メソッド
    public  void setBalance(int balance) {
    	 this.balance = balance;
    }
    // 値（口座名義）の参照　メソッド
    public String getName() {
        return name;
    }
    // 値（残高）の参照　メソッド
    public int getBalance() {
        return balance;
    }

    // 口座情報の表示　メソッド
    public void display() {
        System.out.println("口座名義：" + name);
        System.out.println("残高    ：" + balance );
    }

	// 出金　メソッド(残高が負になる引き出しはできないようにする)
    public void withdraw(int money)  {
       balance = balance - money;
   }

}