package s2_2;

public class Customer {

	private String customerName;            // 顧客名
	private ShoppingBag shoppingBag;  // 買い物かご情報

	// 引数のないコンストラクタ
	public Customer() {

	}

	// 引数があるコンストラクタ
	public Customer(String customerName) {
		this.customerName = customerName;
	}

	// 買い物かごの生成
	public void createBag(int money) {
		shoppingBag = new ShoppingBag(money);
	}

	// 顧客情報の表示
	public void printCustomer() {
		System.out.println("(Customer)  "+customerName+"さんの買い物かご");
		try{
			shoppingBag.printShoppingBag();
		}catch(MyException e){
			System.out.println(e.getMessage());
		}
		System.out.println();
	}

	// 商店情報の問い合わせ
	public void queryShop(Shop shop) {
		System.out.println("(Customer)  "+customerName+"「この店は何店ですか？」");
		shop.printShop();
		System.out.println();
	}

	public void buyGoods(Shop shop, String goodsName) {
		System.out.println("(Customer) "+customerName+"「"+goodsName+"をください。」");
		shop.saleGoods(goodsName, shoppingBag);
		System.out.println();
	}

	// セッター（顧客名）
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	// ゲッター（顧客名）
	public String getCustomerName() {
		return customerName;
	}

	// セッター（買い物かご情報）
	public void setShoppingBag(ShoppingBag shoppingBag){
		this.shoppingBag = shoppingBag;
	}

	// ゲッター（買い物かご情報）
	public ShoppingBag getShoppingBag() {
		return shoppingBag;
	}


}
