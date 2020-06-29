package Bank;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Account.java
 *
 */

// 口座クラス
class Account {
	private String name;		// 口座名義
	private int balance;		// 残高

	// コンストラクタ
	public Account(String name,int balance) {
		this.name = name;
      	this.balance = balance;
    }

	// 出金　メソッド(1000000以上引き出せないようにする)
    public void withdraw(int money) throws LimitException, InsufficiencyException {
       if(money >= 1000000){
          throw new LimitException("引き出し限度額オーバー");
       }
       
       if(balance < money) {
    	   throw new InsufficiencyException("残高不足");
       }
       balance -= money;
   }

   // 口座情報の表示　メソッド
   public void print() {
       System.out.println("Name    : " + name);
       System.out.println("Balance : " + balance);
   }
}
