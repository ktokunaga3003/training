package testresult2_2_2;

public class TestResult {

	public static void main(String[] args) {
		
		//int score = 80;
		//int score = 65;
		int score = 45;
		
		if(score >= 70) {
			System.out.println("優");
		}else if(score < 70 && score >= 50) {
			System.out.println("良");
		}else{
			System.out.println("可");
		}

	}

}
