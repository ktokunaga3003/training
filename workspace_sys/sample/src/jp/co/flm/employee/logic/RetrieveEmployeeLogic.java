/**
 * jp.co.flm.employee.logic.RetrieveEmployeeLogic
 *
 * All Rights Reserved, Copyright Fujitsu Learning Media Limited
 */

package jp.co.flm.employee.logic;

import java.sql.Connection;
import java.sql.SQLException;

import jp.co.flm.employee.common.EmployeeBusinessException;
import jp.co.flm.employee.common.EmployeeSystemException;
import jp.co.flm.employee.dao.ConnectionManager;
import jp.co.flm.employee.dao.EmployeeDAO;
import jp.co.flm.employee.entity.Employee;

/**
 * 従業員情報を検索する業務クラスです。
 * @author FLM
 * @version 1.0 2014/12/21
 */
public class RetrieveEmployeeLogic {
	/**
	 * 従業員情報の1件検索を行う。
	 * @return 従業員情報
	 * @throws EmployeeSystemException
	 * @throws EmployeeBusinessException
	 */
	public Employee retrieveEmployee(int employeeid) throws EmployeeSystemException, EmployeeBusinessException {
		Connection  con = null ;
   		Employee employee = null;

		try {
			con = ConnectionManager.getConnection();
			EmployeeDAO edao = new EmployeeDAO(con);
			employee = edao.getEmployee(employeeid);

			// 検索結果がない場合、エラーを発生させる。
			if(employee == null ) {
				throw new EmployeeBusinessException("該当する従業員は存在しません。");
			}
		} catch(SQLException e) {
			e.printStackTrace();
			throw new EmployeeSystemException("システムエラーが発生しました。システム管理者に連絡してください。");
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch(SQLException e) {
					e.printStackTrace();
					throw new EmployeeSystemException("システムエラーが発生しました。システム管理者に連絡してください。");
				}
			}
		}

		return employee;
	}
}
