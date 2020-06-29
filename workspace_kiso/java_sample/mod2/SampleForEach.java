/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleForEach.java
 *
 */

// 拡張for文
class SampleForEach{
	public static void main(String[] args) {
		int[] array = {3, 5, 4, 13, 75};

		//拡張for文
		for(int n : array) {
			System.out.print(n + ", ");
		}

		//for文
		//for(int i=0; i<array.length; i++) {
		//	System.out.print(n + ", ");
		//}

	}
}