/**
 * jp.co.flm.employee.dao.EmployeeDAO
 *
 * All Rights Reserved, Copyright Fujitsu Learning Media Limited
 */

package jp.co.flm.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jp.co.flm.employee.entity.Employee;

/**
 * EMPLOYEEテーブルを利用するDAOクラスです。
 * @author FLM
 * @version 1.0 2014/12/21
 */
public class EmployeeDAO {
	/** コネクション */
	private Connection con;

	/**
	 * コンストラクタ
	 * @param con コネクション
	 */
	public EmployeeDAO(Connection con) {
		this.con = con;
	}

	/**
	 *  従業員IDによる1件検索を行う。
	 * @param employeeid 従業員ID
	 * @return 従業員情報
	 * @throws SQLException
	 */
	public Employee getEmployee(int employeeid) throws SQLException {
		// SQL文の準備
		String sql = "SELECT * FROM employee WHERE employeeid = ?";
		ResultSet res = null;
		PreparedStatement stmt = null;
		Employee employee = null;

		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, employeeid);
			// SQL文を実行する。
			res = stmt.executeQuery();

			if(res.next()) {
				// 従業員情報を作成する。
				employee = new Employee(
											res.getInt("employeeid"),
											res.getString("employeename"),
											res.getString("section"),
											res.getString("phone")
										);
			}
		} catch(SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
				if(res != null) {
					res.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			}

			return employee;
		}
}
