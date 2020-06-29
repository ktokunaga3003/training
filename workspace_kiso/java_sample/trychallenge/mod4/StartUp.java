package mod4;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

// アプリケーションクラス　継承
class StartUp {
    public static void main(String[] args) {
        // SavingsAccountクラス（サブクラス）のオブジェクトの生成
    	SavingsAccount suzuki = new SavingsAccount("鈴木一郎", 10000, 5000);


        // スーパークラスのメソッド呼び出し
        // 口座名義の設定
    	//suzuki.setName("鈴木一郎");


    	// 口座情報の表示
    	suzuki.display();

        // サブクラスのメソッド呼び出し
        // 定期預金情報の表示
    	//suzuki.savingDisplay();
    	

    }
}
