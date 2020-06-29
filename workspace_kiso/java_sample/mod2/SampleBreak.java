/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleBreak.java
 *
 */

// break文
class SampleBreak{
	public static void main(String[] args) {
		int sum = 0;		//合計

		//合計の計算　ただし、sumが3より大きくなった場合、強制的にループを抜ける
		for(int i = 1 ; i <= 5 ; i++) {
			sum = sum + i;
			if(sum > 3){
				break;
			}
			System.out.println("合計は" + sum + "です。");
		}
	}
}