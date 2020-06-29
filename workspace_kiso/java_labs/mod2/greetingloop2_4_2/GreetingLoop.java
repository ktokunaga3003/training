package greetingloop2_4_2;

public class GreetingLoop {

	public static void main(String[] args) {
		
		String[] array = {"おはよう","こんにちは","こんばんは"};
		
		for(int i=0; i < 5; i++) {
			for(String s : array) {
				System.out.print(s+"　");
			}
			System.out.println();
			}
	}

}
