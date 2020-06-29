package mod2;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleSwitch.java
 *
 */

// switch文
class SampleSwitch{
	public static void main(String[] args) {
		int day = 1;

		switch(day) {
			case 1:			//dayの値が1の場合
				System.out.println("1日");
				break;
			case 2:			//dayの値が2の場合
				System.out.println("2日");
				break;

			default:		//dayの値が1と2以外の場合
				System.out.println("入力ミス");
		}
	}
}