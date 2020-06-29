/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleString.java
 *
 */

// 参照型（String）
class SampleString{
	public static void main(String[] args){

		//文字列の変数の宣言と初期化
		String str1 = "Welcome To ";
		String str2 = "Java Education";
		String str3;

		str3 = str1 + str2;			//文字列の連結

		System.out.println("文字列の連結：" + str3);
    }
}
