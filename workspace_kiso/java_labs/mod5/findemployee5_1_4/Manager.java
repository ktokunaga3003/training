package findemployee5_1_4;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Manager.java
 *
 */

public class Manager {

	// 管理する従業員オブジェクトの配列
	private Employee[] empList = {
                new Employee(922101,"Okada"  ,"Education"  ,"7700-2258"),
                new Employee(922102,"Tamura" ,"Education"  ,"7700-2258"),
                new Employee(922103,"Matsuda","Development","7712-4418"),
                new Employee(922104,"Asai"   ,"Development","7712-4416"),
                new Employee(922105,"Matsuda","Promotion"  ,"7714-2214"),
                new Employee(922106,"Natsuki","Promotion"  ,"7714-2214")
	};

	// コンストラクタ(引数なし)
	public Manager(){}

	// 従業員検索 メソッド
	// ①NotFoundExceptionをスローするメソッドを追加する

	public Employee findEmployee(int id){
		int i;
		Employee target = null;
		for(Employee emp : empList){
			// IDが一致する従業員オブジェクトがあれば、戻り値に設定してループを抜ける
			if( id == emp.getId() ) {
				target = emp;
				break;
			}
		} //該当従業員オブジェクトをリターンする
		return target;
	}
}
