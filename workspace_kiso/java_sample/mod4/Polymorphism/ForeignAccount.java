package Polymorphism;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * TimeDeposit.java
 *
 */

// 外貨預金クラス （サブクラス）
class ForeignAccount extends Account {
    // 追加メンバ変数
    private String     type;     // 外貨の種類

    // コンストラクタ 3つの引数を持つ
    public ForeignAccount(String name, int balance, String type) {
       super(name, balance);        // スーパークラスのコンストラクタ呼び出し
       this.type = type;
    }

    // 値（外貨の種類）の設定 メソッド
    public void setType(String type) {
    	this.type = type;
    }
    // 値（外貨の種類）の取得 メソッド
   	public String getType() {
   		return type;
   	}

    // 外貨預金情報の表示 メソッド
    public  void display() {
    	System.out.println("口座名義:" + getName());
    	System.out.println("残高    :" + getBalance() + type);
        System.out.println("外貨種類:" + type);
    }
}
