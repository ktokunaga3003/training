package overload3_2_2;

public class Stock {
	
	private String code;
	private int stockQuantity;
	
	public Stock(String code) {
		this.code = code;
	}
	public Stock(String code,int stockQuantity) {
		this.code = code;
		this.stockQuantity = stockQuantity;
	}
	
	void setCode(String code) {
		this.code = code;
	}
	
	void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	
	String getCode() {
		return code;
	}
	
	int getStockQuantity() {
		return stockQuantity;
	}
	
	void reduceStock(int quantity) {
		if(stockQuantity >= quantity) {
			stockQuantity -= quantity;
		}else {
			stockQuantity = 0;
		}
	}
	
	void print() {
		System.out.println("商品コード　　："+code);
		System.out.println("在庫数　　　："+stockQuantity);
			}

}
