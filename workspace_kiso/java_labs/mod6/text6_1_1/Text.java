package text6_1_1;

public class Text {

	public static void main(String[] args) {
		
		String str = "Hello!";
		
		System.out.println(str+" の文字列は "+str.length()+" です");
		
		if(args.length != 0) {
			for(int i=0; i<args.length; i++) {
				System.out.println(args[i]+" の文字列は "+args[i].length()+" です");
			}
		}
		

	}

}
