package accessor3_1_2;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Employee.java
 *
 */

// 従業員クラス
class Employee {

	private int id;			// ID
	private String name;		// 名前
	private String section;		// 部署
	private String phone;		// 内線

	// 値（ID）の設定
	public void setId(int pId) {
		id = pId;
	}

	// 値（名前）の設定
	public void setName(String pName) {
		name = pName;
	}

	// 値（部署）の設定
	public void setSection(String pSection) {
		section = pSection;
	}

	// 値（内線）の設定
	public void setPhone(String pPhone) {
		phone = pPhone;
	}

	// 値（ID）の取得
	public int getId() {
		return id;
	}

	// 値（名前）の取得
	public String getName() {
		return name;
	}

	// 値（部署）の取得
	public String getSection() {
		return section;
	}

	// 値（内線）の取得
	public String getPhone() {
		return phone;
	}

	// 表示メソッド
	public void print(){
		System.out.println("ID     :" + id );
		System.out.println("NAME   :" + name);
		System.out.println("SECTION:" + section);
		System.out.println("PHONE  :" + phone);
	}

}
