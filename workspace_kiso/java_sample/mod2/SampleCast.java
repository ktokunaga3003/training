/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleCast.java
 *
 */

// 基本データ型のキャスト
class SampleCast{
	public static void main(String[] args){

		int intValue = 100;				//int型
		long longValue = 200L;			//long型


		//暗黙的型変換
		longValue = intValue;			//int型→long型に代入（暗黙的に変換）

		System.out.println("暗黙的変換：" + longValue);		//結果出力

		//明示的型変換
		intValue = (int)longValue ;			//long型→int型に代入（明示的に変換）

		System.out.println("明示的変換：" + intValue);		//結果出力
    }
}
