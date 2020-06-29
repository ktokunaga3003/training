/**
 * jp.co.flm.employee.dao.TestEmployeeDAO01
 *
 * All Rights Reserved, Copyright Fujitsu Learning Media Limited
 */

package jp.co.flm.employee.dao;

import java.sql.Connection;

import jp.co.flm.employee.entity.Employee;

/**
 * getEmployee()のテスト用クラスです。
 * @author FLM
 * @version 1.0 2014/12/21
 */
public class TestEmployeeDAO01 {
	public static void main(String[] args) throws Exception {

		// コマンドライン引数を確認する。
		if (args.length != 1) {
			System.out.println("使い方: java jp.co.flm.employee.TestEmployeeDAO01 <従業員ID>");
			System.exit(1);
		}

		// コマンドライン引数を取得する。
		int id = Integer.parseInt(args[0]);

		Connection con = null;
		try {
			// データベースに接続する。
			con = ConnectionManager.getConnection();

			// 単体テスト対象クラスのオブジェクトを生成する。
			EmployeeDAO edao = new EmployeeDAO(con);

			// トランザクションを開始する。（※テーブル更新時のみ）
			//con.setAutoCommit(false);

			// 単体テスト対象メソッドを呼び出す。
			Employee employee = edao.getEmployee(id);
			System.out.println("従業員ID: " + employee.getEmployeeid());
			System.out.println("従業員名: " + employee.getEmployeename());
			System.out.println("部署名　: " + employee.getSection());
			System.out.println("電話番号: " + employee.getPhone());

			// トランザクションを確定する。（※テーブル更新時のみ）
			//con.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

			// トランザクションをロールバックする。（※テーブル更新時のみ）
			//con.rollback();
		} finally {
			// データベース接続を閉じる。
			if(con != null){
				con.close();
			}
		}
	}
}
