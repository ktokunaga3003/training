/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleSwitch.java
 *
 */

// switch文
class SampleSwitch{
	public static void main(String[] args) {
		int gender = 0;

		switch(gender) {
			case 0:			//genderの値が0の場合
				System.out.println("male");
				break;
			case 1:			//genderの値が1の場合
				System.out.println("female");
				break;

			default:		//genderの値が0と1以外の場合
				System.out.println("入力ミス");
		}
	}
}