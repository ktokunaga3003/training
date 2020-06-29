package testandor2_2_3;

public class TestAndOr {

	public static void main(String[] args) {
		
		int test1,test2;
		test1=85;
		test2=90;
		
		if(test1 >= 80 && test2 >= 80) {
			System.out.println("よくできました！");
		}else if(test1 >= 80 || test2 >= 80) {
			System.out.println("あと少し！");
		}else {
			System.out.println("もう少し頑張りましょう！");
		}

	}

}
