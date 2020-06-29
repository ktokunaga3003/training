/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleCalc.java
 *
 */

// 演算子（算術演算子・代入演算子）
class SampleCalc{
	public static void main(String[] args){

		int sum = 255;				//=:代入演算子

		int hashval = sum % 100;	//%：算術演算子（剰余）

		System.out.println("計算結果:" + hashval);		//結果出力
    }
}
