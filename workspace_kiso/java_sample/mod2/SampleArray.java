/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleArray.java
 *
 */

// 配列
class SampleArray{
	public static void main(String[] args) {
		int sum = 0;	//合計
		int[] array = {10,20,30,40,50};

		for(int i=0;i<array.length;i++) {
			sum += array[i];      //sum=sum+array[i];と同じ
		}

		System.out.println("合計：" + sum);
	}
}