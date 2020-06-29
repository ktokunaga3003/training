package mod6;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleString.java
 *
 */

//Stringクラス（メソッドを使う）
class SampleString{
	public static void main(String[] args){

		//文字列の変数の宣言と初期化
		String name = "Hello";
		
		//文字列の比較
		if(name.equals("Hello")) {
			System.out.println("一致");
		}else {
			System.out.println("不一致");
		}


		//変数nameに格納された文字列の文字数を出力
		System.out.println("文字列の長さ："+name.length());



	}
}
