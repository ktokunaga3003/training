package throws5_1_2;

public class MyThrows {
	
	private int[] number = {10,20,30,40};
	
	public int convertNumber(String s) throws NumberFormatException {
		int num = Integer.parseInt(s);
		return num;
	}
	
	public void exFunc(int num) throws ArrayIndexOutOfBoundsException {
		System.out.println("要素番号："+num+"の値は"+number[num]+"です");
	}

}
