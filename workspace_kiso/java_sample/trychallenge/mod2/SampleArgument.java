package mod2;

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
		String[] str = {"10","20"};//配列

		//合計の計算
		for(int i=0;i<2;i++) {
			int num = Integer.parseInt(args[i]);
			sum = sum + num;
		}

		System.out.println("合計：" + sum);
	}
}