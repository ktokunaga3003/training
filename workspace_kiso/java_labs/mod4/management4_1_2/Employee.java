package management4_1_2;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Employee.java
 *
 */

class Employee{

	//メンバ変数
	private int id;
	private String name;
	private String section;
	private String phone;

	//コンストラクタ（引数なし）
	public Employee(){
	}

	//コンストラクタ（引数4つ）
	public Employee(int id,String name,String section,String phone) {
		this.id = id;
		this.name = name;
		this.section = section;
		this.phone = phone;
	}

	//表示メソッド
	public void print(){
		System.out.println("ID     :"+id);
		System.out.println("NAME   :"+name);
		System.out.println("SECTION:"+section);
		System.out.println("PHONE  :"+phone);
	}
}
