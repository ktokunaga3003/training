package stock3_1_3;

public class StartUp {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		
		stock.setCode("AA001");
		stock.setStockQuantity(1000);
		
		stock.print();

	}

}
