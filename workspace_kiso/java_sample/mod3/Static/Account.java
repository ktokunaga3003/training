package Static;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Account.java
 *
 */

// 口座クラス
class Account {
    // インスタンス変数
    private String  name;       // 口座名義
    private int     balance;    // 残高

    // static変数
    private static double interest = 0.25;  // 預金金利

    // コンストラクタ
    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    // 値の表示　インスタンスメソッド
    public void instanceDisplay() {
        System.out.println("インスタンスメソッド");
        // static変数の参照
        System.out.println("預金金利：" + interest + "%");
        System.out.println("口座名義：" + name);
        System.out.println("残高    ：" + balance );
    }
    // 値の表示　 staticメソッド
    public static void staticDisplay(){
        System.out.println("staticメソッド");
        System.out.println("預金金利：" + interest + "%");
        // インスタンス変数の参照不可
        // System.out.println("口座名義：" + name);
        // System.out.println("残高    ：" + balance );
    }
}
