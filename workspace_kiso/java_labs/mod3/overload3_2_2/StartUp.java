package overload3_2_2;

public class StartUp {

	public static void main(String[] args) {
		
		Stock stock1 = new Stock("AA001");
		Stock stock2 = new Stock("BB001",2000);
		
		stock1.print();
		stock2.print();

	}

}
