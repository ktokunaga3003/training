/**
 * jp.co.flm.employee.common.EmployeeSystemException
 *
 * All Rights Reserved, Copyright Fujitsu Learning Media Limited
 */

package jp.co.flm.employee.common;

/**
 * システムエラー例外クラスです。
 * @author FLM
 * @version 1.0 2014/12/21
 */
public class EmployeeSystemException extends Exception {
	/**
	 * コンストラクタ
	 */
	public EmployeeSystemException() {

	}

	/**
	 * コンストラクタ
	 * @param message エラーメッセージ
	 */
	public EmployeeSystemException(String message) {
		super(message);
	}
}
