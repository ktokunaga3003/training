/**
 * jp.co.flm.employee.entity.Employee
 *
 * All Rights Reserved, Copyright Fujitsu Learning Media Limited
 */

package jp.co.flm.employee.entity;

import java.io.Serializable;

/**
 * 従業員情報を管理するエンティティクラスです。
 * @author FLM
 * @version 1.0 2014/12/21
 */
public class Employee implements Serializable {
	/** 従業員ID */
	private int employeeid;
	/** 従業員名 */
	private String employeename;
	/** 部署 */
	private String section;
	/** 電話番号 */
	private String phone;


	/**
	 * コンストラクタ
	 */
	public Employee() {

	}

	/**
	 * コンストラクタ
	 * @param employeeid 従業員ID
	 * @param employeename 従業員名
	 * @param section 部署
	 * @param phone 電話番号
	 */
	public Employee(int employeeid, String employeename, String section, String phone) {
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.section = section;
		this.phone = phone;
	}

	/**
	 * 従業員IDを取得する。
	 * @return 従業員ID
	 */
	public int getEmployeeid() {
		return employeeid;
	}

	/**
	 * 従業員名を取得する。
	 * @return 従業員名
	 */
	public String getEmployeename() {
		return employeename;
	}

	/**
	 * 部署を取得する。
	 * @return 部署
	 */
	public String getSection() {
		return section;
	}

	/**
	 * 電話番号を取得する。
	 * @return 電話番号
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 従業員IDを設定する。
	 * @param employeeid 従業員ID
	 */
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	/**
	 * 従業員名を設定する。
	 * @param employeename 従業員名
	 */
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	/**
	 * 部署を設定する。
	 * @param section 部署
	 */
	public void setSection(String section) {
		this.section = section;
	}

	/**
	 * 電話番号を設定する。
	 * @param phone 電話番号
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
