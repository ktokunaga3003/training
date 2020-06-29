package argument2_4_3;

public class Argument {

	public static void main(String[] args) {
		
		int[] num = new int[2];
		for(int i = 0; i < args.length; i++) {
			num[i] = Integer.parseInt(args[i]);
		}
		System.out.println(num[0] + "+" + num[1] + "=" + (num[0]+num[1]));

	}

}
