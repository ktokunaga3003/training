package findemployee5_1_4;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

public class StartUp{
	public static void main(String[] args) {

		Manager mgr = new Manager();	// マネージャオブジェクトの作成

		if( args.length != 1) {
			System.out.println("Usage : java StartUp <従業員番号>");
		}else{
			try{
				// 文字列→数値変換
				int id = Integer.parseInt(args[0]);
				// 従業員オブジェクトを検索
				Employee emp = mgr.findEmployee(id);
				// 見つかったらオブジェクトの情報を表示
				emp.print();
			}catch(NotFoundException e){
				// 見つからなかったら例外メッセージを表示
				System.out.println( e.getMessage() );
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
