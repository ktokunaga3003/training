/**
 * jp.co.flm.employee.common.EmployeeBusinessException
 *
 * All Rights Reserved, Copyright Fujitsu Learning Media Limited
 */

package jp.co.flm.employee.common;

/**
 * 業務エラー例外クラスです。
 * @author FLM
 * @version 1.0 2014/12/21
 */
public class EmployeeBusinessException extends Exception {
	/**
	 * コンストラクタ
	 */
	public EmployeeBusinessException() {

	}

	/**
	 * コンストラクタ
	 * @param message エラーメッセージ
	 */
	public EmployeeBusinessException(String message) {
		super(message);
	}
}
