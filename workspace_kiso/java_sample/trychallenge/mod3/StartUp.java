package mod3;

public class StartUp {

	public static void main(String[] args) {
		
		// コンストラクタ（p115~）
		Account suzuki = new Account("鈴木一郎");
		Account yamada = new Account("山田花子",10000);
		
		
		/*　コンストラクタ以前のコード
		Account suzuki = new Account();
		//Account yamada = new Account();
		
		//suzuki.name = "鈴木";
		//suzuki.balance = 10000;
		suzuki.setName("鈴木");
		suzuki.setBalance(10000);
		
		//yamada.name = "山田";
		//yamada.balance = 500000000;
		
		
		//suzuki.display();
		//yamada.display();
		//suzuki.deposit(3000);
		//suzuki.display();
		//int money = suzuki.withdraw(2000);
		//suzuki.display();
		//System.out.println("引き出したお金は"+money+"円です");
		
		
		String name = suzuki.getName();
		int balance = suzuki.getBalance();
		
		System.out.println("getNameによる口座名義："+name);
		System.out.println("getBalanceによる残高："+balance);
		*/
	}

}
