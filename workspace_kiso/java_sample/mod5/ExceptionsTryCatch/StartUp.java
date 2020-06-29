package ExceptionsTryCatch;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

class StartUp {
	public static void main(String[] args) {
		try{
			int sum = 0;		//合計
			int[] array = new int[3];

			array[0] = 100;
			array[1] = 200;
			array[2] = 300;
			array[3] = 400;		// ArrayIndexOutOfBoundsException

			for(int i = 0 ; i < array.length ; i++) {
				sum = sum + array[i];
			}
			System.out.println("合計：" + sum);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}