/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleArgument.java
 *
 */

// コマンドライン引数
class SampleArgument{
	public static void main(String[] args) {
		int sum = 0;		//合計
		int count = args.length;	// 引数の個数（配列の要素数）

		//合計の計算
		for(int i=0;i<count;i++) {
			sum += Integer.parseInt(args[i]);	// 文字列を数値に変換
		}

		System.out.println("合計：" + sum);
	}
}