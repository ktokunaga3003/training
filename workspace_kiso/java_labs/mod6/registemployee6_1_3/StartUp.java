package registemployee6_1_3;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

class StartUp {

	public static void main(String[] args) {

		Manager mgr = new Manager();

		// 従業員の登録
		mgr.registEmployee(922101,"Okada"  ,"Education"  ,"7700-2258");
		mgr.registEmployee(922102,"Tamura" ,"Education"  ,"7700-2258");
		mgr.registEmployee(922103,"Matsuda","Sales","7712-4418");
		mgr.registEmployee(922104,"Asai"   ,"Development","7712-4416");
		mgr.registEmployee(922105,"Matsuda","Promotion"  ,"7714-2214");

		// 登録した全従業員の情報表示
		mgr.printAllEmployee();

	}

}
