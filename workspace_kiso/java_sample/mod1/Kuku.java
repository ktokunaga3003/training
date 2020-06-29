/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Kuku.java
 *
 */

// 九九クラス
class Kuku {
	public static void main(String[] args) {
		//タイトル
		System.out.println("---------------------------------");
		System.out.println("　　　　　　九九の表");
		System.out.println("---------------------------------");

		//九九の表示
		for( int i=1; i<=9; i++ ) {
			System.out.print(i + "の段：");
			for( int j=1; j<=9; j++ ) {
				if( i*j <10){
					System.out.print(" " + i*j + " ");
				}else{
					System.out.print(i*j + " ");
				}
			}
			System.out.println();
		}
	}
}
