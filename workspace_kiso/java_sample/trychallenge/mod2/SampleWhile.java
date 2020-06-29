package mod2;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleWhile.java
 *
 */

// While文
class SampleWhile{
	public static void main(String[] args) {
		int sum = 0;		//合計
		int i = 1;			//ループカウンタ

		//iが5以下の間、iの値を加算する
		while(i<=5){
			sum = sum + i;
			i=i+1;
		}
		System.out.println("合計：" + sum);
	}
}