package findemployee5_1_4;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Employee.java
 *
 */

public class Employee {

	//メンバ変数
	private int	         id;		// ID
	private String     name;		// 名前
	private String  section;		// 部署
	private String    phone;		// 内線

	// コンストラクタ(引数4つ)
	public Employee(int id,String name,String section,String phone){
		this.id      = id;
		this.name    = name;
		this.section = section;
		this.phone   = phone;
	}

	// IDの取得
	public int getId(){
		return id;
	}

	// 表示メソッド
	public void print(){
		System.out.println("ID     :" + id );
		System.out.println("NAME   :" + name);
		System.out.println("SECTION:" + section);
		System.out.println("PHONE  :" + phone);
	}

}
