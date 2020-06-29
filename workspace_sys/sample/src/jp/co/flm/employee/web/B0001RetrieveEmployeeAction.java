/**
 * jp.co.flm.employee.web.B0001RetrieveEmployeeAction
 *
 * All Rights Reserved, Copyright Fujitsu Learning Media Limited
 */

package jp.co.flm.employee.web;

import javax.servlet.http.HttpServletRequest;

import jp.co.flm.employee.common.EmployeeBusinessException;
import jp.co.flm.employee.common.EmployeeSystemException;
import jp.co.flm.employee.entity.Employee;
import jp.co.flm.employee.logic.RetrieveEmployeeLogic;

/**
 * 従業員検索画面の検索ボタンが押された場合のアクションクラスです。
 * @author FLM
 * @version 1.0 2014/12/21
 */
public class B0001RetrieveEmployeeAction {
	public String execute(HttpServletRequest request) {
		String page = "/employee-retrieve.jsp";

		// クライアントの入力値を取得する。
		String employeeid = request.getParameter("ID");
		int empid = 0;

		if(employeeid != null && employeeid.equals("")) {
			// 未入力の場合、エラーメッセージをリクエストスコープに設定し、
			// エラーページを返却する。
			request.setAttribute("message", "従業員IDが未入力です。");
			return page;
		} else {
			// 入力値を数値に変換できない場合、エラーメッセージをリクエストスコープに設定し、
			// エラーページを返却する。
			try {
				empid = Integer.parseInt(employeeid);
			} catch(NumberFormatException e) {
				request.setAttribute("message", "従業員IDの入力に誤りがあります。");
				return page;
			}
		}

		try {
			// 従業員検索用の業務ロジックを生成し、メソッドを呼び出す。
			RetrieveEmployeeLogic logic = new RetrieveEmployeeLogic();
			Employee employee = logic.retrieveEmployee(empid);

			// 検索結果をリクエストスコープに設定する。
			request.setAttribute("employee", employee);

			// 結果画面を戻り値に設定する。
			page = "/employee-retrieve-view.jsp";
		} catch(EmployeeBusinessException e) {
			e.printStackTrace();
			request.setAttribute("message", e.getMessage());
		} catch(EmployeeSystemException e) {
			request.setAttribute("message", e.getMessage());
			page = "/error.jsp";
		}
		return page;
	}
}
