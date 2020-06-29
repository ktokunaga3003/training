package total2_5_1;

public class Total {

	public static void main(String[] args) {
		
		int[] test = {21,33,38,50,64,71,75,79,82,95};
		int total = 0, average = 0, i = 0;
		
		for(i = 0; i<test.length; i++) {
			total += test[i];
		}
		average = total / 10;
		System.out.println("合計："+ total);
		System.out.println("平均点："+average);
		
		for(i = 9; i>4; i--) {
			System.out.println("Test("+i+")："+test[i]);
		}

	}

}
