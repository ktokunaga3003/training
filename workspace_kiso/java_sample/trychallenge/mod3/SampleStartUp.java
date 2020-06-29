package mod3;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleStartUp.java
 *
 */

// アプリケーションクラス　
class SampleStartUp {
    public static void main(String[] args) {

        //クラスからオブジェクトを生成する（一人目）
        SampleAccount suzuki = new SampleAccount();

        //オブジェクトを利用する
		suzuki.name = "鈴木";
        suzuki.display();

    	//クラスからオブジェクトを生成する（二人目）
        SampleAccount tokunaga = new SampleAccount();
        tokunaga.name = "徳永";
        tokunaga.display();


    	//オブジェクトを利用する


    }
}