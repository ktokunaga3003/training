package stock3_1_3;

public class Stock {

	private String code;
	private int stockQuantity;


	void setCode(String pCode) {
		code = pCode;
	}

	void setStockQuantity(int pStockQuantity) {
		stockQuantity = pStockQuantity;
	}

	void print() {
		System.out.println("商品コード　　："+code);
		System.out.println("在庫数　　　："+stockQuantity);
	}
}
