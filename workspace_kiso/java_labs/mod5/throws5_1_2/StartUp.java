package throws5_1_2;

public class StartUp {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("要素数を1つ入力してください");
		}else {
		MyThrows mythrows = new MyThrows();
		
			try {
				int num = mythrows.convertNumber(args[0]);
				mythrows.exFunc(num);
			}catch(NumberFormatException e) {
				System.out.println("数値を入力してください");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("要素数を超えています");
			}
		
		}

	}

}
