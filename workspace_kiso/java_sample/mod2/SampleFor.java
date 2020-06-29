/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleFor.java
 *
 */

// for文
class SampleFor{
	public static void main(String[] args) {
		int sum = 0;	//合計

		//iの値を加算する
		for(int i = 1 ; i <= 5 ; i++) {
			sum = sum + i;
		}
		System.out.println("合計：" + sum);
	}
}